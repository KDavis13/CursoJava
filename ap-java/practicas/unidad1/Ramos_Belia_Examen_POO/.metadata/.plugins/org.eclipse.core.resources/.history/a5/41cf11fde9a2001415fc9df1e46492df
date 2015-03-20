package ejercicio5;

public class TrianguloEquilatero extends Triangulo {

	// Constructor
	public TrianguloEquilatero(double lado1, double lado2, double lado3)
			throws NoEquilateroException {

		super(lado1, lado2, lado3);
		boolean iguales = comprobarLados(lado1, lado2, lado3);
		if (iguales == false) {
			throw new NoEquilateroException("No se ha creado el triángulo");
		}
			

	}

	private boolean comprobarLados(double lado1, double lado2, double lado3)
			throws NoEquilateroException {
		if (lado1 == lado2 && lado2 == lado3) {
			return true;
		} else
			throw new NoEquilateroException(
					"El triangulo equilatero debe tener 3 lados iguales");

	}

}
