package dos;

//Creamos la clase AThread, la cual deriva de Thread
public class AThread extends Thread {
	
	public void run() { 
		int i;
		for (i = 1; i <= 200; i++)
			System.out.print(" A" + i);
	}
}
