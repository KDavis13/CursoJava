package exemple03;

public class Main {
	
	public static void main(String[] args) {		
		m();
		System.out.println("Programa finalizado.");
	}

	private static void m() {
		try {							
			System.out.println("Estoy en el try");
			int a = 5 / 0;					
		} finally {
			System.out.println("Estoy en el finally");
		}		
	}

}
