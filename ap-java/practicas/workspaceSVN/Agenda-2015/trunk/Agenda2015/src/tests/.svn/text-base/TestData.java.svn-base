package tests;

import java.util.Calendar;

import dummies.DummyConfig;

public class TestData {

	// Constantee de las horas del dï¿½a
	public final static int HORAS = 24;
	public final static int NUMERO_DIAS_SEMANA = 7;

	// Atributos
	private int any;
	private int mes;
	private int dia; // afegit per a poder crear objectes data passant-li
						// parametres
	private int semanas; // Semanas totales del mes
	private int diaInicial; // Esto es el ï¿½ndice del dï¿½a de la semana, de 0 al
							// 6. ->Jueves
	private int dias; // Dias totales del mes
	private String MSG = null;

	public void informarAtributos(int any, int mes) {

		Calendar calendario = Calendar.getInstance();

		setAny(any);
		setMes(mes);
		calendario.set(getAny(), getMes() - 1, 1);
		setDiaInicial(calendario.get(Calendar.DAY_OF_WEEK));
		setDias(calendario.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendario.set(getAny(), getMes() - 1, getDias());
		setSemanas(calendario.get(Calendar.WEEK_OF_MONTH) + 1);
	}

	private boolean validarFecha(int any, int mes) throws Exception {
		if (any > 0)
			if (mes > 0 && mes < 13)
				return true;
			else {
				MSG = "El mes tiene que ser válido, introduzca un valor entre 1 y 12";
			}
		else {
			MSG = "El año debe ser válido, introduzca un valor mayor de cero";
		}
		throw new Exception();

	}

	// Constructor

	/**
	 * 
	 * constructor principal recull els parametres Any i Mes del fitxer config.
	 * 
	 * */

	public TestData(int any, int mes) {

		try {
			if (validarFecha(any, mes)) {
				informarAtributos(any, mes);
			}

		} catch (Exception e) {
			SalidaLog.escribirLog(MSG);
		}

	}

	// em va be tenir aquest constructor pq sempre treballo amb el mateix mes
	// que em ve de config i necessito el nÃºmero de dies del mes
	public TestData() {

		try {
			any = Config.anyo;
			mes = Config.mes;
			if (validarFecha(any, mes)) {
				informarAtributos(any, mes);
			}

		} catch (Exception e) {
			SalidaLog.escribirLog(MSG);
		}

	}

	// Getters
	public int getAny() {
		return any;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return this.dia;
	}

	public int getSemanas() {
		return semanas;
	}

	public int getDiaInicial() {
		return diaInicial;
	}

	public int getDias() {
		return dias;
	}

	// Setters

	private void setAny(int any) {
		this.any = any;
	}

	private void setMes(int mes) {
		this.mes = mes;
	}

	private void setDia(int dia) {
		this.dia = dia;

	}

	private void setSemanas(int semanas) {
		this.semanas = semanas;
	}

	private void setDiaInicial(int diaInicial) {

		if (diaInicial == 1) {
			diaInicial = 6; // Si es 1 es domingo lo reubicamos al final del
							// indice 6
		} else {
			diaInicial -= 2;
		}
		this.diaInicial = diaInicial;

	}

	private void setDias(int dias) {
		this.dias = dias;
	}

	// Mï¿½todo que devuelve dï¿½a de la semana

	public int getDiaSemana(int dia) {
		int diaFinal = dia; // Este array tiene en el indice 0.

		Calendar calendario = Calendar.getInstance();
		calendario.set(getAny(), getMes() - 1, diaFinal);

		if (calendario.get(Calendar.DAY_OF_WEEK) == 1) {
			return 6; // Si es 1 es domingo lo reubicamos al final del indice 6
		} else {
			return (calendario.get(Calendar.DAY_OF_WEEK) - 2);
		}
	}

	
	  public static void main(String[] args){
	  
	  
	  Config config = new Config("config.txt");
	  
	  TestData data = new TestData(config.getAnyo(), config.getMes()); 
	  TestData data2 = new TestData(2, 14); 
	  TestData data3 = new TestData(-2, 11); 
	  TestData data4 = new TestData(0, 0); 
	  System.out.println(data.getAny()+" "+ data.getMes() +" "+
	  data.getSemanas()+ " "+data.getDiaInicial()+" "+ data.getDias());
	  
	  
	  }
	 
}