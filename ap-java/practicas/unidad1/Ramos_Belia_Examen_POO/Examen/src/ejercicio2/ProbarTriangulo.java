package ejercicio2;

/*
 * Crear una classe ProbarTriangulo que �nicament tingui un m�tode main per tal de:
 * 
 *  crear dos triangles (tri1 i tri2) a partir del default constructor. 
 *  
 *  poder dimensionar els triangles (establir les mides dels costats) mitjan�ant
 *   m�todes setters. 
 *   
 *   mostrar per pantalla el per�metre dels dos triangles.
 */

public class ProbarTriangulo {
	
	public static void main(String[] args) {
		Triangulo tri1 = new Triangulo();
		Triangulo tri2 = new Triangulo();
		
		tri1.setLado1(5.4);
		tri1.setLado2(6.7);
		tri1.setLado3(8.1);
		
		tri2.setLado1(2.3);
		tri2.setLado2(1.5);
		tri2.setLado3(3.3);
		
		System.out.println("El per�metro del tri�ngulo 1 es " + tri1.perimetro());
		System.out.println("El per�metro del tri�ngulo 2 es " + tri2.perimetro());
	}

}
