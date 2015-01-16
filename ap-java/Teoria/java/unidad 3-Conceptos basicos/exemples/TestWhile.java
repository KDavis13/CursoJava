
public class TestWhile {

	private static final int LIMITE = 100;
	private static final int EDAT_ADULT = 18;

	public static void main(String[] args) {
		
		int num = getRandomNumber();
		System.out.println(num);
				
		int votants = 0;
		
		boolean esPar = num % 2 == 0;
		
		while (num >= EDAT_ADULT && !esPar) {
			votants++;
			num = getRandomNumber();
			
			System.out.println(num);
			if (num == 69) break;
			esPar = num % 2 == 0;
		}
		
		System.out.println("total votants: " + votants);
		
		if (esPar) {
			System.out.println("El numero es parell");
		}	
	}

	private static int getRandomNumber() {		
		return (int) (Math.random() * LIMITE) + 1;
	}

}
