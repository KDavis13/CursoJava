package stringbufferVsString;

public class BuilderVSBuffer {

	public static void main(String[] args) {
		StringBuffer sbuffer = new StringBuffer();

		long inicio = System.currentTimeMillis();        
		for (int i=0; i<1000000; i++) {             
			sbuffer.append("hola");        
		}
		long fin = System.currentTimeMillis();        

		System.out.println("Tiempo del StringBuffer: " + (fin-inicio));        

		StringBuilder sbuilder = new StringBuilder();        

		inicio = System.currentTimeMillis();        
		for (int i=0; i<1000000; i++) {             
			sbuilder.append("hola");        
		}
		fin = System.currentTimeMillis();        

		System.out.println("Tiempo del StringBuilder: " + (fin-inicio));
	}
}
