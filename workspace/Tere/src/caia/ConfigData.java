package caia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class ConfigData {
	String result = "";
	InputStream inputStream;
 
	public String getPropValues() {
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			Date time = new Date(System.currentTimeMillis());
 
			// get the property value and print it out
			KEY_STORE         = prop.getProperty("KEY_STORE");
			KEY_STORE_TYPE    = prop.getProperty("KEY_STORE_TYPE");
			KEY_STORE_ALIAS   = prop.getProperty("KEY_STORE_ALIAS");
			KEY_STORE_PASS    = prop.getProperty("KEY_STORE_PASS");
			SIGNATURE_USER    = prop.getProperty("SIGNATURE_USER");
			ENCRYPTION_USER   = prop.getProperty("ENCRYPTION_USER");
			ARCHIVO_TICKETS   = prop.getProperty("ARCHIVO_TICKETS");
			WSAA_DN           = prop.getProperty("WSAA_DN");
			WSAA_SVC          = prop.getProperty("WSAA_SVC");
			WSAA_URL          = prop.getProperty("WSAA_URL");
			TERE_URL          = prop.getProperty("TERE_URL");
			URL_PROPS         = prop.getProperty("URL_PROPS");
			MASTER_ROOT         = prop.getProperty("MASTER_ROOT");
			MANIFIESTO_ROOT         = prop.getProperty("MANIFIESTO_ROOT");
			INGRESODEPOSITO_ROOT         = prop.getProperty("INGRESODEPOSITO_ROOT");
			ANULARANTICIPO_ROOT         = prop.getProperty("ANULARANTICIPO_ROOT");
			PATH_LOG         = prop.getProperty("PATH_LOG");
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			try{
				inputStream.close();
			}catch(IOException e){
				System.out.println("Exception: " + e);
			}
		}
		return result;
	}
	
	private String KEY_STORE;
	private String KEY_STORE_TYPE;
	private String KEY_STORE_ALIAS;
	private String KEY_STORE_PASS;
	private String SIGNATURE_USER;
	private String ENCRYPTION_USER;
	private String ARCHIVO_TICKETS;
	private String WSAA_DN;
	private String WSAA_SVC;
	private String WSAA_URL;
	private String TERE_URL;
	private String URL_PROPS;
	private String MASTER_ROOT;
	private String MANIFIESTO_ROOT;
	private String INGRESODEPOSITO_ROOT;
	private String ANULARANTICIPO_ROOT;
	private String PATH_LOG;
	
	public String getANULARANTICIPO_ROOT() {
		return ANULARANTICIPO_ROOT;
	}
	public String getPATH_LOG() {
		return PATH_LOG;
	}
	
	public String getKEY_STORE() {
		return KEY_STORE;
	}
	public String getKEY_STORE_TYPE() {
		return KEY_STORE_TYPE;
	}
	public String getKEY_STORE_ALIAS() {
		return KEY_STORE_ALIAS;
	}
	public String getKEY_STORE_PASS() {
		return KEY_STORE_PASS;
	}
	public String getSIGNATURE_USER() {
		return SIGNATURE_USER;
	}
	public String getENCRYPTION_USER() {
		return ENCRYPTION_USER;
	}
	public String getARCHIVO_TICKETS() {
		return ARCHIVO_TICKETS;
	}
	public String getWSAA_DN() {
		return WSAA_DN;
	}
	public String getWSAA_SVC() {
		return WSAA_SVC;
	}
	public String getWSAA_URL() {
		return WSAA_URL;
	}
	public String getTERE_URL() {
		return TERE_URL;
	}
	public String getURL_PROPS() {
		return URL_PROPS;
	}
	public String getMASTER_ROOT() {
		return MASTER_ROOT;
	}
	public String getMANIFIESTO_ROOT() {
		return MANIFIESTO_ROOT;
	}
	public String getINGRESODEPOSITO_ROOT() {
		return INGRESODEPOSITO_ROOT;
	}
	

	
}
