package finals;

public class TestFinals {

	// Una constant
	private static final double PI = 3.1415;
	
	// Un atribut que només pot ser 
	// escrit una vegada
	private final int valor;	
	
	public TestFinals(int num) {
		valor = num;
		System.out.println(valor);		
	}
	
	public static void main(String[] args) {
		new TestFinals(5); // crido al constructor
		new TestFinals(12); // crido al constructor
	}

}
