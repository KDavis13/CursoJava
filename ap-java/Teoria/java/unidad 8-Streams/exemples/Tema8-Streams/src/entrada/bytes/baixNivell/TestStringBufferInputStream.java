package entrada.bytes.baixNivell;

import java.io.StringBufferInputStream;

public class TestStringBufferInputStream {
	
	   public static void main(String[] args) {
		         
		   String str = "Ejemplo StringBufferInputStream";	   
		   System.out.println("original: " + str);		  
	      
		   StringBufferInputStream bis = 
				   new StringBufferInputStream(str);
	 
	      int caracter;
	 
	      // Leer bytes del ByteArrayInputStream usando el método read()
	      while((caracter = bis.read()) != -1) {        
	        System.out.print((char)caracter);
	      }
	  }
	}
