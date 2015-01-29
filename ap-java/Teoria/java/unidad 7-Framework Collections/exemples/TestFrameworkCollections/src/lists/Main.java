package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// ojo! esta lista no puede crecer!
		/*List<Integer> lista =
				Arrays.asList(1,2,3);*/
		
		List<Integer> lista = 
			new ArrayList<>(Arrays.asList(1,2,3));
		
		boolean estado = lista.add(4);
		
		if (estado) {
			System.out.println("Elemento añadido.");
		} else {
			System.out.println("No se ha podido añadir el elemento!");
		}
		
		Set<Integer> numeros = 
			new HashSet<Integer>(Arrays.asList(5,6,7));
		
		lista.addAll(numeros);
		
		for (Integer i : lista) {
			System.out.print(i + ", ");
		}
		
		String result = lista.contains(16) ? "Sí" : "No";
		System.out.println("\n¿La lista contiene el num. 16 ? " + result );

		int pos = lista.indexOf(5);
		System.out.println("El 5 se encuentra en la posición " + pos);
		
		// *************
		
		Integer num = lista.set(0, 22);
		
		for (Integer i : lista) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n" + num);
	}

}
