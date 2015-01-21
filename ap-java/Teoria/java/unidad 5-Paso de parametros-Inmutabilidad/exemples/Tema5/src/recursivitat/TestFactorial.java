package recursivitat;

public class TestFactorial {

	public static void main(String[] args) {
		long resultat =
				fact(Integer.valueOf(args[0]));
		
		System.out.println("El factorial de " + 
				args[0] + " és: " + resultat );
	}

	/*
	 * Funció recursiva
	 */
	private static long fact(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * fact(num - 1);
		}
	}

}
