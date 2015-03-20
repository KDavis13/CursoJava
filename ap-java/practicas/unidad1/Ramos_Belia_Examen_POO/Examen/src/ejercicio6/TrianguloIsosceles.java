package ejercicio6;

public class TrianguloIsosceles extends Triangulo {

	public TrianguloIsosceles(double lado1, double lado2, double lado3)
			throws NoIsoscelesException, NoIsoscelesException2 {

		super(lado1, lado2, lado3);
		boolean iguales = comprobar(lado1, lado2, lado3);
		if (iguales == false) {
			throw new NoIsoscelesException("No se ha creado el triángulo");
		}
	}

	private boolean comprobar(double lado1, double lado2, double lado3)
			throws NoIsoscelesException, NoIsoscelesException2 {

		if (comprobarLados(lado1, lado2, lado3)) {
			return true;
		} else
			throw new NoIsoscelesException(
					"El triangulo isosceles debe tener al menos 2 lados iguales");

	}

	private boolean comprobarLados(double lado1, double lado2, double lado3)
			throws NoIsoscelesException2 {

		if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			if (lado1 != lado2 || lado2 != lado3) {
				return true;
			}
			throw new NoIsoscelesException2(
					"El triángulo isosceles no puede tener todos sus lados iguales.");
		}

		return false;
	}
}
