package main;

import Utils.UtilsFitxers;
import Utils.UtilsStrings;
import java.util.List;


public class Config {

	// Atributos
	public static int anyo;
	public static int mes;
	public static String idiomaIn;
	public static String idiomaOut;


	// Getters
			public static int getAnyo() {
				return anyo;
			}

			public static int getMes() {
				return mes;
			}

			public static String getIdiomaIn() {
				return idiomaIn;
			}

			public static String getIdiomaOut() {
				return idiomaOut;
			}

			// Setters
			public static void setAnyo(int anyo) {
				Config.anyo = anyo;
			}

			public static void setMes(int mes) {
				Config.mes = mes;
			}

			public static void setIdiomaIn(String idiomaIn) {
				Config.idiomaIn = idiomaIn;
			}

			public static void setIdiomaOut(String idiomaOut) {
				Config.idiomaOut = idiomaOut;
			}

			public static String[] separaEnParaules(String linia) {

				String[] paraules = linia.split("\\s+");

				return paraules;
			}

			public static String[] separaEnParaules(String linia, String token) {

				String[] paraules = linia.split(token);

				return paraules;
			}
			
	// Constructor

	public Config(String fichero) {
		
		cogerParametros();
	}
	
	public static void cogerParametros(){
		/**
		 * exemple de com utilitzar els metodes de fitxers--> llegeixF que
		 * retorna llista (List<String>) amb el metode separaEnParaules que
		 * retorna un array (String[])
		 * 
		 * llegeixo el fitxer i em retorna la llista d'Strings. converteixo la
		 * llista en un array, m'Ã©s mÃ©s fÃ cil de recorrer.
		 * 
		 * 1er bucle--> recorro l'array de Strings (un per nÃºmero de linies del
		 * fitxer) capturo les paraules d'aquell String (la linia) en un array
		 * de Strings (les paraules)
		 * 
		 * 2n bucle --> recorro les paraules que composen aquell String (la
		 * linia descomposada en paraules) *
		 * 
		 * */

		List<String> linies = UtilsFitxers.llegeixF("config.txt");
		String[] aLinies = linies.toArray(new String[linies.size()]);

		String[] arrayParaules = new String[4];
		int i = 0;
		for (String linia : aLinies) {

			String[] aParaules = UtilsStrings.separaEnParaules(linia);

			// assignem posició a cada element
			for (String paraula : aParaules) {
				arrayParaules[i] = paraula;
			//	System.out.println(i + ":" + arrayParaules[i]);
				i++;
			}
		}
		// definim els paràmetres de cada posició

		anyo = Integer.parseInt(arrayParaules[0]);
		mes = Integer.parseInt(arrayParaules[1]);
		idiomaIn = arrayParaules[2];
		idiomaOut = arrayParaules[3];
	
        setAnyo(Integer.parseInt(arrayParaules[0]));
        setMes(Integer.parseInt(arrayParaules[1]));
        setIdiomaIn(arrayParaules[2]);
        setIdiomaOut(arrayParaules[3]);
		
        //System.out.println(idiomaIn);
		//System.out.println(idiomaOut);
        //System.out.println(anyo);
		//System.out.println(mes);	
		
	}
	
	public static void main(String[] args) {
	
		cogerParametros();
		
	}

}
