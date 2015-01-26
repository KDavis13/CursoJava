package stringbufferVsString;

public class StringVSBuffer {

	public static void main(String[] args) {
		String str = new String();

		long inicio = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str += "hola";
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo del String: " + (fin - inicio));

		StringBuffer sbuffer = new StringBuffer();

		inicio = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sbuffer.append("hola");
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo del StringBuffer: " + (fin - inicio));
	}
}
