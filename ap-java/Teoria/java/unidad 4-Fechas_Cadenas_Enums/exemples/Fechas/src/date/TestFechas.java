package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {
	public static void main(String[] a) throws Exception {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d1 = df.parse("15/06/2008");
		Date d2 = df.parse("04/04/2009");
		
		String relacion = "";
		if (d1.equals(d2))
			relacion = "es la misma fecha";
		else if (d1.before(d2))
			relacion = "anterior";
		else if (d1.after(d2))
			relacion = "posterior";
		System.out.println(df.format(d1) + " es " + relacion + " "
				+ df.format(d2));
	}
}