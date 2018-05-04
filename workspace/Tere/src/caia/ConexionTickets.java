package caia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;

import py.gov.aduana.webservices.Autenticacion;

public class ConexionTickets {
	private DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

	public Autenticacion consultarTicket() {
		ConfigData cfg = new ConfigData();
		cfg.getPropValues();
		UtilLog.EscribirLOG("Obteniendo DatosTicket" );
		DatosTicketDTO datos = consultarTicketArchivo();
		if (datos != null) {
			Autenticacion aut = datos.getAutenticacion();
			aut.setCodAduana("");
			aut.setIdUsuario(cfg.getSIGNATURE_USER());
			return aut;
		}else{
			UtilLog.EscribirLOG("Usuario No autenticado" );
			String xml = connect();
			UtilLog.EscribirLOG("Generando XML..." + xml);
			guardarArchivo(xml, cfg.getARCHIVO_TICKETS());
			UtilLog.EscribirLOG("Convirtiendo XML..." + xml);
			datos = convertir(xml);
			UtilLog.EscribirLOG("Se convirtio xml...");
			UtilLog.EscribirLOG("Obteniendo Autenticacion...");
			Autenticacion aut = datos.getAutenticacion();
			UtilLog.EscribirLOG("Se obtuvo Autenticacion...");
			aut.setCodAduana("");
			aut.setIdUsuario(cfg.getSIGNATURE_USER());
			return aut;
		}
	}

	private DatosTicketDTO consultarTicketArchivo() {
		ConfigData cfg = new ConfigData();
		cfg.getPropValues();
		UtilLog.EscribirLOG("Leyendo Archivo Tickets..." + cfg.getARCHIVO_TICKETS());
		String contenido = leerArchivo(cfg.getARCHIVO_TICKETS());
		if (contenido == "") {
			UtilLog.EscribirLOG("No fue posible encontrar Ticket..." );
			return null;
		}

		DatosTicketDTO datos = convertir(contenido);
		UtilLog.EscribirLOG("Archivo Ticket Convertido: ");
		Calendar filtroFecha = Calendar.getInstance();
		filtroFecha.add(12, 10);
		if (filtroFecha.getTime().after(datos.getFechaFin())) {
			return null;
		}

		return datos;
	}

	private DatosTicketDTO convertir(String xml) {
		DatosTicketDTO datos = new DatosTicketDTO();
		try {
			InputStream in = new ByteArrayInputStream(xml.getBytes());
			XMLEventReader eventReader = XMLInputFactory.newInstance().createXMLEventReader(in);

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart().equals("expirationTime")) {
						event = eventReader.nextEvent();
						datos.setFechaFin(this.sdf.parse(event.asCharacters().getData().substring(0, 23)));

					} else if (event.asStartElement().getName().getLocalPart().equals("generationTime")) {
						event = eventReader.nextEvent();
						datos.setFechaInicio(this.sdf.parse(event.asCharacters().getData().substring(0, 23)));

					} else if (event.asStartElement().getName().getLocalPart().equals("token")) {
						event = eventReader.nextEvent();
						datos.getAutenticacion().setTicketWSAA(event.asCharacters().getData());

					} else if (event.asStartElement().getName().getLocalPart().equals("sign")) {
						event = eventReader.nextEvent();
						datos.getAutenticacion().setFirmaWSAA(event.asCharacters().getData());
					}
				}
			}

			eventReader.close();
		} catch (Exception ex) {
		}

		return datos;
	}

	private void guardarArchivo(String xml, String nombreArchivo) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
			bw.write(xml);
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String leerArchivo(String nombreArchivo) {
		try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

			String sCurrentLine;
			String contenido = "";

			while ((sCurrentLine = br.readLine()) != null) {
				contenido += sCurrentLine;
				System.out.println(sCurrentLine);
			}
			return contenido;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	private String connect() {
		try {
			ConfigData cfg = new ConfigData();
			cfg.getPropValues();

			WsaaClient wsaaClient = null;

			String signer = cfg.getSIGNATURE_USER();
			String keystoreFile = cfg.getKEY_STORE();
			String keystoreType = cfg.getKEY_STORE_TYPE();
			String keystorePass = cfg.getKEY_STORE_PASS();
			String signerpass = cfg.getKEY_STORE_PASS();
			String destDN = cfg.getWSAA_DN();
			String service = cfg.getWSAA_SVC();
			Long ticketTime = 3600000L;
			String loginURl = cfg.getWSAA_URL();

			wsaaClient = new WsaaClient();

			byte[] createCms = wsaaClient.createCms(keystoreFile, keystoreType, keystorePass, signer, signerpass, destDN, service, ticketTime);
			String xml = wsaaClient.invokeWsaa(createCms, loginURl);

			return xml;
		} catch (Exception ex) {
			String message = UtilLog.getStackTrace(ex);
			UtilLog.EscribirLOG("ERROR!!" + ex.getMessage() + " " + message);
			ex.printStackTrace();
		}
		return null;
	}
}
