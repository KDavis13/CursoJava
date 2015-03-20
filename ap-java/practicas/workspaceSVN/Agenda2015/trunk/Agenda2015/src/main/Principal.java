package main;

<<<<<<< .mine
import Utils.UtilsFitxers;
//import gestioPeticions.SistemaPeticions;
//import gestioPeticions.SistemaPeticions;							//aquesta es la v4 del sistema de peticions controleu sobre on es fan els canvis
=======
import java.util.List;

import gestioPeticions.Agenda;
import gestioPeticions.SistemaPeticions;							//aquesta es la v4 del sistema de peticions controleu sobre on es fan els canvis
>>>>>>> .r126
import SortidaDades.Sortida;


public class Principal {

	public static void main(String[] args) {
		
		/* **************************************************** */		
		//Fluxe del programa (aneu anyadint segons aneu terminant)
		/* **************************************************** */
		
		//Carregar el tema dels logs.
		
		String[] salas = {"sala1", "sala2"};
		
		Config configuracio = new Config("config.txt");

		//SistemaPeticions peticiones = new SistemaPeticions(configuracio);

		List<Agenda> listaAgendas =peticiones.getLlistatDeAgendes();
		for (Agenda ag: listaAgendas)
		{
			ag.getArrayDiesHores();
			
		}
		//Sortida resultado = new Sortida(getArrayFinal);
		
		UtilsFitxers.llegeixF("config.txt");
	}

}