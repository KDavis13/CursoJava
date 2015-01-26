package singleton;

public class TestSingleton {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getSingleton();

		singleton.conectarBD();

		// ***************************

		Singleton singleton2 = Singleton.getSingleton();

		singleton2.conectarBD();

		// ***************************

		Singleton singleton3 = Singleton.getSingleton();

		singleton3.conectarBD();
	}

}
