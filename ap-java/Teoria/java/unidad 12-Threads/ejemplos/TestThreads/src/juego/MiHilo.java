package juego;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Random;

public class MiHilo extends Thread {

	private boolean continuar = true;
	
	public void detenerHilo() {
		continuar = false;
	}
	
	public void run() {
		
		// Aquí el código pesado que tarda mucho
		Random rnd = new Random();
		PrintStream fichero;
		
		try {
			fichero = new PrintStream(
					new FileOutputStream("num_aleatorios.txt"));

			fichero.println("Fichero con 2 millones de numeros aleatorios");

			fichero.println("Fichero iniciado: " + new Date());
			for (int i = 0; i < 2000000 && continuar; i++) {
				fichero.println(i + 1 + ":" + (int) (rnd.nextDouble() * 1000.0));
			}

			if (!continuar) {
				fichero.println("Fichero INTERRUMPIDO A PETICION DEL USUARIO.");
				System.out.println("\n\nFICHERO INTERRUMPIDO!");
			} else {
				fichero.println("Fichero finalizado: " + new Date());
				System.out.println("\n\nFICHERO GENERADO!");
			}			
			
			fichero.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}