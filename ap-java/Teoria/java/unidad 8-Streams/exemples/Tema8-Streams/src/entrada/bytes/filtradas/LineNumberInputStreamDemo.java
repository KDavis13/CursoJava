package entrada.bytes.filtradas;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberInputStream;

public class LineNumberInputStreamDemo {
	
   public static void main(String[] args) throws IOException {
      
      LineNumberInputStream lnis = null;
      FileInputStream fis =null;
      DataInputStream dis = null;
      int i;
      
      try{
         // create new input streams
         fis = new FileInputStream("testFileInputStream.txt");
         lnis = new LineNumberInputStream(fis);
         dis = new DataInputStream(lnis);
         // set the line number
         //lnis.setLineNumber(100);
         String linea;
         while ((linea = dis.readLine()) != null) {
        	 System.out.println(lnis.getLineNumber() + 
        			 " - " + linea);	 
         }
                  
      }catch(Exception e){
         
         // if any error occurs
         e.printStackTrace();
      }finally{
         
         // closes the stream and releases any system resources
         if(fis!=null)
            fis.close();
         if(lnis!=null)
            lnis.close();      
      }
   }
}
