package caia;

import java.io.FileInputStream;
import java.net.URL;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.CertStore;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.namespace.QName;

import org.apache.axis.encoding.Base64;
import org.bouncycastle.cms.CMSProcessable;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import py.com.sif.wsaaclient.artifacts.py.WsaaServerBean;
import py.com.sif.wsaaclient.artifacts.py.WsaaServerBeanService;

public class WsaaClient {
	public WsaaClient() {
	}

	public String createTRA(String signerDn, String destDn, String service, Long ticketTime) throws WsaaException {
		System.out.println("Entering Method createTRA");

		String traXml = "";
		Date actTime = new Date();
		Date exptime = null;
		String XMLgentime = null;
		String XMLexptime = null;
		String uniqueId = "";
		try {
			uniqueId = new Long(actTime.getTime() / 1000L).toString();
			exptime = new Date(actTime.getTime() + ticketTime.longValue());

			XMLgentime = parse(actTime, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
			XMLexptime = parse(exptime, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");

			traXml = "<loginTicketRequest version=\"1.0\">\n\t<header>\n\t\t<source>" + signerDn + "</source>\n"
					+ "\t\t<destination>" + destDn + "</destination>\n" + "\t\t<uniqueId>" + uniqueId + "</uniqueId>\n"
					+ "\t\t<generationTime>" + XMLgentime + "</generationTime>\n" + "\t\t<expirationTime>" + XMLexptime
					+ "</expirationTime>\n" + "\t</header>\n" + "\t<service>" + service + "</service>\n"
					+ "</loginTicketRequest>\n";
		} catch (Exception e) {
			e.printStackTrace();
			throw new WsaaException("Error al generar tra");
		}
		System.out.println(traXml);
		return traXml;
	}

	public byte[] createCms(String keystoreFile, String keystoreType, String keystorePass, String signer,
			String signerpass, String destDN, String service, Long ticketTime) throws WsaaException {
		System.out.println("Entering Method createCms");

		PrivateKey pKey = null;
		X509Certificate pCertificate = null;
		byte[] asn1Cms = null;
		CertStore cstore = null;

		String signerDn = null;
		KeyStore ks = null;
		FileInputStream p12stream = null;
		ArrayList<X509Certificate> certList = null;
		CMSSignedDataGenerator gen = null;
		CMSProcessable data = null;
		CMSSignedData signed = null;
		try {
			ks = KeyStore.getInstance(keystoreType);
			p12stream = new FileInputStream(keystoreFile);
			ks.load(p12stream, keystorePass.toCharArray());
			p12stream.close();

			pKey = (PrivateKey) ks.getKey(signer, signerpass.toCharArray());
			pCertificate = (X509Certificate) ks.getCertificate(signer);
			signerDn = pCertificate.getSubjectDN().toString();

			certList = new ArrayList();
			certList.add(pCertificate);
			if (Security.getProvider("BC") == null) {
				Security.addProvider(new BouncyCastleProvider());
			}
			cstore = CertStore.getInstance("Collection", new CollectionCertStoreParameters(certList), "BC");

			String traXml = createTRA(signerDn, destDN, service, ticketTime);

			gen = new CMSSignedDataGenerator();
			gen.addSigner(pKey, pCertificate, CMSSignedDataGenerator.DIGEST_SHA1);
			gen.addCertificatesAndCRLs(cstore);
			data = new CMSProcessableByteArray(traXml.getBytes());
			signed = gen.generate(data, true, "BC");

			asn1Cms = signed.getEncoded();
		} catch (Exception e) {
			e.printStackTrace();
			throw new WsaaException("Error al generar cms");
		}
		System.out.println("Exiting Method createCms: " + Base64.encode(asn1Cms));
		return asn1Cms;
	}

	public String invokeWsaa(byte[] traXmlCmc, String loginURl) throws WsaaException {
		System.out.println("Entering Method invokeWsaa");

		String ta = "";
		try {
			WsaaServerBeanService servPY = new WsaaServerBeanService(new URL(loginURl),
					new QName("http://ejb.server.wsaa.dna.gov.py/", "WsaaServerBeanService"));
			WsaaServerBean portPY = servPY.getWsaaServerBeanPort();
			ta = portPY.loginCms(Base64.encode(traXmlCmc));
		} catch (Exception e) {
			String message = UtilLog.getStackTrace(e);
			UtilLog.EscribirLOG("ERROR!!" + e.getMessage() + " " + message);
			e.printStackTrace();
			throw new WsaaException("Error al enviar mensaje");
		}
		System.out.println("Exiting Method invokeWsaa: " + ta);
		System.out.println("\n\n");
		return ta;
	}

	private String parse(Date date, String parseFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(parseFormat);
		String result = sdf.format(date);
		return result.substring(0, result.length() - 2) + ":00";
	}
}
