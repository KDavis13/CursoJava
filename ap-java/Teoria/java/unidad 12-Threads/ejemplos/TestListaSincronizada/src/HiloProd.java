public class HiloProd extends Thread {

	private boolean continuar = true;
	private int[] valores = { 5, 8, 1, 0, 4 };
	private int contador = 0;
	private MiListaSincronizada listaSincronizada;

	public HiloProd(MiListaSincronizada lista) {
		listaSincronizada = lista;
		System.out.println("Valores a producir:");
		for (Integer i : valores)
			System.out.print(i + " ");
		System.out.println();
	}

	public void setContinuar(boolean continuar) {
		this.continuar = continuar;
	}

	public void run() {
		while (continuar) {
			int valor = valores[contador];
			if (listaSincronizada.addDato(valor)) {
				contador++;
			}	
			/*try {
				sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			if (contador == 5)
				setContinuar(false);
		}
		System.out.println("Nada que producir!");
	}
}
