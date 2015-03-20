package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Importamos todas las clases de java.io.

public class EntradaLog {

	
	public static void main(String[] args) {
		leerLog();
	}

	public static void leerLog() {
		
	FileInputStream fis;
		
		File fichero = new File("log.txt");
		try {
			fis = new FileInputStream(fichero);
			int caracter;
		
			//leemos el fichero
			while ((caracter = fis.read()) != -1) {
				System.out.print((char) caracter);
			}
			fis.close(); // Cerrar el fichero
						
		} catch (FileNotFoundException e) {
			System.out.println("No encuentro el fichero!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
