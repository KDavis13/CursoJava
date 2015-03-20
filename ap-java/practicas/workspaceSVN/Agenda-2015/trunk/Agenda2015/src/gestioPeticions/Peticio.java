package gestioPeticions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.regex.Pattern;

import main.Data;
import Utils.UtilsFitxers;
import Utils.UtilsStrings;
import dummies.DummyIdioma;

public class Peticio {
	private static int cont=0;
	
	private int id=0;
	private String tiposActivitat = null;		//controlar -tancat-closed-etc...
	private String sala = null;
	private int[] diaIni;
	private int[] diaFi;
	private int[][] maskHores = new int[5][2];
	private char[] maskDies;
	

	// constructor privat, per controlar què li passem i com li passem

	/**
	 * Classe Peticio
	 * 
	 * donats uns parametres previament comprovats pel metode getNovaPeticio a UtilsPeticio
	 * es crea una peticio (comprova els parametres i crida al constructor
	 * 	  
	 * **/
	public Peticio(String tiposActivitat, String sala, int[] diaIni,
			int[] diaFi, char[] maskDies, int[][] maskHores) {
		this.id=cont;
		cont++;
		this.tiposActivitat = tiposActivitat;
		this.sala = sala;
		this.diaIni = diaIni;			//array de int [dia , mes , any]
		this.diaFi = diaFi;				//
		this.maskDies = maskDies;
		this.maskHores = maskHores;
	}

	public Peticio(String tiposActivitat, String sala) {				//dummy por fer proves d'ordenacio
		this.id=cont;
		cont++;
		this.tiposActivitat = tiposActivitat;
		this.sala = sala;		
	}
	
	
	
	
	public int[][] getMaskHores() {
		return maskHores;
	}

	public char[] getMaskDies() {
		return maskDies;
	}
	public String getTiposActivitat() {
		return tiposActivitat;
	}
	public String getSala() {
		return sala;
	}
	public int[] getDiaIni() {
		return diaIni;
	}
	public int[] getDiaFi() {
		return diaFi;
	}

	@Override
	public String toString() {

		return "Peticio ["+"id:"+this.id+", " + this.tiposActivitat + ", " + this.sala + ", diaIni:"+this.diaIni+", diaFi:"+this.diaFi+ this.maskDies + ", " + this.maskHores + "]";
	}






	public int getId() {
		return id;
	}

	

	
}
