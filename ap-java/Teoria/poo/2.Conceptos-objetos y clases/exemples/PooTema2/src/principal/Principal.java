package principal;

import java.util.Scanner;
import entidades.Alumno;

public class Principal {

	private static final int MAX_ALUMNOS = 2;

	public static void main(String[] args) {
		
		String textoUsuario = "";
		int dniUsuario = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
		
		for (int i=0; i < alumnos.length; i++) {
			System.out.print("Nombre? ");		
			textoUsuario = sc.next();
		
			System.out.print("DNI? ");		
			dniUsuario = sc.nextInt();
		
			alumnos[i] = new Alumno(textoUsuario, dniUsuario);
				
			System.out.println("El nombre es: " + alumnos[i].getNombre() + 
				" y el dni es: " + alumnos[i].getDni());
		}
		
		System.out.println("Total alumnos: " + Alumno.getContador());
		
		for (Alumno alumno : alumnos)
			System.out.println(alumno);
		
		sc.close();
	}
}
