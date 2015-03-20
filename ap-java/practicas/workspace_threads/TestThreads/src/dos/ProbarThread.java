package dos;

public class ProbarThread {
	public static void main(String args[]) {
		AThread a = new AThread(); // Creamos obj. de la clase AThread
		BThread b = new BThread(); // Creamos obj. de la clase BThread
		// Arrancamos ambos hilos
		a.start(); // start() llama al método run() y vuelve aquí.
		b.start();
	}
}
