package exemple01;

enum Material {
	MADERA, HIERRO, PLASTICO;
}

public class MainAmbEnum {

	public static void main(String[] args) {

		Material miMaterial = Material.MADERA;

		lanzarOrdenFabricacion(miMaterial);
		System.out.println("Programa finalizado.");
	}

	private static void lanzarOrdenFabricacion(Material material) {

		switch (material) {
		case HIERRO:
			System.out.println("Calentando hierro...");
			break;
		case MADERA:
			System.out.println("Cortando madera...");
			break;
		case PLASTICO:
			System.out.println("Moldeando plastico...");			
		}
	}
}
