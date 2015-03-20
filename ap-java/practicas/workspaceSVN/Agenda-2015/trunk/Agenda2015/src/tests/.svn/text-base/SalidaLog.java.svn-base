package tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SalidaLog {

	public static void escribirLog(String mSG) {

		
		try (PrintStream ps = new PrintStream(new FileOutputStream("log.txt",true))){
			
			ps.println(mSG);
			
			// Se cierra el flujo ps
			//System.out.println("Anotación realizada");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
	}
	
	public static void main(String[] args) {
    //escribirLog(mensaj);
		
			}
}