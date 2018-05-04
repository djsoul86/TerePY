package caia;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class CaiaHostnameVerifier implements HostnameVerifier{

	@Override
	public boolean verify(String arg0, SSLSession arg1) {
		return true;
	}

}
