package ejercicio6;

public class Triangulo {

	private double lado1, lado2, lado3;

	// Getters
	public Double getLado1() {
		return lado1;
	}

	public Double getLado2() {
		return lado2;
	}

	public Double getLado3() {
		return lado3;
	}

	// Setters
	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}

	public void setLado3(Double lado3) {
		this.lado3 = lado3;
	}

	// Constructores
	public Triangulo() {

	}

	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	//Otros métodos
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}
}
