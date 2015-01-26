package singleton;

/*
 * Classe que implementa el patrí Singleton.
 * Només es pot crear un objecte d'aquesta classe.
 */
public class Singleton {
	
	private static Singleton INSTANCIA = null;	
	private int random;
	
	// Evitem que l'usuari façi 'new'
	private Singleton() {	
		random = (int) (Math.random() * 100);
		System.out.println("El constructor se ha ejecutado");
	}
	
	/*
	 * Mètode public estàtic de factoria.
	 * L'usuari l'ha de invocar per tal 
	 * d'aconseguir l'objecte (l'unic que hi ha)
	 */
	public static Singleton getSingleton() {
		if (INSTANCIA == null) {
			INSTANCIA = new Singleton();
		}
		return INSTANCIA;
	}
	
	public void conectarBD() {
		System.out.println("Ahora estas conectado.");
		System.out.println("Random: " + random);
	}
}
