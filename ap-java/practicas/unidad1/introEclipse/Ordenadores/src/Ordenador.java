public class Ordenador {

	private String marca;
	private String procesador;
	private int peso;
	private boolean encendido = false;
	private boolean pantalla = false;

	/*
	 * Ponerse en marcha. Apagarse. Desactivar la presentaci�n en la pantalla.
	 * Activar la presentaci�n en la pantalla.
	 */

	// Este m�todo hace que aunque marca sea privada devuelva el contenido de la
	// variable.
	public String obtenerMarca() {
		return marca;
	}

	// Este m�todo coge asigna a this.narca la marca que se le ha pasdo desde la
	// otra clase

	public void establecerMarca(String ma) {
		marca = ma;
	}

	// Este m�todo hace que aunque peso sea privada devuelva el contenido
	// de la variable.
	public String obtenerPeso() {
		return procesador;
	}

	// Este m�todo coge asigna a this.narca la marca que se le ha pasdo desde la
	// otra clase

	public void establecerPeso(int pe) {
		peso = pe;
	}

	// Este m�todo hace que aunque procesador sea privada devuelva el contenido
	// de la variable.
	public String obtenerProcesador() {
		return procesador;
	}

	public void establecerProcesador(String pro) {
		procesador = pro;
	}

	// Este m�todo cambia el estado del ordenador a encendido en caso de que
	// estuviera apagado.

	public void encenderOrdenador() {
		if (encendido == true) {
			System.out.println("El ordenador ya est� encendido");
		} else {
			encendido = true;
			pantalla = true;
			System.out.println("El ordenador ha sido encendido");
		}
	}
	
	// Este m�todo cambia el estado del ordenador a encendido en caso de que
	// estuviera apagado.

	public void apagarOrdenador() {
		if (encendido == false) {
			System.out.println("El ordenador ya est� apagado");
		} else {
			encendido = false;
			pantalla = false;
			System.out.println("El ordenador ha sido apagado");
		}
	}
	
	//Este m�todo comprueba que el ordenador est� encendido y entonces comprueba si la pantalla
	//est� tambi�n encendida para apagarla
	
	public void apagarPantalla() {
		
		if(encendido == false)
		{
			System.out.println("El ordenador y la pantalla est�n apagados");
		}
		else {
			if (pantalla == false) {
				System.out.println("La pantalla ya est� apagada");
			} else {
				pantalla = false;
				System.out.println("La pantalla ahora est� apagada");
			}
		}
		
	}
	
	//Este m�todo comprueba que el ordenador est� encendido y entonces comprueba si la pantalla
	//est� tambi�n encendida para dejarla encendida o encenderla
		
		public void encenderPantalla() {
			
			if(encendido == false)
			{
				System.out.println("El ordenador y la pantalla est�n encendidos");
			}
			else {
				if (pantalla == false) {
					System.out.println("La pantalla ya est� encendida");
				} else {
					pantalla = true;
					System.out.println("La pantalla ahora est� encendida");
				}
			}
			
		}

	// Este m�todo recopila los datos y muestra como est� actualmente el
	// ordenador (muestra su estado)

	public void estado() {
		System.out.print("\nEl estado del ordenador es el siguiente:");
		System.out.print("\nMarca: " + marca);
		System.out.print("\nProcesador: " + procesador);
		System.out.print("\nPeso: " + peso + " kg.");

		if (encendido == true) {
			System.out.print("\nEl ordenador est� encendido");
		} else
			System.out.print("\nEl ordenador est� apagado");

		if (pantalla == true) {
			System.out.print("\nLa pantalla est� activada");
		} else
			System.out.print("\nLa pantalla est� desactivada");

		System.out.println("\n");
	}

}
