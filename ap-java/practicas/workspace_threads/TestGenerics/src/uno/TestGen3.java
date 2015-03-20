package uno;

import java.util.ArrayList;
import java.util.Collection;

public class TestGen3 {
	public static void main(String[] args) {
		Collection<Object> miColec = new ArrayList<Object>();
		miColec.add(45.8);
		miColec.add(new java.util.Date());
		miColec.add(null);
		miColec.add("Perico");
		imprimirColecc(miColec);

		Collection<Alumno> miColecAlumnos = new ArrayList<Alumno>();
		miColecAlumnos.add(new Alumno("Juan"));
		miColecAlumnos.add(new Alumno("Raquel"));
		imprimirColecc(miColecAlumnos);
		
	}
	
	/*static void addColecc(Object obj, Collection<?> c) {
		c.add(obj);
	}*/
	
	
	static void imprimirColecc(Collection<?> c) {
		for (Object o: c)
			System.out.println(o);
	}

}