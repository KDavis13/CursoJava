package exemple01;

public class TestCoche {

	public static void main(String[] args) {
		
		Coche miCoche = Coche.LAMBORGHINI;
		
		String modelo = miCoche.modelo;
		int cilidrada = miCoche.cilindrada;

		// ********
		Coche miOtroCoche = Coche.FERRARI;
		
		if (miCoche.modelo == miOtroCoche.modelo) {
			System.out.println("mismo modelo");
		}
		
		if (miCoche.cilindrada == miOtroCoche.cilindrada) {
			System.out.println("misma cilindrada");
		}
		
		if (miCoche == miOtroCoche) {
			System.out.println("apuntan misma instancia");
		} else {
			System.out.println("apuntan a diferente instancia");
		}
		
		System.out.println("name: " + miCoche.name());
		System.out.println("toString: " + miCoche);
		
		for (Coche c : Coche.values()) {
			System.out.println(c.ordinal() + " - " + c);
		}
		
	}

}
