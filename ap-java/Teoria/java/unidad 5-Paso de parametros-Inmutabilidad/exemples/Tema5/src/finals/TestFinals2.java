package finals;

class Alumno {
	String nom;
}

public class TestFinals2 {

	private final Alumno alumno = new Alumno();
	
	public TestFinals2() {
		alumno.nom = "Pepe";
		System.out.println(alumno.nom);
		
		alumno.nom = "Paco";
		System.out.println(alumno.nom);
		
		// No compila perquè 'alumno' ès final 
		// i no pot apuntar a cap altre objecte
		// alumno = new Alumno();
	}
	
	public static void main(String[] args) {
		new TestFinals2();
	}

}
