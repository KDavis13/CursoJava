package tercer;

import basic.Utiles;

class Superclase2 {}

public class Main2 extends Superclase2 implements Runnable {

	Thread t;
	
	public Main2() {
		t = new Thread(this);
		t.start();
	}
	
	public static void main(String[] args) {
		new Main2();
	}

	@Override
	public void run() {
		new Utiles().imprimir();
		System.out.println("Calculando...");
		for (long i = 0; i < 5_000_000_000L; i++) {
		}
		System.out.println("Calculo finalizado.");		
	}
}
