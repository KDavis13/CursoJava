package main;

import java.util.List;

import dummies.DummyFecha;
import gestioPeticions.Agenda;
import gestioPeticions.SistemaPeticions;							//aquesta es la v4 del sistema de peticions controleu sobre on es fan els canvis
import SortidaDades.Sortida;
import Utils.UtilsFitxers;

public class Principal {

	public static void main(String[] args) {
		
		/* **************************************************** */		
		//Fluxe del programa (aneu anyadint segons aneu terminant)
		/* **************************************************** */
		
		String[] salas = {"sala1", "sala2"};
		
		Config configuracio = new Config("config.txt");
		
		Data fecha = new Data(configuracio.getAnyo(), configuracio.getMes());
		
		//Data fecha = new Data(11, 2008);
		
		//DummyFecha fecha = new DummyFecha();
		
		Idioma idiomaIn = new Idioma(configuracio.getIdiomaIn());
		
		Idioma idiomaOut = new Idioma(configuracio.getIdiomaOut());
		
		SistemaPeticions peticiones = new SistemaPeticions(configuracio);
		
		List<Agenda> listaAgendas =peticiones.getLlistatDeAgendes();
		
		int cont = 0;
		for (Agenda ag: listaAgendas)
		{
			//ag.getArrayDiesHores();
			Sortida resultado = new Sortida(idiomaIn, idiomaOut, fecha, ag.getArrayDiesHores(), salas[cont]);
			cont++;
			
		}
		
		
		//Sortida resultado = new Sortida(getArrayFinal);
		

		//UtilsFitxers.llegeixF("config.txt");
	}

}
