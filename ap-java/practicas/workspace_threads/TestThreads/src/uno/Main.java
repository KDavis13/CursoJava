package uno;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread unThread = Thread.currentThread();
		System.out.println("Estas en... " + unThread.getName());

		Thread p = ejecutarEnOtroHilo("Paquillo");
		Thread q = ejecutarEnOtroHilo("Quer");
		p.join();
		q.join();

		System.out.println("Estas en... " + unThread.getName());
		
		System.out.println("******************************************");
		System.out.println("programa finalizado");
	}

	private static Thread ejecutarEnOtroHilo(String nombre) {
		
		MiHilo t = new MiHilo();
		t.setNombre(nombre);
		
		t.start();
		return t;

	}

}
