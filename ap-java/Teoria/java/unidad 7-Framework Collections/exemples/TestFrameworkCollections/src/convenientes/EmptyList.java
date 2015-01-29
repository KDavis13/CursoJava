package convenientes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyList {

	public static void main(String[] args) {
		
		List<String> noms = getNoms();
		
		if (!noms.isEmpty()) {
			for (String nom : noms) {
				System.out.println(nom);
			}
		} else {
			System.out.println("La lista de nombres está vacía.");
		}
		
		System.out.println("Programa finalizado.");
	}

	private static List<String> getNoms() {
		
		List<String> noms = Collections.emptyList();
		
		//List<String> noms = 
			//	Arrays.asList("Pep", "Isabel", "Jaume");
		return noms;
	}

}
