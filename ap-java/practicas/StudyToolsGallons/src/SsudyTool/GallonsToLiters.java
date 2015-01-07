package SsudyTool;

import java.util.Scanner;

public class GallonsToLiters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double litros = 3.785;
		
		System.out.println("Improduce nœmero de Galones: ");
		String galones = sc.nextLine();
		double galonesParseados = Double.parseDouble(galones);
		
		double resultado = galonesParseados * litros;
		
		System.out.println(galones + " son " + resultado + " litros.");

		sc.close();
	}

}
