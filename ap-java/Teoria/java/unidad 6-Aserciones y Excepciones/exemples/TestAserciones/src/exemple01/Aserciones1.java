package exemple01;

public class Aserciones1 {
	
	public static void main(String[] args) {
		
		int a=10;
		
		// ojo, at�s qu� 'a' val 10
		// no es compleix l'asserci�
		// per tant, es genera una AssertionError
		assert a >=0 && a <= 5 : "\na val: " + a + 
				" i no hauria de ser mes gran de 5!";
		
		System.out.println("Todo ha ido bien,a="+
				a+", est� en el rango 0-5 esperado");
	}
}
