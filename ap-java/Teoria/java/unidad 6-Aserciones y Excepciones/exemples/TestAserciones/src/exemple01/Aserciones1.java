package exemple01;

public class Aserciones1 {
	
	public static void main(String[] args) {
		
		int a=10;
		
		// ojo, atès què 'a' val 10
		// no es compleix l'asserció
		// per tant, es genera una AssertionError
		assert a >=0 && a <= 5 : "\na val: " + a + 
				" i no hauria de ser mes gran de 5!";
		
		System.out.println("Todo ha ido bien,a="+
				a+", está en el rango 0-5 esperado");
	}
}
