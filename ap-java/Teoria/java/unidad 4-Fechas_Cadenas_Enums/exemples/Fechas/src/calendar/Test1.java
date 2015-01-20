package calendar;

import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {
		
		Calendar cal1 = UtilesFecha.createStrictDate(28, 2, 2015);
			
		String fechaBonita = 
				UtilesFecha.getPrettyString(cal1);		
		
		System.out.println(fechaBonita);
	}
}
