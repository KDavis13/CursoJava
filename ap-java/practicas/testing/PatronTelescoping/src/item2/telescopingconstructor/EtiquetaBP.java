package item2.telescopingconstructor;

// Builder Pattern
public class EtiquetaBP {

	private final int cantidad; // (mL) requerido
	private final int unidades; // (por envase) requerido
	private final int calorias; // (kcal) requerido
	
	private final int grasas; // (g) opcional
	private final int sodio; // (mg) opcional
	private final int potasio; // (mg) opcional
	private final int carbohidratos; // (g) opcional
	
	// ***********************************************
	
	public static class Builder {
		private final int cantidad; // (mL) requerido
		private final int unidades; // (por envase) requerido
		private final int calorias; // (kcal) requerido
		
		private int grasas = 0; // (g) opcional
		private int sodio = 0; // (mg) opcional
		private int potasio = 0; // (mg) opcional
		private int carbohidratos = 0; // (g) opcional
		
		// Constructor
		public Builder(int cantidad, int unidades, 
				int calorias) 
		{
			this.cantidad = cantidad;
			this.unidades = unidades;
			this.calorias = calorias;
		}
		
		public Builder grasas(int grasas) {
			this.grasas = grasas;
			return this;
		}
		
		public Builder sodio(int sodio) {
			this.sodio = sodio;
			return this;
		}
		
		public Builder potasio(int potasio) {
			this.potasio = potasio;
			return this;
		}
		
		public Builder carbohidratos(int carbohidratos) {
			this.carbohidratos = carbohidratos;
			return this;
		}
		
		// **********
		public EtiquetaBP build() {
			return new EtiquetaBP(this);
		}
	}
	
	// ***********************************************
	
	private EtiquetaBP(Builder builder) {
		this.cantidad = builder.cantidad;
		this.unidades = builder.unidades;
		this.calorias = builder.calorias;
		
		this.grasas = builder.grasas;
		this.sodio = builder.sodio;
		this.potasio = builder.potasio;
		this.carbohidratos = builder.carbohidratos;
	}
}
