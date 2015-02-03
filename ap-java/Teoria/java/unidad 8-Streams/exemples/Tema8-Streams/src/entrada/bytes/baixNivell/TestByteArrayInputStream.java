package entrada.bytes.baixNivell;

import java.io.ByteArrayInputStream;

public class TestByteArrayInputStream {
	
   public static void main(String[] args) {
	         
	   String str = "Ejemplo ByteArrayInputStream";	   
	   System.out.println("original: " + str);
	   
      // Obtener los bytes de la cadena mediante el método getBytes()
      byte[] bytes = str.getBytes();
 
      // Crear el objeto ByteArrayInputStream
      ByteArrayInputStream bai = new ByteArrayInputStream(bytes);
 
      int caracter, count = 0;
 
      // Leer bytes del ByteArrayInputStream usando el método read()
      while((caracter = bai.read()) != -1) {        
        count++;
        if (count % 2 == 0) bai.skip(1);
        System.out.print((char)caracter);
      }
  }
}