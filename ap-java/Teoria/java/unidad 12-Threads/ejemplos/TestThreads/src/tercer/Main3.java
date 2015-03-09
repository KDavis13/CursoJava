package tercer;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		System.out.println("¿Como te llamas?");
		Scanner sc = new Scanner(System.in);
		String respuesta = sc.next();
		System.out.println("hola " + respuesta);
		sc.close();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				int num = 0;
				for (int i=0; i<100; i++ ) {
					num = (int)(Math.random()*100);
					
					System.out.print(num + ", ");
				}
			}			
		}).start();
		
		System.out.println("Programa finalizado.");
		
	}

}
