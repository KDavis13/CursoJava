package exemple01;

public class Main {

	public static final int MADERA = 0;
	public static final int HIERRO = 1;
	public static final int PLASTICO = 2;
	
	public static void main(String[] args) {
		lanzarOrdenFabricacion(3);
		System.out.println("Programa finalizado.");
	}

	private static void lanzarOrdenFabricacion(int material) {
		if (material == MADERA) {
			System.out.println("Cortando madera...");
		} else if (material == HIERRO) {
			System.out.println("Calentando hierro...");
		} else if (material == PLASTICO) {
			System.out.println("Moldeando plastico...");
		}
		
	}

}
