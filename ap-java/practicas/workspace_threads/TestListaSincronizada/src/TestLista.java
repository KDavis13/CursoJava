public class TestLista {

	public static void main(String[] args) {
		MiListaSincronizada lista = new MiListaSincronizada();

		HiloCons cons = new HiloCons(lista);
		HiloProd prod = new HiloProd(lista);

		prod.start();
		cons.start();

		try {
			prod.join();
			cons.setContinuar(false);
			cons.interrupt();
			cons.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}