package basic;

public class Main {

	public static void main(String[] args) {

		Thread unThread = Thread.currentThread();
		System.out.println(unThread.getName());
		
		metodoX();
		
		new Utiles().imprimir();
	}

	private static void metodoX() {
		Thread unThread = Thread.currentThread();
		System.out.println(unThread.getName());

	}
}
