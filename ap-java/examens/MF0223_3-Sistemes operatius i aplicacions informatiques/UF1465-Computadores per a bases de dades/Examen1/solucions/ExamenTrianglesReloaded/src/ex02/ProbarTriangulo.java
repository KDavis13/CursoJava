package ex02;

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
	}

}
