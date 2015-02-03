package fileClass;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		String home = 
				System.getProperty("user.home");
		
		File fichero = new File(home);
		
		File[] contenido = fichero.listFiles();
		
		for (File elemento : contenido) {
			String strElemento = elemento.getName();
			if (elemento.isDirectory()) {
				strElemento += " (dir)";	
			}
			System.out.println(strElemento);
		}
	}
}
