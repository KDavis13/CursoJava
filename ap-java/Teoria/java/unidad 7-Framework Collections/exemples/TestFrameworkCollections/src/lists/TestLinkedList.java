package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

  public static void main(String[] args) {
	  
	List<String> libros = new ArrayList<String>();
	
	libros.add("Hume");
	libros.add("Voltaire");
	libros.add("Spinoza");
	libros.add("Kant");

	System.out.println("Libros iniciales:");
	
	for (String x : libros)
		System.out.print(x + " ");

	// Cambiamos de implementacion
	libros = new LinkedList<String>(libros);

	// Reemplazar el que ocupa la tercera posicion (Spinoza) por Freud
		libros.set(2, "Freud");
	
	// Eliminar el libro Voltaire
		libros.remove("Voltaire");

		// Insertar en la primera posicion
	   // No podemos usar esto dado que estamos 
	   // trabajando con la interfaz List	
	   // libros.addFirst("Nietzche");
		
		libros.add(0,"Nietzche");

		// Insertar en la cuarta posición: implica que el libro actualmente 
	   // en esa posición y los posteriores incrementen su índice una unidad
		libros.add(3,"X");

		System.out.println("\n\nLibros resultantes:");

		// Volvemos a cambiar de implementacion
		libros=new ArrayList<String>(libros);

		for (String x: libros) 
	   		System.out.print(x+" ");
		}
	}
