package calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilesFecha {

	public static Calendar 
		createStrictDate(int dia, int mes, int any) 
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setLenient(false);

		configureDate(dia, mes, any, calendar);

		return calendar;
	}

	public static Calendar createDate(int dia, int mes, int any) {
		Calendar calendar = Calendar.getInstance();
		
		configureDate(dia, mes, any, calendar);

		return calendar;
	}
	
	private static void configureDate(int dia, int mes, int any,
			Calendar calendar) 
	{
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.MONTH, mes - 1);
		calendar.set(Calendar.YEAR, any);
	}	

	public static String getPrettyString(Calendar cal) {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date objDate = cal.getTime();

		return df.format(objDate);
	}

}
