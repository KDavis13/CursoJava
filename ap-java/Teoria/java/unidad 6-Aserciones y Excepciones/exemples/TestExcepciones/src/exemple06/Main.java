package exemple06;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {		
		try {
			m(0);			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		System.out.println("Programa finalizado correctamente.");
	}

	private static void m(int i) throws IOException {
		
		final String MSG = 
				"No se admiten numeros negativos.";
		
		if (i<0) {
			// Llenço una RuntimeException, que és
			// una unchecked exception i per tant, no
			// estic obligat ni a capturar-la ni a
			// llançar-la
			throw new IllegalArgumentException(MSG);
		}
		
		if (i == 0) {
			// checked exception! Obligat a 
			// capturar-la o llançar-la
			throw new IOException("El 0 es muy malo!");
		}
		
		System.out.println("Tu numerito es: " + i);
	}

}
