package date;

import java.util.Date;

public class TestGetTime {

	public static void main(String args[]) {

		// Obtenim la data/hora actual
		Date fechaActual = new Date();

		// Obtenim la quantitat de ms des de 01/01/1970
		long mseg = fechaActual.getTime();

		// Obtenim els dies que han passat des de 01/01/1970
		long dias = mseg / (24 * 60 * 60 * 1000);

		System.out.println("Dias transcurridos desde el " +
		"01/01/1970: " + dias);
	}
}
