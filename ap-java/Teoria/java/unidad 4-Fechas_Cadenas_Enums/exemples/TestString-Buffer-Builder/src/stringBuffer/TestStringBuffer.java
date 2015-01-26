package stringBuffer;

public class TestStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer buffer = 
				new StringBuffer();
		
		buffer
		   .append("En un lugar ")
		      .append("de La Mancha ")
		         .append("cuyo nombre...");
		
		buffer.append("no quiero acordarme.");
		
		// ****** Extraer una subcadena del buffer
		
		char[] region = new char[50];
		
		buffer.getChars(15, 25, region, 0);
		
		System.out.println(region);
		
		// ****** Pasar de StringBuffer a String
		
		String frase = buffer.toString();
		System.out.println(frase);
		
		// ******* Capamos el buffer a 10 carac. por
		// lo que perdemos el resto del contenido
		System.out.println(buffer.length());
		buffer.setLength(10);
		System.out.println(buffer.length());
		System.out.println(buffer);
		
		// ***** setCharAt()
		buffer.setCharAt(0, 'e');
		System.out.println(buffer);
		
		// ***** reverse()
		buffer.reverse();
		System.out.println(buffer);
		
	}

}
