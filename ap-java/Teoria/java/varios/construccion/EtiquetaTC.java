
/* Patr�n Telescoping constructor
 * 
 * No escala bien cuando el contructor requiere 
 * muchos par�metros opcionales */

public class EtiquetaTC {

	// Hacemos que los atributos s�lo se puedan establecer
	// en la creaci�n del objeto (los hacemos final)
	
	private final int cantidad; // (mL) requerido
	private final int unidades; // (por envase) requerido
	private final int calorias; // (kcal) requerido
	
	private final int grasas; // (g) opcional
	private final int sodio; // (mg) opcional
	private final int potasio; // (mg) opcional
	private final int carbohidratos; // (g) opcional

	/*
	 * Este constructor es invocado cuando se crea el objeto 
	 * s�lo con los campos requeridos. Notad como invoca en 
	 * cascada al constructor que recibe los
	 * tres par�metros requeridos m�s uno opcional
	 */
	// Constructor num 1
	public EtiquetaTC(int cantidad, int unidades, 
			int calorias) 
	{
		// mediante 'this' llamamos a otro constructor
		this(cantidad, unidades, calorias, 0);
	}

	// Constructor num 2
	public EtiquetaTC(int cantidad, int unidades, 
			int calorias, int grasas) 
	{
		// Se pasa el control al contructor que recibe los tres
		// par�metros obligatorios m�s dos opcionales
		this(cantidad, unidades, calorias, grasas, 0);
	}

	// Constructor num 3
	public EtiquetaTC(int cantidad, int unidades, 
			int calorias, int grasas, int sodio) 
	{
		// Se pasa el control al contructor que recibe los tres
		// par�metros obligatorios m�s tres opcionales
		this(cantidad, unidades, calorias, grasas, sodio, 0);
	}

	// Constructor num 4
	public EtiquetaTC(int cantidad, int unidades, 
			int calorias, int grasas, int sodio, int potasio) 
	{
		// Se pasa el control al contructor que recibe los tres
		// par�metros obligatorios m�s cuatro opcionales
		this(cantidad, unidades, calorias, grasas, sodio, potasio, 0);
	}

	// Constructor que realiza el volvado de los par�metros en los 
	// atributos Constructor num 5
	public EtiquetaTC(int cantidad, int unidades, 
			int calorias, int grasas, int sodio, int potasio, 
			int carbohidratos) 
	{
		this.cantidad = cantidad;
		this.unidades = unidades;
		this.calorias = calorias;
		this.grasas = grasas;
		this.sodio = sodio;
		this.potasio = potasio;
		this.carbohidratos = carbohidratos;
	}

	public static void main(String[] args) {
		
		EtiquetaTC cocacola;
		
		EtiquetaTC orchata;
		
		// Llamada al constructor num 4
		cocacola = 
			new EtiquetaTC(240, 8, 100, 0, 35, 27);
		
		// Llamada al constructor num 2
		orchata = 
			new EtiquetaTC(305, 9, 115, 4);
	}
}
