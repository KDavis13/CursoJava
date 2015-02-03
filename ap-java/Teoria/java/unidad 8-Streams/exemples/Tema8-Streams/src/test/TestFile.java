package test;

import java.io.File;
import java.net.URL;

public class TestFile {

	TestFile() {
		
		URL url = this.getClass().getResource("test.txt");
		
		File fichero = 
			new File(url.getFile());
		
		System.out.println("Nombre del fichero: " + fichero.getName());
		System.out.println("Directorio padre: " + fichero.getParent());
		System.out.println("Ruta relativa: " + fichero.getPath());
		System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
	}

	public static void main(String[] args) {
		new TestFile();
	}
}
