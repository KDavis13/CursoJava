package periodo01;

import java.util.Calendar;
import java.util.Date;

public class TestPeriodo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2015, 0, 1); // 01-01-2015
		
		Date fechaInicial = cal.getTime();
		
		cal.set(2015, 1, 1); // 01-02-2015
		Date fechaFinal = cal.getTime() ;
		
		Periodo p = new Periodo(fechaInicial, fechaFinal); 

		// Fija el año especificado sumando a 1900
		// Atencion! esto modifica la estructura interna de 'p'
		fechaFinal.setYear(73);

		System.out.println(p);
	}
}
