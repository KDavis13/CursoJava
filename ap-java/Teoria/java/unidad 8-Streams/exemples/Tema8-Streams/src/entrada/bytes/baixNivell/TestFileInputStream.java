package entrada.bytes.baixNivell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
	
	public static void main(String[] args) {

		FileInputStream fis;
		
		File fichero = new File("testFileInputStream.txt");
		try {
			fis = new FileInputStream(fichero);
			int caracter, contador = 0;

			// Leer bytes del FileInputStream usando el método read()
			System.out
					.println("A punto de leer: " + 
							fis.available() + " bytes");
			
			System.out.println("Resultado:");
			
			while ((caracter = fis.read()) != -1) {
				if (++contador == 20)
					fis.skip(10);
				System.out.print((char) caracter);
			}
			fis.close(); // Cerrar el fichero
			
			System.out.println("\nBytes leídos: " + contador + " bytes");

		} catch (FileNotFoundException e) {
			System.out.println("No encuentro el fichero!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
