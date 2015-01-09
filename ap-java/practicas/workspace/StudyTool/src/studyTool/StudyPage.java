package studyTool;

import java.util.Scanner;

/**
 * 
 * @author poo
 * Soy un comentario java doc
 *
 */

public class StudyPage {
	
	/**
	 * Metodo principal por el cual comenta la aplicaci�n
	 * @param args parametros por linea de comando
	 */

	public static void main(String[] args) {
		//Objeto que permite leer del teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entra una paraula: ");
		String paraula = sc.nextLine();
		
		System.out.println("Entra una definicio: ");
		String definicio = sc.nextLine();
		
		System.out.println(paraula + " significa " + definicio);
		
		/*
		 * Hace falta cerrar el escaner
		 * para liberar los buffers del teclado
		 */
		
		sc.close();

	}

}