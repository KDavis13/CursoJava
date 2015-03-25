public class EtiquetaJBeans {

	private int cantidad = -1; // (mL) requerido, sin valor predeterminado
	private int unidades = -1; // (x envase)requerido,sin valor predeterminado
	private int calorias = -1; // (kcal) requerido, sin valor predeterminado

	private int grasas = 0; // (g) opcional
	private int sodio = 0; // (mg) opcional
	private int potasio = 0; // (mg) opcional
	private int carbohidratos = 0; // (g) opcional

	// Constructor predeterminado
	public EtiquetaJBeans() {

	}

	// Setters
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public void setGrasas(int grasas) {
		this.grasas = grasas;
	}

	public void setSodio(int sodio) {
		this.sodio = sodio;
	}

	public void setPotasio(int potasio) {
		this.potasio = potasio;
	}

	public void setCarbohidratos(int carbohidratos) {
		this.carbohidratos = carbohidratos;
	}

	public static void main(String[] args) {

		EtiquetaJBeans cocacola = new EtiquetaJBeans();

		cocacola.setCantidad(240);
		cocacola.setUnidades(8);
		cocacola.setCalorias(100);
		cocacola.setGrasas(0);
		cocacola.setSodio(35);
		cocacola.setPotasio(27);
		
		EtiquetaJBeans orchata = new EtiquetaJBeans();

		orchata.setCantidad(305);
		orchata.setUnidades(9);
		orchata.setCalorias(115);
		orchata.setGrasas(4);

	}
}