package exemple01;

public class Main {

	public static void main(String[] args) {
		
		int numerador = 10, denominador = 1;
		
		// En el try va el codi susceptible
		// de llen�ar excepcions
		try {
			int resultado = numerador / denominador;
			System.out.println(resultado);
			
		// En el catch capturem l'excepci�	
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException");
			System.out.println("Has intentado dividir por 0");			
		} catch (Exception e) {
			System.out.println("Exception");						
		}	
		
		// Aix� sempre s'executa perqu� el programa
		// finalitza amb normalitat
		System.out.println("Programa finalizado.");				
	}
}