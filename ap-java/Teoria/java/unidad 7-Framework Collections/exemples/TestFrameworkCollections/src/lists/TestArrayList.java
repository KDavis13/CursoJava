package lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(50);
   		lista.add(20);
		lista.add(51);
        
		System.out.println("Orden de creacion:");
		for (Integer x: lista) 
			System.out.print(x+" ");
    
		Collections.sort(lista);

		System.out.println("\nOrdenada:");
    
		for (Integer x: lista) 
			System.out.print(x+" ");
		
		System.out.println("\nRecuperando el segundo elemento: " + lista.get(1));
	}
}