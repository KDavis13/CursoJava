package uno;

import java.util.ArrayList;
import java.util.Collection;

public class TestGen2 {
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
		
		Collection<Alumno> miColecBecarios = new ArrayList<Alumno>();
		miColecBecarios.add(new AlumnoBecario("Sa�oh", "Java"));
		
		imprimirColeccAlumnos(miColecBecarios);
		
		Collection<AlumnoBecario> miColecBecarios2 = new ArrayList<AlumnoBecario>();
		miColecBecarios.add(new AlumnoBecario("Sa�oh", "Java"));
		
		//imprimirColeccAlumnosOSup(miColecBecarios2); //-> Peta por que Alumno Becario es hija de Alumno y solo acepta de las que hereda Alumno
	}
	
	
	static void imprimirColecc(Collection<?> c) {
		for (Object o: c)
			System.out.println(o);
	}
	
	static void imprimirColeccAlumnos(Collection<? extends Alumno> c) {
		for (Object o: c)
			System.out.println(o);
	}
	
	static void imprimirColeccAlumnosOSup(Collection<? super Alumno> c) {
		for (Object o: c)
			System.out.println(o);
	}
}