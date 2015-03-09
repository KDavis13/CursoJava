package tercer;

import uno.MiHilo;

class Superclase {}

public class Main extends Superclase {

	Thread t = new Thread(new MiHilo());
	
	public Main() {
		t.start();
	}
	
	public static void main(String[] args) {		
		new Main();
	}

}
