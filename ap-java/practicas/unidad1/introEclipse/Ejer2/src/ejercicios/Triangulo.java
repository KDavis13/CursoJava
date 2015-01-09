//paquete al que pertenece la clase
package ejercicios;

/**
 * 
 * @author poo/Belia
 *
 */

public class Triangulo {
	// atributos de la clase
	
	/**
	 * 
	 * @param ladoUno 
	 * @param ladoDos
	 * @param base
	 * @param altura
	 */
	
	private int lado1;
	private int lado2;
	private int base;
	private int altura;
	
	//métodos get() y set() de los atributos de la clase 
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

/**
 * Método constructor de la clase Triangulo. Recoge los datos y los guarda en variables
 * 
 * 
 * @param ladoUno
 * @param ladoDos
 * @param base
 * @param altura
 */
	
	//método constructor de la clase Triangulo
	public Triangulo(int ladoUno, int ladoDos, int base, int altura) {
		this.lado1=ladoUno;
		this.lado2=ladoDos;
		this.base=base;
		this.altura=altura;
	}
	
	/**
	 * Método main de la clase, este método lo que hace es recoger los datos
	 * y llama al método para calcular el perimetro y la superficie
	 * Que a su vez imprime el resultado por pantalla.
	 * 
	 * @param args
	 */
	
	//método main de la clase
	public static void main(String[] args) {
		//crea el objeto tri 
		Triangulo tri = new Triangulo(2,3,6,3);

		//invocación del método perímetro obten. los valores del objeto tri
		tri.perimetro(tri.getLado1(),tri.getLado2(),tri.getBase());
		
		//invocación del método superficie, los valores de los 
		//parámetros los obtiene del objeto tri
		tri.superficie(tri.getBase(), tri.getAltura());
	}
	
	/** Método que calcula el perímetro e imprime el resultado
	 * 
	 * @param lado1
	 * @param lado2
	 * @param base
	 */

	//método que calcula el perímetro,
	// los valores de los parámetros los obtiene del objeto tri
	public void perimetro(int lado1,int lado2,int base)
	{
		System.out.println("Su perimetro es igual a: "+(lado1+lado2+base));
	}
	
	/** Meétodo que calcula la superficie y la imprime por pantalla
	 * 
	 * @param base
	 * @param altura
	 */
	
	//método que calcula la superficie
	public void superficie(int base, int altura)
	{
		int superficie;
		superficie=(base * altura) /2;
		System.out.println("Su superficie es igual a: " + (superficie));
	}
}