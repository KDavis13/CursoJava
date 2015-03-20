package ejercicio5;

/*
 * Afegir un constructor a la classe Triangulo que permeti crear una 
 * instancia amb valors pels seus tres costats. 
 * Crear un nou objecte (tri3) mitjant�ant aquest nou  constructor en el main 
 * de ProbarTriangulo.
 * Mostrar per pantalla el per�metre del nou triangle.
 */

public class ProbarTriangulo {

	public static void main(String[] args)  {
		Triangulo tri1 = new Triangulo();
		Triangulo tri2 = new Triangulo();

		tri1.setLado1(5.4);
		tri1.setLado2(6.7);
		tri1.setLado3(8.1);

		tri2.setLado1(2.3);
		tri2.setLado2(1.5);
		tri2.setLado3(3.3);

		System.out.println("El per�metro del tri�ngulo 1 es "
				+ tri1.perimetro());
		System.out.println("El per�metro del tri�ngulo 2 es "
				+ tri2.perimetro());

		Triangulo tri3 = new Triangulo(6.1, 8.4, 6.1);

		System.out.println("el per�metro del tri�ngulo 3 es "
				+ tri3.perimetro());
		
		crearTri4();
		crearTri5();
		crearTri6();
		

	}
	
	private static void crearTri4(){
		try {
			TrianguloEquilatero tri4 = new TrianguloEquilatero(2.2, 2.2, 2.2);
			System.out.println("El per�metro del tri�ngulo 4 es " + tri4.perimetro());

		} catch (NoEquilateroException e) {
			System.out.println("El tri�ngulo equilatero tiene sus 3 lados iguales.");
		}
	}
	
	private static void crearTri5(){
		try {
			TrianguloIsosceles tri5 = new TrianguloIsosceles(2.2, 2.4, 2.2);
			System.out.println("El per�metro del tri�ngulo 5 es " + tri5.perimetro());

		} catch (NoIsoscelesException e) {
			System.out.println("El tr�angulo Isosceles no se ha creado por que tiene que"
					+ " tener al menos 2 lados iguales");
		} catch (NoIsoscelesException2 ei) {
			System.out.println("El tri�ngulo Isosceles no se ha creado por que tiene que"
					+ " tener tan solo 2 lados iguales");
		}
	}
	
	private static void crearTri6(){
		try {
			TrianguloEscaleno tri6 = new TrianguloEscaleno(2.2, 2.1, 2.4);
			System.out.println("El per�metro del tri�ngulo 6 es " + tri6.perimetro());

		} catch (NoEscalenoException e) {
			System.out.println("El tri�ngulo escaleno no puede tener ning�n lado igual");
		}
	}

}
