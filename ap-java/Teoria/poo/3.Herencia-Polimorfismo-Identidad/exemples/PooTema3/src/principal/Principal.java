package principal;

import java.util.Scanner;

import entidades.Alumno;
import entidades.AlumnoBecario;

public class Principal {

	public static void main(String[] args) {
		
		String textoUsuario = "";
		int dniUsuario = 0;
		float salario = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		AlumnoBecario becario = null;
		
		System.out.print("Nombre? ");		
		textoUsuario = sc.next();
		
		System.out.print("DNI? ");		
		dniUsuario = sc.nextInt();
		
		System.out.print("Salario? ");		
		salario = sc.nextFloat();
		
		becario = 
			new AlumnoBecario("1000A","12B",textoUsuario,dniUsuario);
		
		becario.setSalario(salario);
				
		System.out.println(becario);
				
		System.out.println("Total alumnos: " + Alumno.getContador());
		
		sc.close();
	}
}
