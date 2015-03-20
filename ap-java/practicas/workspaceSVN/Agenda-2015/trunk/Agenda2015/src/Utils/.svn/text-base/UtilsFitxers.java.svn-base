package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UtilsFitxers {
	
	private static File fitxer = null;
	private static FileReader fr = null;
	private static BufferedReader br = null;
	
	
	
	public static List<String> llegeixF(String nomFitxer) {
		
		/**
		 * 
		 * metode public estàtic llegeixF
		 * passant-li el nom d'un fitxer, retorna una llista d'strings del tamany del número de files del fitxer que llegeix
		 * 
		 * */
		
		List<String> aLinies = new ArrayList<String>();
		int i=0;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			
			fitxer = new File(nomFitxer);
			fr = new FileReader(fitxer);
			br = new BufferedReader(fr);
			String liniaF = null;
			// Lectura del fichero
			
			while ((liniaF=br.readLine()) != null) {
				
//				liniaF = br.readLine();	
				aLinies.add(liniaF);

			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		//System.out.println(aLinies);
		return aLinies;
	}
}
