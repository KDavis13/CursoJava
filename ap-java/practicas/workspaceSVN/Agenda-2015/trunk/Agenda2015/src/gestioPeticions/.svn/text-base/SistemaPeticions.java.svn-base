package gestioPeticions;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map.Entry;

import main.Config;
import main.Data;
import main.SalidaLog;
import dummies.DummyFecha;
import Utils.UtilsFitxers;
import Utils.UtilsStrings;

public class SistemaPeticions {

	private Config config;
	
	private List<Agenda> LlistatDeAgendes; 

	

	public SistemaPeticions(Config configuracio) {		
		this.config = configuracio;
		 SalidaLog.escribirLog("*********iniciant sistema de peticions**********");
		inicialitzarSysPeticions();
		
	}

	private List<Agenda> inicialitzarSysPeticions() {

		/*************************************************************************************************************
		 * 
		 * 
		 * 
		 * !!!!!!!!!!!!!!!!!!!!!!!!!! LA INSTANCIA AGENDA PERTANY AL AMBIT DEL
		 * BUCLE DE CADA SALA
		 * 
		 * cridat pel constructor de SistemaPeticions s'encarrega de: 1 - llegir
		 * fitxer de peticions 2 - crear llista buida de peticions 3 - crear
		 * objecte agenda // no us cal 4 - x cada linia llegida del fitxer -->
		 * guardarla a un array de strings (1 x peticio) 5 - cridar al metode x
		 * crear objecte peticio 6 - afegir cada peticio a la llista de TOTES
		 * les peticions 7 - - generar llista --> separar peticio per sales (no
		 * implementat) - - cridar metode ordenarPeticions(envio
		 * llistaPeticionsXSala) rebo llista ordenada - - cridar a gestionar
		 * peticio --> se li passa 1 peticio i la agenda, comprova dies i hores
		 * solicitades i crida al calenndari per a comprovar disponibilitat i
		 * reserva si est� disponible - - - - retornar array[][]
		 * 
		 * 
		 ************************************************************************************************************/
		int mes = config.getMes();
		int any = config.getAnyo();
		
		Data data = new Data(mes,any);	
		int diesMes = data.getDias();
		int MAXHORES  = 24;
		
		List<Peticio> llistatPeticions = new ArrayList<Peticio>(); // creo
																	// llista<Peticio>
																	// buida
		List<String> llistaStringP; // creo llista<String> buida

		llistaStringP = UtilsFitxers.llegeixF("peticions.txt"); // llegeixo
																// fitxer i el
																// passo a la
																// llista<String>
		

		// crido a la funci� que genera les peticions
		// desde una llista d'strings retornant una llista plena de objectes
		// Peticio.

		try {
			llistatPeticions = ServeisPeticio
					.getllistaPeticionDesdeArrayStrings(llistaStringP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ****passo llista x a separarla en sales --> rebo llistaXSales

		Map<String, List<Peticio>> mapaLlistesXsales;
		mapaLlistesXsales = ServeisPeticio.getPeticionsXSales(llistatPeticions);
		String[][] arrayReservesXSala = new  String[diesMes][MAXHORES] ;
		
		List<Agenda> llistaAgendes = new ArrayList();
		
		for (Entry<String, List<Peticio>> itemMapa : mapaLlistesXsales
				.entrySet())
		{

			
			// per cada sala es crea una instancia d'agenda, ja que totes
			// les peticions de la llista comparteixen agenda.

			String nomSala = itemMapa.getKey();
			List<Peticio> llistatPxSala = itemMapa.getValue();		
			
			/**
			 * crido prioritzarPeticions per a que retorni una llista correctament prioritzada
			 * **/
			
			List<Peticio> llistaPrioritzadaDeLaSala = new ArrayList<Peticio>();
			llistaPrioritzadaDeLaSala =OrdenadorPerPrioritats.prioritzarPeticions(llistatPxSala);
			

			
			/***
			 *
			 * creo la agenda de la sala i crido a una funcio passantli la llista i la agenda 
			 * per a que la gestioni
			 * */
			
			
			Agenda agendaDeLaSala = new  Agenda(config, nomSala);	
			
			try {
					ServeisPeticio.gestionarLlistesPeticions(agendaDeLaSala,llistaPrioritzadaDeLaSala);
				} 
			catch (Exception e) 
			{
				e.printStackTrace();
				
			}
			
			llistaAgendes.add(agendaDeLaSala);
			this.setLlistatDeAgendes(llistaAgendes);
			
		//	agendaDeLaSala.imprimirCalendari();					//això es pot comentar només és per a testing
			
			/****************************************
			 * 
			 *la instruccion de aquí abajo te da el array de la agenda.
			 *lo malo es que aquí estamos dentro de un bucle. tendría 
			 *que meter todo esto en el main principal y dentro de este 
			 *bucle ir llamando a la parte de tu programa
			 * 
			 ****************************************/
			
			//agendaDeLaSala.getArrayDiesHores();				
			}
		return this.getLlistatDeAgendes();
	
	}
	
	


	public List<Agenda> getLlistatDeAgendes() {
		return LlistatDeAgendes;
	}

	public void setLlistatDeAgendes(List<Agenda> llistatDeAgendes) {
		LlistatDeAgendes = llistatDeAgendes;
	}

	public Config getConfig() {
		return config;
	}
	


}
