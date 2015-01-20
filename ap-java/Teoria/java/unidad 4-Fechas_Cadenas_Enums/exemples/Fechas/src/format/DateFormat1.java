package format;

import java.text.DateFormat;
import java.util.Date;

public class DateFormat1 {

public static void main(String[] args) {
	
   Date fechaHoy = new Date(); // Obtenemos la fecha de hoy
   
   System.out.println("Fecha de hoy sin formatear: " + fechaHoy);

   // Utilizamos la clase DateFormat para formaterar Fechas y horas
   // El método getInstance() obtiene una instancia para formatos
   // Fecha/Hora, se emplea la configuracion regional del ordenador
   // (Locale),
   // ademas, el formato es el corto (SHORT): dd/MM/yy HH:mm
   
   DateFormat df = DateFormat.getInstance();
   
   String cadenaFecha = df.format(fechaHoy);

   System.out.println("Fecha/Hora formateada con la " +
    "configuracion regional (formato corto por defecto): " + 
		   cadenaFecha);
   }
}
