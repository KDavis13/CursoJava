package ex02;

public class Triangulo {
	
	private double lado1, lado2, lado3;
	
	public Triangulo() {
		
	}
	
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
}
