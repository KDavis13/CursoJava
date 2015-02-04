package ex06;

public class Isosceles extends Triangulo {
	public Isosceles(double l1, double l2, double l3) 
			throws IsoscelesException
	{
		super(l1, l2, l3);
		if (!(
				(l1 == l2 && l1 != l3) || 
				(l1 == l3 && l1 != l2) || 
				(l2 == l3 && l1 != l2)
		   ))		{
			throw new IsoscelesException();
		}		
	}
}
