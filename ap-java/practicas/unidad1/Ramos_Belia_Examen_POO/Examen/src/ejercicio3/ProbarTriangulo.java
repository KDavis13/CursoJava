package ejercicio3;

/*
 * Afegir un constructor a la classe Triangulo que permeti crear una 
 * instancia amb valors pels seus tres costats. 
 * Crear un nou objecte (tri3) mitjant�ant aquest nou  constructor en el main 
 * de ProbarTriangulo.
 * Mostrar per pantalla el per�metre del nou triangle.
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
		
		Triangulo tri3 = new Triangulo(6.1, 8.4, 6.1);
		
		System.out.println("el per�metro del tri�ngulo 3 es " + tri3.perimetro());
	}

}
