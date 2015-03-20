package gestioPeticions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import main.Config;

public class OrdenadorPerPrioritats {

	public static List<Peticio> prioritzarPeticions(
			List<Peticio> llistaSensePrioritzar) {

		List<Peticio> llistaPrioritada = new ArrayList();

		/*****
		 * creo mapa amb el tipos d'activitat i l'id de la peticio recorro la
		 * llistadesordenada i l'omplo
		 * 
		 * *****/
		Map<String, Integer> mapaTiposActivitatPrioritari = new LinkedHashMap<String, Integer>();
		for (Peticio p : llistaSensePrioritzar) {
			String tiposActivitat = p.getTiposActivitat();
			Integer id = p.getId();

			mapaTiposActivitatPrioritari.put(tiposActivitat, id);
		}

		/*****
		 * 
		 * mentres les dos llistes tinguin tamanys diferents segueix fent el
		 * bucle compara el tiposdActivitat del mapa (que ve en l'ordre
		 * correcte) amb el tipos d'activitat de la peticio de la llista
		 * desordenada
		 * 
		 * si son iguals, afegeixlo a la llista ordenada. si no, continua
		 * iterant.
		 * *****/
		int i = 0;

		for (Entry<String, Integer> itemMapa : mapaTiposActivitatPrioritari
				.entrySet()) {
			for (Peticio p: llistaSensePrioritzar) {
				
				String tiposActivitatDeLaLlista = p.getTiposActivitat();

				/**
				 * comparo si en el mapa que m'he creat de prioritats. l'element
				 * en curs té el mateix tipos de priotitat que l'element de la
				 * llista
				 */
				if (itemMapa.getKey().compareTo(tiposActivitatDeLaLlista) == 0) {

					llistaPrioritada.add(p);

				}

			}
		}

		return llistaPrioritada;
	}

	public static void main(String[] args) throws Exception {
		
		
		
		Peticio p1 = ServeisPeticio.getNovaPeticio("Tancat Sala1 04/01/2008 05/01/2008 SG 00-07_21-24");
		Peticio p2 = ServeisPeticio.getNovaPeticio("ReunioJava Sala1 04/01/2008 07/01/2008 SG 00-02");
//		Peticio p3 = ServeisPeticio.getNovaPeticio("Tancat Sala1 01/01/2008 31/12/2008 LMCJVSG 00-07_21-24");
//		Peticio p4 = ServeisPeticio.getNovaPeticio("Perl Sala1 01/01/2008 31/12/2008 LMCJVSG 00-07_21-24");
//		Peticio p5 = ServeisPeticio.getNovaPeticio("Tancat Sala1 01/01/2008 31/12/2008 LMCJVSG 00-07_21-24");
		List<Peticio> llDesordenadaP = new ArrayList<Peticio>();
		llDesordenadaP.add(p1);
		llDesordenadaP.add(p2);
//		llDesordenadaP.add(p3);
//		llDesordenadaP.add(p4);
//		llDesordenadaP.add(p5);
		System.out.println("llista sense prioritzar");
		for (Peticio p: llDesordenadaP){
			
			System.out.println(p.getTiposActivitat()+"- id:"+p.getId());
		}
		
		
		List<Peticio> llistaPrioritzada= new ArrayList<Peticio> ();
				
		llistaPrioritzada = prioritzarPeticions(llDesordenadaP);
		System.out.println("llista prioritzada");
		for (Peticio p: llistaPrioritzada){
			
			System.out.println(p.getTiposActivitat()+"- id:"+p.getId());
			
		}
		
		
		Config config = new Config("config.txt");
		
//		Agenda agendaSala1 = new Agenda(config);	
//		
//		//String [][] arrayReservesXSala = ServeisPeticio.gestionarPeticio(p1,agendaSala1);
//		//arrayReservesXSala = ServeisPeticio.gestionarPeticio(p2,agendaSala1);
//		
//		agendaSala1.imprimirCalendari();
		
	}

}
