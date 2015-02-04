package ex06;

public class ProbarTriangulo {

	public static void main(String[] args) {
		
		Triangulo[] triangulos = new Triangulo[6];
		int cont = 0;
		
		Triangulo tri1 = new Triangulo();		
		tri1.setLado1(5.8);
		tri1.setLado2(4.4);
		tri1.setLado3(6.0);
		System.out.println("Perimetro de tri1: " + tri1.perimetro());
		triangulos[cont++] = tri1;
		
		Triangulo tri2 = new Triangulo();
		tri2.setLado1(8.1);
		tri2.setLado2(7.9);
		tri2.setLado3(10.0);
		System.out.println("Perimetro de tri2: " + tri2.perimetro());
		triangulos[cont++] = tri2;
		
		Triangulo tri3 = new Triangulo(3.8, 6.9, 1.7);		
		System.out.println("Perimetro de tri3: " + tri3.perimetro());
		triangulos[cont++] = tri3;
		
		try {
			Equilatero equi1 = new Equilatero(6.6, 6.6, 6.7);
			System.out.println("Perimetro de equi1: " + equi1.perimetro());
			triangulos[cont++] = equi1;
		} catch (EquilateroException e) {			
			e.printStackTrace();
		}
		
		try {
			Isosceles iso1 = new Isosceles(5.5, 5.5, 1.0);
			System.out.println("Perimetro de iso1: " + iso1.perimetro());
			triangulos[cont++] = iso1;
		} catch (IsoscelesException e) {			
			e.printStackTrace();
		}
		
		try {
			Escaleno esca1 = new Escaleno(4.6, 8.8, 9.1);
			System.out.println("Perimetro de esca1: " + esca1.perimetro());
			triangulos[cont++] = esca1;
		} catch (EscalenoException e) {			
			e.printStackTrace();
		}
		
		boolean firstTime = true;
		for (Triangulo triangulo : triangulos) {			
			if (triangulo.getClass() == Isosceles.class) {
				System.out.println(Isosceles.class + " - " + triangulo.perimetro());
			} else if (triangulo.getClass() == Escaleno.class) {
				System.out.println(Escaleno.class + " - " + triangulo.perimetro());
			} else if (firstTime && triangulo.getClass() == Triangulo.class) {
				firstTime = false;
				System.out.println(Triangulo.class + " - " + triangulo.perimetro());
			}
		}
	}

}
