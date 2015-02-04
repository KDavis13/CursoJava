package ex05;

public class Equilatero extends Triangulo {
	
	public Equilatero(double l1, double l2, double l3) 
			throws EquilateroException
	{
		super(l1, l2, l3);
		if (!(l1 == l2 && l1 == l3)) {
			throw new EquilateroException();
		}		
	}
}
