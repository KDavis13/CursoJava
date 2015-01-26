package periodo03;

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
		
		// Ara això no te efecte.
		fechaFinal.setYear(73);
		
		// Ens han tornat a fotre
		p.getFin().setYear(69);

		System.out.println(p);
	}
}
