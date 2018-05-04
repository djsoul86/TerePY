package caia;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class SetKeystorePassword implements CallbackHandler {

	@Override
	public void handle(Callback[] arg0) throws IOException, UnsupportedCallbackException {
		for (int i = 0; i < arg0.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) arg0[i];
			pc.setPassword("hDl456ouC");
		}
	}

}
