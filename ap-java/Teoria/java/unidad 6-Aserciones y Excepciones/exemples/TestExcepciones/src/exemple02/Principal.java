package exemple02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Alumno alumno;
		String textoUsuario = "";

		System.out.print("Nombre? ");
		Scanner sc = new Scanner(System.in);
		textoUsuario = sc.next();

		boolean continuar = false;
		int dni = 0;
		do {
			try {
				System.out.print("dni? ");
				sc = new Scanner(System.in);
				dni = sc.nextInt();
				continuar = true;
			} catch (Exception e) {
				System.out.println("El dni debe ser numerico");
			}
		} while (!continuar);

		// Ahora podemos crear al alumno
		alumno = new Alumno(textoUsuario, dni);

		System.out.println("El nombre es: " + alumno.getNombre()
				+ " y el dni es: " + alumno.getDni());
	}
}
