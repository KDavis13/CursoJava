package exemple01;

public class Aserciones2 {
	
	public static void main(String[] args) throws Exception {
		
		int a = Integer.parseInt(args[0]);
		
		if (a > 0) {
			System.out.println("Ejecucion cuando 'a' es positiva");
		} else {
			assert a==0: "atencion, a es negativo: " + a;
			System.out.println("Ejecucion cuando 'a' es 0");
		}					
	}
}