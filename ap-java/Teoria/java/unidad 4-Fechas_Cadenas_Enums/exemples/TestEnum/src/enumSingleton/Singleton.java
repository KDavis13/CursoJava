package enumSingleton;

public enum Singleton {
	INSTANCIA;
	private int random;
	
	private Singleton() {
		random = (int) (Math.random() * 100);
	}
	
	
	public void conectarBD() {
		System.out.println("Ahora estas conectado.");
		System.out.println("Random: " + random);
	}
	
	public int getRandom() {
		return random;
	}
}
