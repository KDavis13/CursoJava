package ex01;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Main {

	public static void main(String[] args) {
		
		DateTime dt1 = new DateTime(2015, 1, 20, 12, 0);
		DateTime dt2 = new DateTime(2015, 1, 1, 12, 0);
		
		System.out.println(Days.daysBetween(dt1, dt2).getDays());

	}

}
