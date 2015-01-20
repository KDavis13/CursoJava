package date;

import java.util.*;

public class TestSetTime {

	public static final short CENT_DIES = 100;
	public static final long MS_EN_UN_DIA = 24 * 60 * 60 * 1000L;
	
	public static void main(String args[]) {

		Date fecha = new Date();

		long mseg = fecha.getTime();
		mseg += CENT_DIES * MS_EN_UN_DIA;

		fecha.setTime(mseg);

		System.out.println("Dentro de 100 dias estaremos a:" + fecha);
	}
}
