package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.StringTokenizer;

public class UtilsStrings {

	/*******************************************************************
	 * @author eduard
	 * 
	 * 
	 * 
	 *         UtilitatsStrings
	 * 
	 *         metodes:
	 * 
	 *         separaEnParaules<--- donat un string, retorna un array de Strings
	 *         del tamany del número de paraules que contingui l'String que li
	 *         hem passat.
	 * 
	 *         Les paraules les detecta quan trova un espai entre cada paraula.
	 * 
	 * **/

	public static String[] separaEnParaules(String linia) {

		String[] paraules = linia.split("\\s+");

		return paraules;
	}

	public static boolean comprobarData(String strDataI, String strDataF)
			throws ParseException {

		/************************************************************
		 * si el diaInici <= diaFi les dates són correctes
		 ************************************************************/
		
		boolean valides = false;
		SimpleDateFormat dataIni = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dataFi = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(dataIni.parse(strDataI));
		Calendar c2 = Calendar.getInstance();
		c2.setTime(dataFi.parse(strDataF));
		
		if ((c1.compareTo(c2) < 0) || (c1.compareTo(c2) == 0)) {
			
		 valides = true;
		}
		return valides;
	}

	public static int[] separarData(String dataStr) {

		/**
		 * vaya HISTORIAAAAA amb el puto "/" que no me'l pillava, bueno, m'he de
		 * montar tot això per a poder separar "dia/mes/any" en un array
		 * d'enters
		 * 
		 **/
		StringTokenizer st = new StringTokenizer(dataStr, "/");
		int i = 0;
		// String arrayTmp[] = new String[3];
		int arrayDiaMesAny[] = new int[3];
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			// arrayTmp[i]=token;
			arrayDiaMesAny[i] = Integer.parseInt(token);
			i++;
		}

		return arrayDiaMesAny;
	}

	public static String[] separaEnParaules(String linia, String token) {

		String[] paraules = linia.split(token);

		return paraules;
	}

	public static void main(String[] args) {

		// List<String> linies = UtilitatsFitxers.llegeixF("peticions.txt");
		// int i = 0;
		// for (String linia : linies) {
		// System.out.println(linia);
		// paraules = UtilitatsStrings.separaEnParaules(linia);
		// // System.out.println(linies.get(i).toString());
		// // i++;
		// }

		/**
		 * exemple de com util·litzar els metodes de fitxers--> llegeixF que
		 * retorna llista (List<String>) amb el metode separaEnParaules que
		 * retorna un array (String[])
		 * 
		 * llegeixo el fitxer i em retorna la llista d'Strings. converteixo la
		 * llista en un array, m'és més fàcil de recorrer.
		 * 
		 * 1er bucle--> recorro l'array de Strings (un per número de linies del
		 * fitxer) capturo les paraules d'aquell String (la linia) en un array
		 * de Strings (les paraules) 2n bucle --> recorro les paraules que
		 * composen aquell String (la linia descomposada en paraules) *
		 * 
		 * */

		List<String> linies = UtilsFitxers.llegeixF("config.txt");
		String[] aLinies = linies.toArray(new String[linies.size()]);

		String[] arrayParaules = new String[4];
		int i = 0;
		for (String linia : aLinies) {

			String[] aParaules = UtilsStrings.separaEnParaules(linia);

			for (String paraula : aParaules) {
				arrayParaules[i] = paraula;
				System.out.println(i + ":" + arrayParaules[i]);
				i++;
			}
		}

		int any = Integer.parseInt(arrayParaules[0]);
		int mes = Integer.parseInt(arrayParaules[1]);
		String idiomaIn = arrayParaules[2];
		String idiomaOut = arrayParaules[3];

	}

	public static String[] convertirCadenaEnParametres(String itemPeticio) {
		String[] arrayParametres = UtilsStrings.separaEnParaules(itemPeticio);
		return arrayParametres;
	}

}
