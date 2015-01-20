package conversor;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatConversion {
	
   public static void main(String[] args) {
	   
      String cadenaFecha="31/12/01";
      
      // Obtenemos un formateador.
      // Ya que la cadena emplea el formato
      // corto, debemos indicar lo mismo al formateador
      DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
      
      Date fecha=null;
      
      try {
         // Mediante el formateador podemos convetir la 
    	  // cadena que representa
         // una fecha en un objeto java.util.Date
         fecha=df.parse(cadenaFecha);

         // Ahora ya tenemos una fecha valida
         // La imprimimos sin formato 
         System.out.println("Sin aplicar formato: "+fecha);
         
         // Mostramos la fecha con el formato corto
         System.out.println("Aplicando formato: "+df.format(fecha));
         
      } catch (ParseException e) {
         e.printStackTrace();
      }
   }
}