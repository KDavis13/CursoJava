package uno;

import basic.Utiles;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		new Utiles().imprimir();		
		Thread p = ejecutarEnOtroHilo("Paquillo");
		Thread q = ejecutarEnOtroHilo("Quer");
		p.join();
		q.join();
		System.out.println("Programa finalizado");
	}

	private static Thread ejecutarEnOtroHilo(String nombre) {		
		MiHilo t = new MiHilo();			
		t.setName(nombre);		
		t.start();
		return t;
	}
}
