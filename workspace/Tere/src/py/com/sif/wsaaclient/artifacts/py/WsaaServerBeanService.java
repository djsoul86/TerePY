package py.com.sif.wsaaclient.artifacts.py;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

@WebServiceClient(name = "WsaaServerBeanService", targetNamespace = "http://ejb.server.wsaa.dna.gov.py/", wsdlLocation = "file:/home/malvarez/desarrollo/dna/sofia/sintia/wsaainvoker/build/wsaatest.wsdl")
public class WsaaServerBeanService extends Service {
	private static final URL WSAASERVERBEANSERVICE_WSDL_LOCATION;
	private static final Logger logger = Logger.getLogger(WsaaServerBeanService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl = WsaaServerBeanService.class.getResource(".");
			url = new URL(baseUrl, "file:/home/malvarez/desarrollo/dna/sofia/sintia/wsaainvoker/build/wsaatest.wsdl");
		} catch (MalformedURLException e) {
			logger.warning(
					"Failed to create URL for the wsdl Location: 'file:/home/malvarez/desarrollo/dna/sofia/sintia/wsaainvoker/build/wsaatest.wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		WSAASERVERBEANSERVICE_WSDL_LOCATION = url;
	}

	public WsaaServerBeanService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public WsaaServerBeanService() {
		super(WSAASERVERBEANSERVICE_WSDL_LOCATION,
				new QName("http://ejb.server.wsaa.dna.gov.py/", "WsaaServerBeanService"));
	}

	@WebEndpoint(name = "WsaaServerBeanPort")
	public WsaaServerBean getWsaaServerBeanPort() {
		return (WsaaServerBean) super.getPort(new QName("http://ejb.server.wsaa.dna.gov.py/", "WsaaServerBeanPort"),
				WsaaServerBean.class);
	}
}
