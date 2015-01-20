package format;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat2 {

	public static void main(String[] args) {

		Date fechaHoy = new Date(); // Obtenemos la fecha de hoy

		// El método getDateInstance() obtiene una instancia para formatos
		// Fecha (sin hora). Por defecto se emplea la configuracion
		// regional del ordenador (Locale), ademas, el formato es
		// el mediano (MEDIUM): dd-mes-yyyy
		String cadenaFecha = 
				DateFormat.getDateInstance().format(fechaHoy);

		System.out
				.println("Fecha formateada con la configuracion regional (formato mediano por defecto): "
						+ cadenaFecha);

		// Mostramos la fecha formateada pero forzando el formato corto (SHORT)
		cadenaFecha = DateFormat.getDateInstance(DateFormat.SHORT).format(
				fechaHoy);

		System.out
				.println("Fecha formateada con la conf. reg. forzando formato corto: "
						+ cadenaFecha);
		// Mostramos la fecha formateada pero forzando el formato LONG
		cadenaFecha = DateFormat.getDateInstance(DateFormat.LONG).format(
				fechaHoy);

		System.out
				.println("Fecha formateada con la conf. reg. forzando formato largo: "
						+ cadenaFecha);

		// Mostramos la fecha formateada pero forzando el formato FULL
		cadenaFecha = DateFormat.getDateInstance(DateFormat.FULL).format(
				fechaHoy);

		System.out
				.println("Fecha formateada con la conf. reg. forzando formato completo: "
						+ cadenaFecha);
	}
}