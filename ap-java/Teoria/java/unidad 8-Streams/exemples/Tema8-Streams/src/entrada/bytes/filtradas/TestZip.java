package entrada.bytes.filtradas;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class TestZip {

	public static void main(String[] args) {
		ZipFile zipFile = null;
		try {
			zipFile = new ZipFile("0-preliminar.zip");
			Enumeration<? extends ZipEntry> entries = zipFile.entries();

		    while(entries.hasMoreElements()){
		        ZipEntry entry = entries.nextElement();
		        System.out.println(entry.getName());
		        //InputStream stream = zipFile.getInputStream(entry);
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				zipFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
}
