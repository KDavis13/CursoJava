public class TestLista {

	public static void main(String[] args) {
		
		MiListaSincronizada lista = 
				new MiListaSincronizada();

		HiloCons cons = new HiloCons(lista);
		HiloProd prod = new HiloProd(lista);

		prod.start();
		cons.start();

		try {
			prod.join();			
			cons.join();
			System.out.println("Programa finalizado.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}