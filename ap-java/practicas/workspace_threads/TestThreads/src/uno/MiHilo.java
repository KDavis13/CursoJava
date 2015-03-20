package uno;

public class MiHilo extends Thread {
	
	String nombre;
	
	public void setNombre(String s){
		nombre=s;
	}
	
	@Override
	public void run() {
		System.out.println("Estas en... " + nombre);
		System.out.println("Calculando...");
		for (long i = 0; i < 5_000_000_000L; i++) {
		}
		System.out.println(nombre + " finalizado");
	}
}
