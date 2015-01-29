package mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Profesor {
	int codigo;
	String nombre;

	public Profesor(int c, String n) {
		this.codigo = c;
		this.nombre = n;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String toString() {
		return this.codigo + " - " + this.nombre;
	}
}

public class TestLinkedHashMap {

	private final static Profesor[] profesores = {
			new Profesor(1, "Antonio Ferranz"),
			new Profesor(6, "Belen Martin"),
			new Profesor(3, "Carmelo Sanchez"),
			new Profesor(4, "Damian Burgos"), 
			new Profesor(5, "Julian Roman"),
			new Profesor(2, "Zacarias Gomez") };

	private static void rellenar(
			Map<Integer, Profesor> mprofesores, Profesor[] p) 
	{
		for (int i = 0; i < p.length; i++) {
			mprofesores.put(p[i].getCodigo(), p[i]);
		}
	}

	private static void probando(
			Map<Integer, Profesor> mprofesores,
			Profesor[] p) 
	{
		System.out.println("Probando " + 
				mprofesores.getClass().getName());
		
		rellenar(mprofesores, p);
		
		for (Profesor profesor : mprofesores.values())
			System.out.println(profesor);
		
		System.out.println();
	}

	public static void main(String[] args) {

		// HashMap: no garantiza la ordenacion
		probando(new HashMap<Integer, Profesor>(), profesores);

		// LinkedHashMap: no ordena, añade tal y como vienen los datos
		probando(new LinkedHashMap<Integer, Profesor>(), profesores);

		// TreeMap: siempre ordenará los datos por la clave
		probando(new TreeMap<Integer, Profesor>(), profesores);
	}
}
