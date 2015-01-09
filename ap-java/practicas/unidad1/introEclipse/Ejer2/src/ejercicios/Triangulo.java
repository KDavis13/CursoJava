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
	
	//m�todos get() y set() de los atributos de la clase 
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
 * M�todo constructor de la clase Triangulo. Recoge los datos y los guarda en variables
 * 
 * 
 * @param ladoUno
 * @param ladoDos
 * @param base
 * @param altura
 */
	
	//m�todo constructor de la clase Triangulo
	public Triangulo(int ladoUno, int ladoDos, int base, int altura) {
		this.lado1=ladoUno;
		this.lado2=ladoDos;
		this.base=base;
		this.altura=altura;
	}
	
	/**
	 * M�todo main de la clase, este m�todo lo que hace es recoger los datos
	 * y llama al m�todo para calcular el perimetro y la superficie
	 * Que a su vez imprime el resultado por pantalla.
	 * 
	 * @param args
	 */
	
	//m�todo main de la clase
	public static void main(String[] args) {
		//crea el objeto tri 
		Triangulo tri = new Triangulo(2,3,6,3);

		//invocaci�n del m�todo per�metro obten. los valores del objeto tri
		tri.perimetro(tri.getLado1(),tri.getLado2(),tri.getBase());
		
		//invocaci�n del m�todo superficie, los valores de los 
		//par�metros los obtiene del objeto tri
		tri.superficie(tri.getBase(), tri.getAltura());
	}
	
	/** M�todo que calcula el per�metro e imprime el resultado
	 * 
	 * @param lado1
	 * @param lado2
	 * @param base
	 */

	//m�todo que calcula el per�metro,
	// los valores de los par�metros los obtiene del objeto tri
	public void perimetro(int lado1,int lado2,int base)
	{
		System.out.println("Su perimetro es igual a: "+(lado1+lado2+base));
	}
	
	/** Me�todo que calcula la superficie y la imprime por pantalla
	 * 
	 * @param base
	 * @param altura
	 */
	
	//m�todo que calcula la superficie
	public void superficie(int base, int altura)
	{
		int superficie;
		superficie=(base * altura) /2;
		System.out.println("Su superficie es igual a: " + (superficie));
	}
}