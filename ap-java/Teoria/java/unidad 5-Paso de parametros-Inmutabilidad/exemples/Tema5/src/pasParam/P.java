package pasParam;

public class P {

	// par�metres formals 'int n'
	// els params. formals solament
	// es veuen a dins del m�tode
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