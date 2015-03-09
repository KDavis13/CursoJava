package basic;

public class Utiles {
	
	public void imprimir() {
		Thread unThread = Thread.currentThread();
		System.out.println("Estas en el thread --> " + 
				unThread.getName());
	}
}
