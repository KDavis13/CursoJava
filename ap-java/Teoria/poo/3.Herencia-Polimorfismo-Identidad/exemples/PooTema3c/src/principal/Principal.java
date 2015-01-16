package principal;

import entidades.Alumno;
import entidades.AlumnoBecario;
import entidades.AlumnoDoctorando;

public class Principal {

	public static void main(String[] args) {
		Alumno alumno = 
				new Alumno("A100", "Pedro", 12345);
		
		AlumnoBecario becario =
				new AlumnoBecario("A101", "Raquel", 67890);
		becario.setSalario(856.0f);
		
		AlumnoDoctorando doct =
				new AlumnoDoctorando("A102", "Manel", 54543);
		doct.setTemaTesis("Anillos Abelianos");
		
		imprimirAlumno(alumno);
		imprimirAlumno(becario);
		imprimirAlumno(doct);		
	}

	private static void imprimirAlumno(Alumno alumno) {
				
		System.out.println(alumno);
		
		/*if (clase.equals("AlumnoBecario")) {
			float salari = ((AlumnoBecario) alumno).getSalario();
			System.out.println(salari);
		} else if (clase.equals("AlumnoDoctorando")) {
			String tesis = ((AlumnoDoctorando) alumno).getTemaTesis();
			System.out.println(tesis);
		}*/ 
	}
	
	/*private static void imprimirAlumno(Alumno alumno) {
		
		// Obtenim el nom de classe de l'alumne en curs
		String clase = alumno.getClass().getSimpleName();
		
		// Aquests 2 mètodes sempre es criden a la 
		// classe Alumno perquè no hi son a les subclasses
		String nom = alumno.getNombre();
		String dni = alumno.getDni() + "";
		
		// Es crida a getCodigo polimorficament, perquè
		// està definit a totes les classes
		String codi = alumno.getCodigo();
		
		System.out.println(clase + " - " + nom + 
				" - " + dni + " - " + codi);
		System.out.println("_______________________________");
	}*/
	
}
