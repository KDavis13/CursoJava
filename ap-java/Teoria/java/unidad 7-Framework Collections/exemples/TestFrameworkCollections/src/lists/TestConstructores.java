package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestConstructores {

	public static void main(String[] args) {
		
		List<String> lista = null;
		
		// ********* Constructor más habitual
		// sin parámetros
		lista = new ArrayList<>();
		
		m1(lista);
		
		// ********* Constructor a partir de una lista
		List<String> lista2 = 
			new ArrayList<>(
				Arrays.asList("Bilbao", "Malaga", "Zaragoza"));
		
		lista.addAll(lista2);
		
		// ********* Constructor en el que especificamos la
		// media del array interno de la colección
		List<String> lista3 = 
				new ArrayList<>(25);
		
		for (String ciudad : lista) {
			System.out.print(ciudad + " ");
		}
		
		System.out.println("\nMida: " + lista.size());
		
		
	}

	private static void m1(List<String> lista) {		
		omple(lista, 10);
	}

	private static void omple(List<String> lista, int max) {
		for (int i = 0; i < max; i++) {
			lista.add(getCiudadAleatoriamente(max));
		}		
	}

	private static String getCiudadAleatoriamente(int max) {
		String[] ciudades = 
			{"Barcelona", "Lleida","Tarragona","Girona","Madrid",
				"Valencia","Cuenca","Valladolid","Cadiz","Sevilla",
				"Alicante"};
		
		int indice = (int) (Math.random() * ciudades.length);
		if (indice > max) indice = max;
		return ciudades[indice];
	}

}
