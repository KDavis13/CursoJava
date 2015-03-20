package ejercicio6;

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

		//System.out.println("El per�metro del tri�ngulo 1 es " + tri1.perimetro());
		//System.out.println("El per�metro del tri�ngulo 2 es " + tri2.perimetro());

		Triangulo tri3 = new Triangulo(6.1, 8.4, 6.1);

		//System.out.println("el per�metro del tri�ngulo 3 es " + tri3.perimetro());
		
		TrianguloEquilatero tri4 = crearTri4();
		TrianguloIsosceles tri5 = crearTri5();
		TrianguloEscaleno tri6 = crearTri6();
		
		Triangulo[] triangulos = new Triangulo[6];
		
		triangulos[0] = tri1;
		triangulos[1] = tri2;
		triangulos[2] = tri3;
		triangulos[3] = tri4;
		triangulos[4] = tri5;
		triangulos[5] = tri6;
		
		imprimirTriangulos(triangulos);
	}
	
	private static void imprimirTriangulos(Triangulo[] triangulos) {
		for(int i = 0; i<triangulos.length; i++){
			if(i == 0 || i == 4 || i == 5){
				System.out.println("Soy un " + triangulos[i].getClass().getSimpleName() +
						", y mi per�metro es " + triangulos[i].perimetro());
			}
		}
		
	}

	private static TrianguloEquilatero crearTri4(){
		try {
			TrianguloEquilatero tri4 = new TrianguloEquilatero(2.2, 2.2, 2.2);
			//System.out.println("El per�metro del tri�ngulo 4 es " + tri4.perimetro());
			return tri4;

		} catch (NoEquilateroException e) {
			System.out.println("El tri�ngulo equilatero tiene sus 3 lados iguales.");
			return null;
		}
		
	}
	
	private static TrianguloIsosceles crearTri5(){
		try {
			TrianguloIsosceles tri5 = new TrianguloIsosceles(2.2, 2.4, 2.2);
			//System.out.println("El per�metro del tri�ngulo 5 es " + tri5.perimetro());
			return tri5;
		} catch (NoIsoscelesException e) {
			System.out.println("El tr�angulo Isosceles no se ha creado por que tiene que"
					+ " tener al menos 2 lados iguales");
			return null;
		} catch (NoIsoscelesException2 ei) {
			System.out.println("El tri�ngulo Isosceles no se ha creado por que tiene que"
					+ " tener tan solo 2 lados iguales");
			return null;
		}
		
	}
	
	private static TrianguloEscaleno crearTri6(){
		try {
			TrianguloEscaleno tri6 = new TrianguloEscaleno(2.2, 2.1, 2.4);
			//System.out.println("El per�metro del tri�ngulo 6 es " + tri6.perimetro());
			return tri6;

		} catch (NoEscalenoException e) {
			System.out.println("El tri�ngulo escaleno no puede tener ning�n lado igual");
			return null;
		}
	}

}
