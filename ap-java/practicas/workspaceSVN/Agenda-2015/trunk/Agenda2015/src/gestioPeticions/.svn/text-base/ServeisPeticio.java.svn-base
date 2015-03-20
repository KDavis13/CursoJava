package gestioPeticions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import dummies.DummyIdioma;
import main.Config;
import main.Data;
import main.Idioma;
import Utils.UtilsStrings;

public class ServeisPeticio {

	public static Peticio getNovaPeticio(String itemPeticio) throws Exception {

		/**
		 * 
		 * metode public de factoria estatic getNovaPeticio. passant-li un
		 * String (una linia del fitxer peticions) i el separa en un array
		 * d'Strings (arguments de la peticio)
		 * 
		 * converteix i valida els arguments a arguments vàlids per a la creacio
		 * del constructor
		 * 
		 **/

		String tiposActiv = null;
		String sala = null;
		String[] argumentsPeticio = UtilsStrings
				.convertirCadenaEnParametres(itemPeticio);

		tiposActiv = argumentsPeticio[0];
		sala = argumentsPeticio[1];

		/**
		 * --------------DiaInici, DiaFi ------------ Date
		 * 
		 * 1- creo un array d'enters [dia,mes,any] <--- l'omplo amb la data
		 * (String) (cridant la funcio separarData, passant-li l'argument que
		 * correspon a diaIni)
		 * 
		 * 2- creo objecte amb un constructor nou que se li poden passar
		 * parametres (dia,mes,any)
		 * 
		 * ... el mateix per diaFi
		 *
		 * */

		int[] arrayDataTmp = new int[3];

		arrayDataTmp = UtilsStrings.separarData(argumentsPeticio[2]);
		int dataIni[];
		dataIni = new int[] { arrayDataTmp[0], arrayDataTmp[1], arrayDataTmp[2] };

		arrayDataTmp = UtilsStrings.separarData(argumentsPeticio[3]);
		int dataFi[];
		dataFi = new int[] { arrayDataTmp[0], arrayDataTmp[1], arrayDataTmp[2] };

		/**
		 * envio la datainicial i final, per comprovar el mes, mesI==mesF -->
		 * retorno el mateix valor del diaF (no canvia) mesI<mesF --> vol dir
		 * que haurem de contemplar no el dia final, sino el dia i el mes
		 * (canvio el diaF al màxim) mesI>mesF --> llenḉa una excepcio
		 **/

		dataFi[0] = checkMesIniMesFi(dataIni, dataFi);
		/**
		 * abans de passar-li la mascara al constructor, la comprovo i la
		 * formatejo per a que tingui sentit
		 ***/
		char[] maskDiesTemp = argumentsPeticio[4].toCharArray();
		char[] maskDies = checkMaskDies(maskDiesTemp);
		/**
		 * abans de passar-li la mascara de les hres, la comprovo i la formatejo
		 * per a que tingui sentit
		 * **/
		String maskHoresTemp = argumentsPeticio[5];
		int[][] maskHores = checkMaskHores(maskHoresTemp);

		return new Peticio(tiposActiv, sala, dataIni, dataFi, maskDies,
				maskHores);

	}

	static int checkMesIniMesFi(int[] dataIni, int[] dataFi) throws Exception {

		Data data = new Data(Config.getMes(), Config.getAnyo());
		int maxDies = data.getDias();

		int diaI = dataIni[0];
		int mesI = dataIni[1];
		int anyI = dataIni[2];

		int diaF = dataFi[0];
		int mesF = dataFi[1];
		int anyF = dataFi[2];

		if ((diaI <= diaF) && (data.getMes() == mesI) && (mesI == mesF)
				&& (data.getAny() == anyI) && (anyI == anyF)) {

			return diaF;

		}
		if ((diaI > diaF) && (mesI < mesF) && (anyI <= anyF)) {

			return data.getDias();

		} else if ((mesI > mesF) && (anyI > anyF)) {

			throw new Exception("format o rang de dades incorrectes");

		}
		return diaF;
	}

	static int[][] checkMaskHores(String maskHoresString) throws Exception {

		/**
		 * passant-li com a parametres la mascara d'hores, que pot ser de fins a
		 * 5 franges horaries retorna un array bidimensional d'enters. Es podria
		 * fer amb un arrayList que es mes flexible i no cal que sigui sempre
		 * del maxim pero per fer-lo multidimensional es bastant de liu i anem
		 * apretats.
		 *
		 * horaIni-horaFi [][] [][] [][] [][] [][]
		 * 
		 **/

		String[] arrayMaskHores = UtilsStrings.separaEnParaules(
				maskHoresString, "_");
		int[][] arrayHores = new int[5][2];

		for (int i = 0; i < arrayMaskHores.length; i++) {
			String[] hores = UtilsStrings.separaEnParaules(arrayMaskHores[i],
					"-");

			for (int j = 0; j < hores.length; j++) {

				arrayHores[i][j] = Integer.parseInt(hores[j]);

			}

		}

		return arrayHores;
	}

	static char[] checkMaskDies(char[] maskDies) {

		/**
		 * recollim inicials setmana i les declarem com a constants (pel puto
		 * switchcase que no permet posar-hi variables)
		 * **/
		Config configuracio = new Config("config.txt");
		Idioma idiomaIn = new Idioma(configuracio.getIdiomaIn());

		char[] diesSetmana = idiomaIn.getInicialesSemana();
		/**
		 * 
		 * ess molt guarro, pero no aconseguia fer-ho normal, els switch case
		 * necessites que siguin constants i no valen variables declarades com a
		 * final he estat mirant de fer-ho amb un mapa i tampoc acabava de
		 * funcionar
		 * 
		 * retorno un array de chars comprovats i que te el tamany correcte que
		 * el podrem comparar normalment amb els dies de la setmana. Si algun
		 * dia no esta a la mascara, aquella posicio de l'array queda buida. Si
		 * posen un caracter que no estigui conteplat a Idioma.inicialesSemana
		 * (no el posa al array i continua) 0 dilluns ... 6 diumenge
		 * 
		 * **/

		final char DL = diesSetmana[0];
		final char DM = diesSetmana[1];
		final char DC = diesSetmana[2];
		final char DJ = diesSetmana[3];
		final char DV = diesSetmana[4];
		final char DS = diesSetmana[5];
		final char DG = diesSetmana[6];

		char[] aSetmana = { '*', '*', '*', '*', '*', '*', '*' };

		for (char dia : maskDies) {
			if (dia == DL) {
				aSetmana[0] = dia;
			} else if (dia == DM) {
				aSetmana[1] = dia;
			} else if (dia == DC) {
				aSetmana[2] = dia;
			} else if (dia == DJ) {
				aSetmana[3] = dia;
			} else if (dia == DV) {
				aSetmana[4] = dia;
			} else if (dia == DS) {
				aSetmana[5] = dia;
			} else if (dia == DG) {
				aSetmana[6] = dia;
			}

		}
		return aSetmana;
	}

	static List<Peticio> getllistaPeticionDesdeArrayStrings(
			List<String> llistaStringsPeticions) throws Exception {

		/**
		 * donada un array de Strings retorna una llista<Peticions>:
		 *
		 * 
		 **/
		List<Peticio> llistaP = new ArrayList<Peticio>();
		try {

			for (String pItem : llistaStringsPeticions) {
				Peticio peticio = ServeisPeticio.getNovaPeticio(pItem);
				llistaP.add(peticio);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return llistaP;
	}

	static Map<String, List<Peticio>> getPeticionsXSales(List<Peticio> petis) {

		/**
		 * donada una llista<Peticions> es retorna un mapa amb:
		 *
		 * k: String v: List<Peticions>
		 * 
		 * ara mateix només l'utilitzem per separar la llista de peticions x
		 * sales, pero crec que el podem fer servir per separar x activitat o
		 * qualsevol futur canvi... m'ho he de mirar.
		 * 
		 **/

		Map<String, List<Peticio>> mapaLlistesXSales = new TreeMap<String, List<Peticio>>(); // creo
																								// mapa<string,peticio>

		for (Peticio pItem : petis) { // a partir de la llista que rebo, la
										// recorro
			List<Peticio> llistaSales = mapaLlistesXSales.get(pItem.getSala()); // accedeixo
																				// al
																				// atribut
																				// :
																				// Sala
			if (llistaSales == null) { //
				mapaLlistesXSales.put(pItem.getSala(),
						llistaSales = new ArrayList<Peticio>());
			}
			llistaSales.add(pItem);
		}
		return mapaLlistesXSales;
	}

	
	/******************************************************
	 * 
	 * 
	 * 
	 * donada una agenda i una llista de peticions
	 * comprobo per cada peticio si esta disponible i si ho esta la reservo. 
	 * 
	 * 
	 * 
	 ******************************************************/
	protected static void gestionarLlistesPeticions (Agenda agenda,
			List<Peticio> llistPxSala) {
		boolean disponible=false;
		for (Peticio p : llistPxSala) {
			disponibilitatAgendaPeticio(p,agenda);
//			disponibilitatAgendaPeticio(agenda, p);
			if (disponibilitatAgendaPeticio(p,agenda)==true)
			{
				reservarAgendaPeticio(p,agenda);
			}else {
				new ExceptionVarPeticions(p.getId()+"-"+p.getTiposActivitat()+"-"+p.getSala()+" no ha estat possible per conflictes amb una altra reserva o una mascara de dies i rang de dades incorrecte");

			}

		}

	}
	
	
	
	
	static boolean disponibilitatAgendaPeticio(Peticio p, Agenda agenda) {
		/*************************************************************
		 * recorre del diaIni - diaFi recorrent els dies de la setmana
		 * comprovant si tenen la mascara recorrent desde horaIni - horaFi
		 * 
		 * crida al calendari i busca una a una les cel·les que coincideixin amb
		 * les que estan dintre del criteri de la peticio.
		 * 
		 * crida la funcio --> comprovarDisponibilitat, si retorna true crida la
		 * retorna un true conforme es pot reservar la peticio.
		 * **********************************************************/

		// String xurroP="Tancat Sala2 10/01/2008 18/01/2008 LMJV 00-07_21-24";
		boolean disponible = false;
		int diaI = p.getDiaIni()[0];
		int diaF = p.getDiaFi()[0];

		int hora = p.getMaskHores()[0][1];
		int numDiaSetmana;
		String reserva = p.getTiposActivitat();

		Data dData = new Data(Config.anyo,Config.mes );
		char[] maskD = p.getMaskDies();

		for (int i = diaI; i <= diaF; i++) {
			for (int imD = 0; imD < maskD.length; imD++) {

				numDiaSetmana = dData.getDiaSemana(i);
				

				if (numDiaSetmana == imD && maskD[imD] != '*') {

					for (int iNumFranjaH = 0; iNumFranjaH < 5; iNumFranjaH++) {
						int iHIni = p.getMaskHores()[iNumFranjaH][0];
						int iHFi = p.getMaskHores()[iNumFranjaH][1];

						if (iHIni < iHFi) {

							for (int ih = iHIni; ih < iHFi; ih++) {

								if (agenda.comprovarDisponibilitat(i, ih,p.getTiposActivitat()) == true) {
									//agenda.reservarDiaHora(i, ih, reserva);
									disponible=true;
									System.out.println("d"+i+"-h"+ih+" disponible o del mateix tipos que reserva");
								}else{
									disponible=false;
									System.out.println("d"+i+"-h"+ih+" collisio");
									return disponible;
								}

							}

							// break;

						}
					}
				}
			}
		}
		
		return disponible;
	}
	static void reservarAgendaPeticio(Peticio p, Agenda agenda) {
		/*************************************************************
		 * recorre del diaIni - diaFi recorrent els dies de la setmana
		 * comprovant si tenen la mascara recorrent desde horaIni - horaFi
		 * 
		 * crida al calendari i busca una a una les cel·les que coincideixin amb
		 * les que estan dintre del criteri de la peticio i les reserva.
		 * cridant -->		agenda.reservarDiaHora(i, ih, reserva);
		 * **********************************************************/

		// String xurroP="Tancat Sala2 10/01/2008 18/01/2008 LMJV 00-07_21-24";
		
		int diaI = p.getDiaIni()[0];
		int diaF = p.getDiaFi()[0];

		int hora = p.getMaskHores()[0][1];
		int numDiaSetmana;
		String reserva = p.getTiposActivitat();

		Data dData = new Data(Config.anyo,Config.mes );
		char[] maskD = p.getMaskDies();

		for (int i = diaI; i <= diaF; i++) {
			for (int imD = 0; imD < maskD.length; imD++) {

				numDiaSetmana = dData.getDiaSemana(i);
				

				if (numDiaSetmana == imD && maskD[imD] != '*') {

					for (int iNumFranjaH = 0; iNumFranjaH < 5; iNumFranjaH++) {
						int iHIni = p.getMaskHores()[iNumFranjaH][0];
						int iHFi = p.getMaskHores()[iNumFranjaH][1];

						if (iHIni < iHFi) {

							for (int ih = iHIni; ih < iHFi; ih++) {								
									agenda.reservarDiaHora(i, ih, reserva);									
									System.out.println("d"+i+"-h"+ih+" reservada per "+p.getTiposActivitat());								
								}
							}
						}
					}
				}
			}
	}
}
