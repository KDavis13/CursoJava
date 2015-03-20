package tests;

import gestioPeticionsV2.Peticio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import main.Config;

public class TestsDummyGestioPeticions {

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
			for (Peticio p : llistaSensePrioritzar) {

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

	

}
