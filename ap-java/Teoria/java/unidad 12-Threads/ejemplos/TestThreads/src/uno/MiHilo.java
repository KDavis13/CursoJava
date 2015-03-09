package uno;

import basic.Utiles;

public class MiHilo extends Thread {
	@Override
	public void run() {
		new Utiles().imprimir();
		System.out.println("Calculando...");
		for (long i = 0; i < 5_000_000_000L; i++) {
		}
		System.out.println("Calculo finalizado.");
	}
}
