package caia;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.FileHandler;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Endpoint;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.ws.policy.EndpointPolicyImpl;

import com.sun.istack.internal.logging.Logger;

import py.gov.aduana.webservices.Autenticacion;
import py.gov.aduana.webservices.IdManifiesto;
import py.gov.aduana.webservices.Recibo;
import py.gov.aduana.webservices.RetornoAgregarGuia;
import py.gov.aduana.webservices.RetornoAnularLote;
import py.gov.aduana.webservices.RetornoAsignarManifiesto;
import py.gov.aduana.webservices.RetornoConsultaGuia;
import py.gov.aduana.webservices.RetornoTransaccion;
import py.gov.aduana.webservices.Serviciotere;
import py.gov.aduana.webservices.ServiciotereSoap;

public class Principal {

	/*
    // PRODUCCION:
	public static String KEY_STORE = "C:/Personales/Proyectos/caia/py-tere/config/apps/courrier/courier.dhl.jks";
	public static String KEY_STORE_TYPE = "jks";
	public static String KEY_STORE_ALIAS = "dhl_aduana";
	public static String KEY_STORE_PASS = "hDl456ouC";
	public static String SIGNATURE_USER = "dhl_aduana";
	public static String ENCRYPTION_USER = "terews";
	public static String ARCHIVO_TICKETS = "C:/Personales/Proyectos/caia/py-tere/config/apps/courrier/lastTicket.xml";
	public static String WSAA_DN = "C=py, O=aduana, OU=sofia, CN=wsaa";
	public static String WSAA_SVC = "serviciotere";
	public static String WSAA_URL = "https://secure.aduana.gov.py/wsdl/wsaaserver/Server";
	public static String TERE_URL = "https://secure.aduana.gov.py/wsdl/tere2/serviciotere";
	public static String URL_PROPS = "file:///C:/Personales/Proyectos/caia/py-tere/config/apps/courrier/wsaa_PY.properties";
	 */

	/*
    // PRUEBAS:
	public static String KEY_STORE = "C:/Personales/Proyectos/caia/py-tere/config/apps/courrier_test/courier.dhl.jks";
	public static String KEY_STORE_TYPE = "jks";
	public static String KEY_STORE_ALIAS = "800048660";
	public static String KEY_STORE_PASS = "hDl456ouC";
	public static String SIGNATURE_USER = "800048660";
	public static String ENCRYPTION_USER = "terews";
	public static String ARCHIVO_TICKETS = "C:/Personales/Proyectos/caia/py-tere/config/apps/courrier_test/lastTicket.xml";
	public static String WSAA_DN = "C=py, O=dna, OU=sofia, CN=wsaatest";
	public static String WSAA_SVC = "serviciotere";
	public static String WSAA_URL = "https://secure.aduana.gov.py/test/wsdl/wsaaserver/Server";
	public static String TERE_URL = "https://secure.aduana.gov.py/test/wsdl/tere2/serviciotere";
	public static String URL_PROPS = "file:///C:/Personales/Proyectos/caia/py-tere/config/apps/courrier_test/wsaa_PY.properties";
	 */

	public static void main(String[] args) {
		try {

			UtilLog.EscribirLOG("Iniciando Envio a TERE..." );
			UtilLog.EscribirLOG("Obteniendo Datos de Configuracion..." );
			ConfigData cfg = new ConfigData();
			cfg.getPropValues();

			System.setProperty("javax.net.ssl.keyStore", cfg.getKEY_STORE());
			System.setProperty("javax.net.ssl.keyStoreAlias", cfg.getKEY_STORE_ALIAS());
			System.setProperty("javax.net.ssl.keyStorePassword", cfg.getKEY_STORE_PASS());
			System.setProperty("javax.net.ssl.trustStore", cfg.getKEY_STORE());
			System.setProperty("javax.net.ssl.trustStorePassword", cfg.getKEY_STORE_PASS());


			//Autenticacion aut = new Autenticacion();
			//aut.setCodAduana("");
			//aut.setIdUsuario("aduanas_dhl");
			//aut.setIdUsuario("dhl_aduana");
			//aut.setFirmaWSAA("tX8+P4u6YUTleP/OTabS96e9Oo1hRF10WOgaemg+can0gtGG/0bkZ3nIAZCTHTwj5XMNQvAKnuPJxprgi1m2IV7YYpihYWJhDmvsjuh3392pOuDXcO+QDcEwC7L5EwJ5/x0b2sJZsXkMIJvQM6tfPS6XkBlDzaYRuCH6sezr7Mg=");
			//aut.setTicketWSAA("CjxhdXRoPgoJPGlkIHVuaXF1ZV9pZD0iMTQ5ODYyMDUxNSIgc3JjPSJDPXB5LCBPPWFkdWFuYSwgT1U9c29maWEsIENOPXdzYWEiIGdlbl90aW1lPSIyMDE3LTA2LTI3VDIyOjI4OjM1LjAzNS0wNTowMCIgZXhwX3RpbWU9IjIwMTctMDYtMjdUMjM6Mjg6MzUuMDM1LTA1OjAwIi8+Cgk8b3BlcmF0aW9uIHZhbHVlPSJncmFudGVkIiB0eXBlPSJsb2dpbiI+CgkJPGxvZ2luIHVpZD0iQz1QWSwgTz1ESEwsIE9VPURITEdUVywgQ049ZGhsX2FkdWFuYSIgc2VydmljZT0ic2VydmljaW90ZXJlIiBhdXRobWV0aG9kPSJjbXMiPgoJCTwvbG9naW4+Cgk8L29wZXJhdGlvbj4KPC9hdXRoPgo=");
			UtilLog.EscribirLOG("Creando Tickets de Conexion..." );
			ConexionTickets cnx = new ConexionTickets();
			Autenticacion aut = cnx.consultarTicket();

			// inicializa el tunel SSL:
			TrustManager[] caiaTrustMgr = { new CaiaTrustManager() };
			HostnameVerifier caiaHostVer = new CaiaHostnameVerifier();

			SSLContext ctx = SSLContext.getInstance("SSL");
			ctx.init(null, caiaTrustMgr, new SecureRandom());

			HttpsURLConnection.setDefaultSSLSocketFactory(ctx.getSocketFactory());
			HttpsURLConnection.setDefaultHostnameVerifier(caiaHostVer);

			// invoca el servicio de Tere
			UtilLog.EscribirLOG("Invocando servicio TERE..." );
			UtilLog.EscribirLOG("Creando Objeto URL..." );
			URL url = new URL(cfg.getTERE_URL());
			UtilLog.EscribirLOG("Se creo URL..." + url.getHost());
			QName qName = new QName("http://aduana.gov.py/webservices", "serviciotere");
			UtilLog.EscribirLOG("Obteniendo URLProp...");
			URL urlProp = new URL(cfg.getURL_PROPS());
			UtilLog.EscribirLOG("Se obtuvo URLProp :" +  cfg.getURL_PROPS());
			UtilLog.EscribirLOG("Se obtuvo QName :" +  qName);
			UtilLog.EscribirLOG("Creando Servicio TERE...");
			Serviciotere svc = new Serviciotere(url, qName);
			UtilLog.EscribirLOG("Se creo el servicio TERE...");
			ServiciotereSoap soap = svc.getServiciotereSoap();
			UtilLog.EscribirLOG("Haciendo Request..." );
			Map<String, Object> ctx1 = ((BindingProvider) soap).getRequestContext();
			UtilLog.EscribirLOG("Obteniendo respuesta..." );
			ctx1.put("ws-security.callback-handler", new SetKeystorePassword());
			ctx1.put("ws-security.signature.properties", urlProp);
			ctx1.put("ws-security.encryption.properties", urlProp);
			ctx1.put("ws-security.signature.username", cfg.getSIGNATURE_USER());
			ctx1.put("ws-security.encryption.username", cfg.getENCRYPTION_USER());

			UtilLog.EscribirLOG("Empezando lectura de Archivos..." );
			EnviarAnticipo(cfg,soap,aut);
			AsignarManifiesto(cfg, soap, aut);
			GenerarIngresoDeposito(cfg, soap, aut);
			AnularAnticipo(cfg, soap, aut);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("ERROR");
			String message = UtilLog.getStackTrace(ex);
			UtilLog.EscribirLOG("ERROR!!" + ex.getMessage() + " " + message);
		}
	}



	private static void EnviarAnticipo(ConfigData cfg,ServiciotereSoap soap,Autenticacion aut){
		UtilLog.EscribirLOG("Enviando Anticipo...");
		System.out.println("Escaneando directorio " + cfg.getMASTER_ROOT());
		UtilLog.EscribirLOG("Escaneando directorio " + cfg.getMASTER_ROOT());
		File folder = new File(cfg.getMASTER_ROOT() + "/IN/work");
		try{
			if(folder.listFiles().length > 0){
				for (final File fileEntry : folder.listFiles()) {
					String content = null;
					if (!fileEntry.isDirectory()) {
						content = new Scanner(fileEntry).useDelimiter("\\Z").next();
						System.out.println("Llamando Web-Service");
						System.out.println(content);
						RetornoAgregarGuia guia = soap.agregarGuia(content, aut);
						System.out.println("Leyendo salida ");
						System.out.println(guia == null);
						String contentOut = convertirXML(guia);
						String fileName = cfg.getMASTER_ROOT() + "/OUT/work/" + fileEntry.getName();
						Path path = Paths.get(fileName);
						byte[] strToBytes = contentOut.getBytes();
						Files.write(path, strToBytes);
						String pathProc = cfg.getMASTER_ROOT() + "/IN/proc/" + fileEntry.getName();
						Files.move(Paths.get(fileEntry.getPath()), Paths.get(pathProc));
					}
				}
			}else{
				UtilLog.EscribirLOG("No se encontraron archivos para Enviar Anticipo...");
			}
		}catch(Exception ex){
			String message = UtilLog.getStackTrace(ex);
			UtilLog.EscribirLOG("ERROR!!" + ex.getMessage() + " " + message);
			VaciarArchivoTicket();
		}
	}

	private static void AsignarManifiesto(ConfigData cfg,ServiciotereSoap soap,Autenticacion aut){
		UtilLog.EscribirLOG("Asignando Manifiesto...");
		System.out.println("Escaneando directorio " + cfg.getMANIFIESTO_ROOT());
		UtilLog.EscribirLOG("Escaneando directorio " + cfg.getMANIFIESTO_ROOT());
		try{
			File dirManWork = new File(cfg.getMANIFIESTO_ROOT() + "/IN/work");
			if(dirManWork.listFiles().length > 0){
				for (final File fileEntry : dirManWork.listFiles()) {
					String content = null;
					if (!fileEntry.isDirectory()) {
						content = new Scanner(fileEntry).useDelimiter("\\Z").next();
						System.out.println("Llamando Web-Service");
						System.out.println(content);
						String[] split = content.split("\\|");
						if(split.length == 4){
							IdManifiesto man = new IdManifiesto();
							man.setIdSofia(split[0]);
							man.setManifiesto(split[1]);
							man.setPrefijo(split[2]);
							man.setTitulo(split[3]);

							RetornoAsignarManifiesto guia = soap.asignarManifiesto(man, aut);
							System.out.println("Leyendo salida ");
							System.out.println(guia == null);
							String contentOut = convertirXML(guia);
							//DateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
							//String sdt = df.format(new Date(System.currentTimeMillis()));
							String fileName = cfg.getMANIFIESTO_ROOT() + "/OUT/work/" + fileEntry.getName();

							Path path = Paths.get(fileName);
							byte[] strToBytes = contentOut.getBytes();
							Files.write(path, strToBytes);
							String pathProc = cfg.getMANIFIESTO_ROOT() + "/IN/proc/" + fileEntry.getName();
							Files.move(Paths.get(fileEntry.getPath()), Paths.get(pathProc));
						}else{
							UtilLog.EscribirLOG("El archivo no tiene las columnas necesarias...");
						}
					}
				}
			}else{
				UtilLog.EscribirLOG("No se encontraron archivos para Asignar Manifiesto...");
			}
		}catch(Exception ex){
			String message = UtilLog.getStackTrace(ex);
			UtilLog.EscribirLOG("ERROR!!" + ex.getMessage() + " " + message);
			VaciarArchivoTicket();
		}
	}

	private static void GenerarIngresoDeposito(ConfigData cfg,ServiciotereSoap soap,Autenticacion aut){
		UtilLog.EscribirLOG("Generando Ingreso Deposito...");
		System.out.println("Escaneando directorio " + cfg.getINGRESODEPOSITO_ROOT());
		UtilLog.EscribirLOG("Escaneando directorio " + cfg.getINGRESODEPOSITO_ROOT());
		File dirDepositoWork = new File(cfg.getINGRESODEPOSITO_ROOT() + "/IN/work");
		ArrayList<String> files = new ArrayList<String>();
		try{
			if(dirDepositoWork.listFiles().length > 0){
				UtilLog.EscribirLOG("Se encontraron " + dirDepositoWork.listFiles().length + " archivos...");
				for (final File fileEntry : dirDepositoWork.listFiles()) {
					String content = null;
					if (!fileEntry.isDirectory()) {
						UtilLog.EscribirLOG("Escaneando archivo... " + fileEntry.getName());
						content = new Scanner(fileEntry).useDelimiter("\\Z").next();
						System.out.println("Llamando Web-Service");
						UtilLog.EscribirLOG("Llamando Web-Service... ");
						System.out.println(content);
						RetornoTransaccion guia = soap.ingresoDeposito(content, aut);
						UtilLog.EscribirLOG("Llamada Exitosa... ");
						System.out.println("Leyendo salida ");
						System.out.println(guia == null);
						UtilLog.EscribirLOG("Convirtiendo objeto Recibo... ");
						String contentOut = convertirXML(guia);
						UtilLog.EscribirLOG("Conversion Exitosa... ");
						//DateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
						//String sdt = df.format(new Date(System.currentTimeMillis()));
						String fileName = cfg.getINGRESODEPOSITO_ROOT() + "/OUT/work/" + fileEntry.getName();

						Path path = Paths.get(fileName);
						byte[] strToBytes = contentOut.getBytes();

						Files.write(path, strToBytes);
						files.add(fileEntry.getName());

						String pathWork = cfg.getINGRESODEPOSITO_ROOT() + "/IN/work/" + fileEntry.getName();
						String pathProc = cfg.getINGRESODEPOSITO_ROOT() + "/IN/proc/" + fileEntry.getName();
						Files.move(Paths.get(pathWork), Paths.get(pathProc));
						UtilLog.EscribirLOG("Se movio el archivo... " + fileEntry.getName());
					}

					//Thread.sleep(2000);
				}
			}else{
				UtilLog.EscribirLOG("No se encontraron archivos de Ingreso Deposito para procesar");
			}
		}catch(Exception ex){
			String message = UtilLog.getStackTrace(ex);
			UtilLog.EscribirLOG("ERROR!!" + ex.getMessage() + " " + message);
			VaciarArchivoTicket();
		}
	}



	public static void copyFile(File sourceFile, File destFile) throws IOException {
		if(!destFile.exists()) {
			destFile.createNewFile();
		}

		FileChannel source = null;
		FileChannel destination = null;
		try {
			source = new FileInputStream(sourceFile).getChannel();
			destination = new FileOutputStream(destFile).getChannel();

			// previous code: destination.transferFrom(source, 0, source.size());
			// to avoid infinite loops, should be:
			long count = 0;
			long size = source.size();              
			while((count += destination.transferFrom(source, count, size-count))<size);
		}
		finally {
			if(source != null) {
				source.close();
			}
			if(destination != null) {
				destination.close();
			}
		}
	}


	private static void AnularAnticipo(ConfigData cfg,ServiciotereSoap soap,Autenticacion aut){
		UtilLog.EscribirLOG("Anulando Anticipo...");
		System.out.println("Escaneando directorio " + cfg.getANULARANTICIPO_ROOT());
		UtilLog.EscribirLOG("Escaneando directorio " + cfg.getANULARANTICIPO_ROOT());
		File folder = new File(cfg.getANULARANTICIPO_ROOT() + "/IN/work");
		try{
			if(folder.listFiles().length > 0){
				for (final File fileEntry : folder.listFiles()) {
					String content = null;
					if (!fileEntry.isDirectory()) {
						content = new Scanner(fileEntry).useDelimiter("\\Z").next();
						System.out.println("Llamando Web-Service");
						System.out.println(content);
						String[] split = content.split("\\|");
						RetornoAnularLote guia =  soap.anularLote(split[0], aut);

						System.out.println("Leyendo salida ");
						System.out.println(guia == null);
						String contentOut = convertirXML(guia);
						//DateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
						//String sdt = df.format(new Date(System.currentTimeMillis()));
						String fileName = cfg.getANULARANTICIPO_ROOT() + "/OUT/work/" + fileEntry.getName();

						Path path = Paths.get(fileName);
						byte[] strToBytes = contentOut.getBytes();
						Files.write(path, strToBytes);
						String pathProc = cfg.getANULARANTICIPO_ROOT() + "/IN/proc/" + fileEntry.getName();
						Files.move(Paths.get(fileEntry.getPath()), Paths.get(pathProc));
					}
				}
			}else{
				UtilLog.EscribirLOG("No se encontraron archivos para Anular Anticipo...");
			}
		}catch(Exception ex){
			String message = UtilLog.getStackTrace(ex);
			UtilLog.EscribirLOG("ERROR!!" + ex.getMessage() + " " + message);
			VaciarArchivoTicket();
		}
	}

	private static String convertirXML(RetornoAgregarGuia guia){
		String ret = "";
		ret += "<retornoAgregarGuia>";
		ret += "<idTransaccion>" + (guia.getIdTransaccion()==null?"":guia.getIdTransaccion()) + "</idTransaccion>";
		List<Recibo> lista = guia.getRecibo();
		for(int i = 0; i<lista.size();i++){
			Recibo r = lista.get(i); 
			ret += "<recibo>";
			ret += "<codMensaje>" + r.getCodMensaje() + "</codMensaje>";
			ret += "<mensaje>" + r.getMensaje() + "</mensaje>";
			ret += "</recibo>";
		}
		ret += "</retornoAgregarGuia>";
		Recibo r = lista.get(0);
		UtilLog.EscribirLOG("Codigo MENSAJE: " + r.getCodMensaje());
		if(r.getCodMensaje().equals("02")){
			UtilLog.EscribirLOG("Resultado de TERE - USUARIO NO AUTENTICADO");
			VaciarArchivoTicket();
		}
		return ret;
	}

	private static String convertirXML(RetornoAsignarManifiesto guia){
		String ret = "";
		try{
			ret += "<retornoAsignarManifiesto>";
			ret += "<maniGen>" + (guia.getManiGen()==null?"":guia.getManiGen()) + "</maniGen>";
			Recibo r = guia.getRecibo();
			ret += "<recibo>";
			ret += "<codMensaje>" + r.getCodMensaje() + "</codMensaje>";
			ret += "<mensaje>" + r.getMensaje() + "</mensaje>";
			ret += "</recibo>";
			ret += "</retornoAsignarManifiesto>";
			UtilLog.EscribirLOG("Codigo MENSAJE: " + r.getCodMensaje() );
			if(r.getCodMensaje().equals("02")){
				UtilLog.EscribirLOG("Resultado de TERE - USUARIO NO AUTENTICADO");
				VaciarArchivoTicket();
			}
		}catch(Exception ex){
			UtilLog.EscribirLOG("Error Convirtiendo ASIGNAR MANIFIESTO");
		}
		return ret;
	}

	private static String convertirXML(RetornoTransaccion guia){
		String ret = "";
		ret += "<retornoTransaccion>";
		ret += "<idTrnSofia>" + (guia.getIdTrnSofia() ==null?"":guia.getIdTrnSofia()) + "</idTrnSofia>";
		ret += "<fecha>" + (guia.getFecha() ==null?"":guia.getFecha()) + "</fecha>";
		ret += "<usuario>" + (guia.getUsuario() ==null?"":guia.getUsuario()) + "</usuario>";
		Recibo r = guia.getRecibo();
		ret += "<recibo>";
		ret += "<codMensaje>" + r.getCodMensaje() + "</codMensaje>";
		ret += "<mensaje>" + r.getMensaje() + "</mensaje>";
		ret += "</recibo>";
		ret += "</retornoTransaccion>";
		UtilLog.EscribirLOG("Codigo MENSAJE: " + r.getCodMensaje() );
		if(r.getCodMensaje().equals("02")){
			UtilLog.EscribirLOG("Resultado de TERE - USUARIO NO AUTENTICADO");
			VaciarArchivoTicket();
		}
		return ret;		
	}

	private static String convertirXML(RetornoAnularLote guia){
		String ret = "";
		ret += "<retornoTransaccion>";
		ret += "<idLoteRemesa>" + (guia.getIdLoteRemesa() ==null?"":guia.getIdLoteRemesa()) + "</idLoteRemesa>";
		ret += "<estado>" + (guia.getEstado() ==null?"":guia.getEstado()) + "</estado>";
		Recibo r = guia.getRecibo();
		ret += "<recibo>";
		ret += "<codMensaje>" + r.getCodMensaje() + "</codMensaje>";
		ret += "<mensaje>" + r.getMensaje() + "</mensaje>";
		ret += "</recibo>";
		ret += "</retornoTransaccion>";
		UtilLog.EscribirLOG("Codigo MENSAJE: " + r.getCodMensaje() );
		if(r.getCodMensaje().equals("02")){
			UtilLog.EscribirLOG("Resultado de TERE - USUARIO NO AUTENTICADO");
			VaciarArchivoTicket();
		}
		return ret;		
	}

	public static void VaciarArchivoTicket(){
		UtilLog.EscribirLOG("Usuario No autenticado...");
		ConfigData cfg = new ConfigData();
		cfg.getPropValues();
		File file = new File(cfg.getARCHIVO_TICKETS());
		File fileOut = new File(cfg.getARCHIVO_TICKETS());

		try {
			boolean result = Files.deleteIfExists(file.toPath());
			boolean fileCreated = false;
			fileCreated = fileOut.createNewFile();
			if(result){
				UtilLog.EscribirLOG("Borrando archivo LastTicket..");
			}else{
				UtilLog.EscribirLOG("No se pudo eliminar LastTicket..");
			}
			if(fileCreated){
				UtilLog.EscribirLOG("Creando Nuevo Archivo Ticket");
			}else{
				UtilLog.EscribirLOG("Creando Nuevo Archivo Ticket");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

