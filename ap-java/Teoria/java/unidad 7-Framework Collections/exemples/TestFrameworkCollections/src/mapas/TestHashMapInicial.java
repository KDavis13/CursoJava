package mapas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMapInicial {
	
	private static Map<String, String[]> cursos;
	
	static {
		String[] asignaturas =
			{".NET","php","Java"};
		
		String[] alumnos =
			{"Maria","Juan","Pedro","Jaime","Rosa"};
				
		cursos = new ConcurrentHashMap<>();
		
		cursos.put(asignaturas[0], // .NET
				new String[] {
					alumnos[0], alumnos[1]
				});
		cursos.put(asignaturas[1], // php
				new String[] {
					alumnos[0], alumnos[2], alumnos[4] 
				});
		cursos.put(asignaturas[2], // Java
				new String[] {
					alumnos[1], alumnos[3], alumnos[4] 
				});
	}
	
	public static void main(String[] args) {
		
		// Obtenemos las claves del mapa
		Set<String> asignaturas = cursos.keySet();
		recorrer(asignaturas);
		
		// Obtenemos los valores del mapa
		Collection<String[]> alumnos = cursos.values();
		recorrerArray(alumnos);
		
		// Lo pasamos a List porque Collection no tiene
		// m�todo get, el cual es necesario para obtener
		// un s�lo elemento de la lista (en el ejemplo 
		// queremos �nicamente los alumnos que cursan php,
		// esto es, el �ndice 1) 
		List<String[]> aux = new ArrayList<String[]>(alumnos);
		
		String[] alumnosPhp = aux.get(1);
		
		System.out.println("Alumnos que cursan php: " 
				+ Arrays.toString(alumnosPhp));				
		
		// Vemos el m�todo containsKey
		String resultado = 
				cursos.containsKey("php") ? "Si" : "No";
		
		System.out.println("Se da el curso de php? " + resultado);
		
		// Vemos el m�todo containsValue
		resultado = 
				cursos.containsValue(alumnosPhp) ? "Si" : "No";
		
		System.out.println("Rosa estudia aqu� ? " + resultado);
		
		for (Entry<String, String[]> entrada : cursos.entrySet()) {
			String asignatura = entrada.getKey();
			System.out.println("Asignatura: " + asignatura);
			
			String[] alumnosDeLaAsignatura = entrada.getValue();
			System.out.println(Arrays.toString(alumnosDeLaAsignatura));
		}
	}

	private static void recorrer(Collection<String> coleccion) {
		for (String elemento : coleccion) {
			System.out.print(elemento + " ");
		}	
		System.out.println();
	}
	
	private static void recorrerArray(Collection<String[]> coleccion) {
		for (String[] elementos : coleccion) {
			for (String elemento : elementos) {
				System.out.print(elemento + " ");
			}	
			System.out.println();
		}		
	}

}
