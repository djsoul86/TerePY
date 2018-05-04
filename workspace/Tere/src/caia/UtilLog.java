package caia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UtilLog {
	static void EscribirLOG(String mensaje){
		ConfigData cfg = new ConfigData();
		cfg.getPropValues();
		mensaje = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()) + ": " + mensaje;
		String filePath = cfg.getPATH_LOG() + new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".txt"; 
		File f = new File(filePath);
		if(f.exists() && !f.isDirectory()) { 
			try(FileWriter fw = new FileWriter(filePath, true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter out = new PrintWriter(bw))
					{
				out.println(mensaje);
					} catch (IOException e) {
						//exception handling left as an exercise for the reader
					}    
		}else{
			BufferedWriter writer = null;
			try {
				File logFile = new File(filePath);
				writer = new BufferedWriter(new FileWriter(logFile));
				writer.write(mensaje);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Close the writer regardless of what happens...
					writer.close();
				} catch (Exception e) {
				}
			}
		}
	}
	
	public static String getStackTrace(final Throwable throwable) {
		final StringWriter sw = new StringWriter();
		final PrintWriter pw = new PrintWriter(sw, true);
		throwable.printStackTrace(pw);
		return sw.getBuffer().toString();
	}
}
