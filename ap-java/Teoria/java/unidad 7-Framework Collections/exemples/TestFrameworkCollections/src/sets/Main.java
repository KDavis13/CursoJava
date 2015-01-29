package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<String> conjunt = 
			new LinkedHashSet<>(
				Arrays.asList("Canadá", "Rusia", "Portugal", "Rusia", "Argentina", "Italia")
			);

		System.out.println("Total elementos: " + conjunt.size() );
		
		for (String pais : conjunt) {
			System.out.println(pais);
		}
		
		
	}

}
