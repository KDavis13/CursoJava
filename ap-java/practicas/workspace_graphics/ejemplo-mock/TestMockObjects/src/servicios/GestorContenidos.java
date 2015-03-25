package servicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import sistema.UtilesFichero;

public class GestorContenidos {
	private UtilesFichero util;
	
	private static Properties props = 
			new Properties();
	
	static {
		InputStream input;
		try {
			input = new FileInputStream("config.properties");
			props.load(input);
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}
	
	public boolean checkCredenciales(String usr, String pwd) {
		String usuario = props.getProperty("usr");
		String password = props.getProperty("pwd");
		
		return usuario.equals(usr) && password.equals(pwd);	
	}
	
	public GestorContenidos(UtilesFichero util) {
		this.util = util;
	}
	
	public boolean guardar(
			String usuario,
			String pwd,
			String fichero,
			String contenido) {
		
		boolean validado = checkCredenciales(usuario, pwd);
		if (validado) {
			try {
				util.escribir(fichero, contenido);
				return true;
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public String leer(String usuario,
			String pwd,
			String fichero) {
		boolean validado = checkCredenciales(usuario, pwd);
		if (validado) {
			try {
				return util.leer(fichero);
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		return null;
	}
	
}