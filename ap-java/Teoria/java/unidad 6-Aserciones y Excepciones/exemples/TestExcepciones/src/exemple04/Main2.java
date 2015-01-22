package exemple04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		 
		// try-with-resources
		try (BufferedReader br = 
				new BufferedReader(new FileReader("testing.txt")))
		{ 
			String sCurrentLine;
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			} 
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
