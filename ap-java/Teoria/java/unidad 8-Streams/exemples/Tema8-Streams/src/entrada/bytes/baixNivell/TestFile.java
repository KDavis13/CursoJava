package entrada.bytes.baixNivell;

import java.io.File;
import java.util.Date;

public class TestFile {

  public static void main(String[] args) {
	  
    String ruta = System.getProperty("user.dir");
    
    File fichero=new File(ruta,"..\\testFile.txt");
    
    if (fichero.exists()) {    
	    System.out.println("Nombre del fichero: "+fichero.getName());
	    System.out.println("modificado: "+new Date(fichero.lastModified()));	    
	    System.out.println("Directorio padre: "+fichero.getParent());
	    System.out.println("Ruta relativa: "+fichero.getPath());
	    System.out.println("Ruta absoluta: "+fichero.getAbsolutePath());
    } else {
    	System.out.println("va a ser que no existe!");
    }
  }
}
