package ex05;

public class Equilatero extends Triangulo {
	
	private Equilatero(double l1, double l2, double l3) 
			throws EquilateroException
	{
		super(l1, l2, l3);	
	}
	
	public static Equilatero 
		crear(double l1, double l2, double l3) 
				throws EquilateroException 
	{
		if (!(l1 == l2 && l1 == l3)) {
			throw new EquilateroException();
		}
		
		return new Equilatero(l1, l2, l3);
	}
}
