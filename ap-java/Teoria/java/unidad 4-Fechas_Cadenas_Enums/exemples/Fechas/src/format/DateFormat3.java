package format;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat3 {

   public static void main(String[] args) {

      Date fechaHoy=new Date(); // Obtenemos la fecha de hoy

      // Comprobamos cual es la configuración regional
      Locale miConfRegional=Locale.getDefault();
      
      System.out.println("Configuracion regional: "+miConfRegional);

      System.out.println("Fecha formateada con la conf reg. " + 
      "inglesa (formato mediano por defecto):"+
    		  DateFormat
    		  .getDateInstance(
    				  DateFormat.MEDIUM,
    				  Locale.ENGLISH).format(fechaHoy));
   }
}
