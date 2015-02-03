package entrada.bytes.baixNivell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestSequenceInputStream {

	public static void main(String[] args) {
		
		FileInputStream f1is, f2is;
		
		try {
			f1is = new FileInputStream("testFileInputStream.txt");
			f2is = new FileInputStream(new File("..\\testFile.txt"));

			SequenceInputStream s = 
					new SequenceInputStream(f1is, f2is);
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
