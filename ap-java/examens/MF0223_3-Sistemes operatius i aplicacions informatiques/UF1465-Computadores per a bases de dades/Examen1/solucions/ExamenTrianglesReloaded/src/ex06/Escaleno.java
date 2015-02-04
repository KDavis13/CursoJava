package ex06;

public class Escaleno extends Triangulo {
	
	public Escaleno(double l1, double l2, double l3) 
			throws EscalenoException 
	{
		super(l1, l2, l3);
		if (l1 == l2 || l2 == l3 || l1 == l3) {
			throw new EscalenoException();
		}
	}
}
