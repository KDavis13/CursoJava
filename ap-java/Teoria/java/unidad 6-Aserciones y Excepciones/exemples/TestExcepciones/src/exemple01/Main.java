package exemple01;

public class Main {

	public static void main(String[] args) {
		
		int numerador = 10, denominador = 1;
		
		// En el try va el codi susceptible
		// de llençar excepcions
		try {
			int resultado = numerador / denominador;
			System.out.println(resultado);
			
		// En el catch capturem l'excepció	
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException");
			System.out.println("Has intentado dividir por 0");			
		} catch (Exception e) {
			System.out.println("Exception");						
		}	
		
		// Això sempre s'executa perquè el programa
		// finalitza amb normalitat
		System.out.println("Programa finalizado.");				
	}
}