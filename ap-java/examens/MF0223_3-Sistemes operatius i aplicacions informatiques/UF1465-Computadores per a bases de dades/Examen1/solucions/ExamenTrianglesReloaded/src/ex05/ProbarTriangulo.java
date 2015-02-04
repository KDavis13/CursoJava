package ex05;

public class ProbarTriangulo {

	public static void main(String[] args) {
		
		Triangulo tri1 = new Triangulo();		
		tri1.setLado1(5.8);
		tri1.setLado2(4.4);
		tri1.setLado3(6.0);
		System.out.println("Perimetro de tri1: " + tri1.perimetro());
		
		Triangulo tri2 = new Triangulo();
		tri2.setLado1(8.1);
		tri2.setLado2(7.9);
		tri2.setLado3(10.0);
		System.out.println("Perimetro de tri2: " + tri2.perimetro());
		
		Triangulo tri3 = new Triangulo(3.8, 6.9, 1.7);		
		System.out.println("Perimetro de tri3: " + tri3.perimetro());
		
		try {
			Equilatero equi1 = Equilatero.crear(6.6, 6.6, 6.6);
			System.out.println("Perimetro de equi1: " + equi1.perimetro());
		} catch (EquilateroException e) {			
			e.printStackTrace();
		}
		
		try {
			Isosceles iso1 = new Isosceles(5.5, 5.5, 1.0);
			System.out.println("Perimetro de iso1: " + iso1.perimetro());
		} catch (IsoscelesException e) {			
			e.printStackTrace();
		}
		
		try {
			Escaleno esca1 = new Escaleno(4.6, 8.8, 9.1);
			System.out.println("Perimetro de esca1: " + esca1.perimetro());
		} catch (EscalenoException e) {			
			e.printStackTrace();
		}
	}

}
