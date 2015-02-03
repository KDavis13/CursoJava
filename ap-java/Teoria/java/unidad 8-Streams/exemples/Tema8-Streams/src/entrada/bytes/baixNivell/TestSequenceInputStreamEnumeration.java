package entrada.bytes.baixNivell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class TestSequenceInputStreamEnumeration {

	public static void main(String[] args) {
		
		FileInputStream f1is, f2is, f3is;
		
		try {
			f1is = new FileInputStream("1.txt");
			f2is = new FileInputStream("2.txt");
			f3is = new FileInputStream("3.txt");

			List<FileInputStream> lista = 
					Arrays.asList(f1is, f2is, f3is);
			
			Enumeration<FileInputStream> elista = 
					Collections.enumeration(lista);
			
			SequenceInputStream s = new SequenceInputStream(elista);
			int c;

			while ((c = s.read()) != -1)
				System.out.print((char) c);

			s.close();

		} catch (FileNotFoundException e) {
			System.out.println("No encuentro el fichero!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
