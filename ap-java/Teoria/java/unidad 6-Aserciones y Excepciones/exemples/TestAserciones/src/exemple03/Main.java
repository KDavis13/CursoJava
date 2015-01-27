package exemple03;

public class Main {

	public static final double SUELDO_DIARIO = 50.0;
	
	public static void main(String[] args) {
		String[] acciones = {"abrir","cerrar","subir","bajar"};
		ejecutarAccion(acciones, 4);
	}

	private static void 
		ejecutarAccion(String[] acciones, int indice) 
	{	
		for (int i=0; i < acciones.length; i++) {
			if (i == indice) {
				System.out.println("Ejecutada la orden: " + 
						acciones[i]);
				return; // Forzamos salida del bucle y del método
			}
		}
		//System.out.println("Esto no se puede ejecutar!");
		assert false : "Esto no se puede ejecutar nunca!";
	}

}
