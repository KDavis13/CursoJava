package uno;

import java.util.ArrayList;
import java.util.Collection;

public class TestGen4 {
	public static void main(String[] args) {
		Collection<Object> miColec = new ArrayList<Object>();
		addColecc(45.8, miColec);
		addColecc(new java.util.Date(), miColec);
		addColecc(null, miColec);
		addColecc("Perico", miColec);
		
		imprimirColecc(miColec);

		Collection<Alumno> miColecAlumnos = new ArrayList<Alumno>();
		addColecc(new Alumno("Juan"), miColecAlumnos);
		addColecc(new Alumno("Raquel"), miColecAlumnos);
		
		imprimirColecc(miColecAlumnos);
		
	}
	
	static <T> void addColecc(T object, Collection<T> c) {
		c.add(object);
	}
	
	
	static <T> void imprimirColecc(Collection<T> c) {
		for (T o: c)
			System.out.println(o);
	}

}