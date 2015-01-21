package pasParam;

public class P {

	// paràmetres formals 'int n'
	// els params. formals solament
	// es veuen a dins del mètode
	static void f(int n) {
		System.out.println(++n);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(n);
		
		// parametres reals: 'n' 
		f(n);
		
		System.out.println(n);
	}
}