
public class TestFor {

	public static void main(String[] args) {
		
		// mostrar numeros parells del 0 al 10
		/*for(int i = 0; i < 11; i += 2) {
			System.out.print(i + " ");
		}*/
		
		for(int i = 0, j = 4; // inicialització
				i < 11 && j > 0; // condicio continuitat
				i += 2, j--) // increment
		{
			System.out.print(i + ", " + j + "_ ");
		}
	}

}
