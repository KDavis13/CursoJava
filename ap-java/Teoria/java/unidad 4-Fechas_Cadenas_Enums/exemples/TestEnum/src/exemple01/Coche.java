package exemple01;

public enum Coche {
	
	FERRARI("F50", 4700), 
	LAMBORGHINI("Murcielago", 6000),    
	PORSCHE("959", 2850);
	
	public final String modelo;
	public final int cilindrada;
	
	private Coche(String modelo, int cilindrada) {
		this.modelo = modelo;
		this.cilindrada = cilindrada;		
	}	
	
	public String toString() {
		return this.name() + 
				" - Modelo: " + this.modelo +
				" - Cilindrada: " + this.cilindrada;
	}
}
