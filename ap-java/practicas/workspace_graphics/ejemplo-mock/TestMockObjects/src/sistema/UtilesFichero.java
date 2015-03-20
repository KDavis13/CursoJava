package sistema;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtilesFichero {
	
	 /**
     * Leer fichero
     * @param inFileName - Ruta al fichero
     * @return Contenido del fichero
     * @throws IOException
     */
    public String leer(String inFileName) throws IOException {
            FileInputStream fis = 
            	new FileInputStream(new File(inFileName));
            byte b[] = new byte[fis.available()];
            fis.read(b);
            fis.close();
            return new String(b);
    }
    
    /**
     * Escribir fichero
     * @param outFileName - Ruta al fichero
     * @param content - Contenido del fichero
     * @throws IOException
     */
    public void escribir(String outFileName, String content) throws IOException {
            FileOutputStream fos = 
            		new FileOutputStream(new File(outFileName));
            fos.write(content.getBytes());
            fos.flush();
            fos.close();
    }       
}
