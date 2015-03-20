package juego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Principal {

	public static void main(String arrgs[]) {

		MiHilo elHilo = new MiHilo();
		elHilo.start();

		System.out
				.println("Estoy calculando numeros aleatorios entre 0-1000 y guardandolos en un fichero en disco.");
		System.out
				.println("Acabare cuando llegue a 2 millones de numeros, pero mientras tanto puedo jugar contigo.");

		System.out.println("He pensado un numero entre el 1 y el 10");

		Random rnd = new Random();
		int usuarioNumero = -1;

		while (usuarioNumero != 0) {

			System.out
					.println("\nA ver si lo adivinas! (0 para dejar de jugar)");

			int miNumero = (int) (rnd.nextDouble() * 10.0) + 1;

			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println("Entra un numero: ");

			try {
				usuarioNumero = Integer.parseInt(in.readLine());
			} catch (NumberFormatException e) {
				// Si no se pulsa un numero simulamos salir del programa
				usuarioNumero = 0;
			} catch (IOException e) {
				e.printStackTrace();
			}
			// Comprobar si usuario lo adivino
			if (usuarioNumero == 0)
				System.out
						.println("YA NO QUIERES JUGAR...Vamos a esperar a que acabe de calcular los 2 millones de numeros aleatorios.");

			else if (miNumero == usuarioNumero)
				System.out.println("LO HAS ADIVINADO, ERA EL " + miNumero);

			else
				System.out.println("LO SIENTO, NO ERA EL " + usuarioNumero
						+ " SINO EL " + miNumero);

		}
	}
}