package ejercicio6;

public class TrianguloEscaleno extends Triangulo {

	// Constructor
	public TrianguloEscaleno(double lado1, double lado2, double lado3)
			throws NoEscalenoException {
		
		super(lado1, lado2, lado3);

		boolean iguales = comprobarLados(lado1, lado2, lado3);
		if (iguales == false) {
			throw new NoEscalenoException("No se ha creado el triángulo");
		}	

	}

	// Métodos privados
	private boolean comprobarLados(double lado1, double lado2, double lado3)
			throws NoEscalenoException {
		if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			return true;

		} else
			throw new NoEscalenoException(
					"El triangulo escaleno no puede tener 2 lados iguales");

	}
}
