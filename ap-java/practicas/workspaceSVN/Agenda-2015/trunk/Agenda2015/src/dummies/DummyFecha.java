package dummies;

import java.util.Calendar;

public class DummyFecha {
	
	//Atributos	
	private int any = 2008;
	private int mes = 11; //Los meses literalmente -> 1 es Enero, 12 es Diciembre
	private int semanas = 5; //Las semanas literales, NO un �ndice.
	private int diaInicial = 5; //Esto es el �ndice del d�a de la semana, de 0 al 6. ->Jueves
	private int diaFinal = 6;
	private int dias = 30;
	
	
	//Getters
	public int getAny() {
		return any;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getSemanas() {
		return semanas;
	}
	
	public int getDiaInicial() {
		return diaInicial;
	}
	
	public int getDiaFinal(){
		return diaFinal;
	}
	
	public int getDias() {
		return dias;
	}
	
	
	//Setters
	public void setAny(int any) {
		this.any = any;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setSemanas(int semanas) {
		this.semanas = semanas;
	}
	public void setDiaInicial(int diaInicial) {
		this.diaInicial = diaInicial;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
	//Constructor
	public DummyFecha(){
		
	}
	
	public int getDiaSemana(int dia){
		int diaFinal = dia; //Este array tiene en el indice 0.
		
		Calendar calendario=Calendar.getInstance();
		calendario.set(getAny(),getMes()-1, diaFinal);
		
		if (calendario.get(Calendar.DAY_OF_WEEK) == 1) {
			return 6; //Si es 1 es domingo lo reubicamos al final del indice 6 
		} else{
			return (calendario.get(Calendar.DAY_OF_WEEK) - 2);
		}
	}
}
