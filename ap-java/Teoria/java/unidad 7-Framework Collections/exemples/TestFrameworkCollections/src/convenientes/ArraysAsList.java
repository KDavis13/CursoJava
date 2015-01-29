package convenientes;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		// Passem de String[] a List<String>
		metode(Arrays.asList(args));
	}
	
	public static void metode(List<String> noms)  {
		System.out.println("**** En metode **********");
		for (String nom : noms) {
			System.out.println(nom);
		}
		
		// Passem de List<String> a String[]
		String[] _noms = noms.toArray(new String[0]);
		metode2(_noms);
	}

	private static void metode2(String[] _noms) {
		System.out.println("**** En metode2 **********");
		for (String nom : _noms) {
			System.out.println(nom);
		}		
	}
}