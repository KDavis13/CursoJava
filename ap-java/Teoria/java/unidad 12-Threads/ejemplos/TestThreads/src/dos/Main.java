package dos;

/*
 * Este programa muestra como se intercalan los valores
 * de A y B debido a la naturaleza de la programacion
 * concurrente.
 * 
 * IMPORTANTE: Ejecutar desde fuera de Eclipse para
 * notar los efectos, ya que Eclipse oculta este hecho.
 */
public class Main {

	public static void main(String[] args) {
		AThread a = new AThread(); // Creamos obj. de la clase AThread
	    BThread b = new BThread(); // Creamos obj. de la clase BThread
	    // Arrancamos ambos hilos
	    // start() llama al método run() y vuelve aquí.
	    a.start(); 
	    b.start();

	}

}
