package SortidaDades;

public interface HTML {
        
        String saltoLinea = "</br>";
        
        String abreHTML = "<!DOCTYPE html><html><head><title>";
        
        String cabecera = "</title><meta charset='UTF-8'><meta name='viewport' " + 
                                          " content='width=device-width, initial-scale=1.0'>";
                                          
        String css = "<style>body {background-color: white;font-family: Arial;" +
                                 "}h1 {text-align: center;font-size: 24px;}h3 {text-align: center;" +
                                 "font-size: 18px;text-decoration: underline;}table {width:1000px;" +
                                 "border-collapse: collapse;margin: 20px auto;}td {border: 1px solid black;" +
                                 "text-align: center;}tr:first-child td { border-bottom:1px solid black;}" +
                                 ".cabecera td {background-color: #C2DFFF; border:none;font-weight: bold;}" +            
                                 ".cabecera:first-child td{background-color: #A0CFEC;}td:first-child {" +
                                 "background-color: #C2DFFF;border-left: none;font-weight: bold;}" + 
                                 "td:last-child {border-right: none;}.tancat {background-color: darkgrey;}"
                                 + ".lliure {background-color: #64E986; }.ocupat {background-color: #E66C50;}" +
                                 "</style></head><body><h1>";
        
        String titulos = "</h1><h3>";
        String cierraTitulos = "</h3>";
        
        String abreTabla = "<table>";
        String cierraTabla = "</table>";
        
        String abreTr = "<tr>";
        String cierraTr = "</tr>";
        
        String abreTrCab = "<tr class='cabecera'>";
        
        String abreTd = "<td>";
        String abreTdTancat = "<td class='tancat'>";
        String abreTdLliure = "<td class='lliure'>";
        String abreTdOcupate = "<td class='ocupat'>";
        String cierraTd = "</td>";

        String cierraDocument = "</body></html>";
        
        String[] horas = {"00 - 01", "01 - 02", "02 - 03", "03 - 04", "04 - 05", "05 - 06", "06 - 07", 
                                          "07 - 08", "08 - 09", "09 - 10", "10 - 11", "11 - 12", "12 - 13", "13 - 14",
                                          "14 - 15", "15 - 16", "16 - 17", "17 - 18", "18 - 19", "19 - 20", "20 - 21",
                                          "21 - 22", "22 - 23", "23 - 24"};
        


        //Devuelve String con la cabecera del html ( hasta <h1> )
        public static String generaInicioHTML(String titulo){
                StringBuffer resultado = new StringBuffer();
                
                resultado.append(abreHTML);
                resultado.append(titulo);
                resultado.append(cabecera);
                resultado.append(css);
                
                return resultado.toString();
        }
        

        //Devuelve los titulos ( cierra los t�tulos y rellena )
        public static String generaTitulos(String mes, String agenda, int any){
                StringBuffer resultado = new StringBuffer();
                
                resultado.append(agenda);
                resultado.append(titulos);
                resultado.append(mes + " " + any);
                resultado.append(cierraTitulos);
                return resultado.toString();
        }
        

        //Cierra el documento HTML
        public static String cierraHTML(){
                StringBuffer resultado = new StringBuffer();
                
                resultado.append(cierraDocument);
                
                return resultado.toString();
        }
        

        //Genera la cabecera de la tabla (de momento solo el primer TR)
        public static String generarCabecera(String[] diasSemana){
                
                
                StringBuffer resultado = new StringBuffer();
                
                String[] dias = diasSemana;
                
                resultado.append(abreTrCab);
                
                for(int i = 0; i < dias.length + 1; i++){
                        
                        if(i == 0){
                                resultado.append(abreTd);
                                resultado.append(" ");
                                resultado.append(cierraTd);
                        } else{
                                resultado.append(abreTd);
                                resultado.append(dias[i-1]);
                                resultado.append(cierraTd);
                        }
                }
                
                resultado.append(cierraTr);
                
                return resultado.toString();
        }
        
        

        
        
        
        //Este es el método que crea las tablas. es llamado tantas veces como semanas)
        public static String generaTabla(String[][] datos, String[] DiasSemanas, String[] dias){
                StringBuffer resultado = new StringBuffer();
                String[][] dades = datos;//rorateArray(datos);
                String[] diasSem = DiasSemanas;
                
                resultado.append(abreTabla);
                
                resultado.append(generarCabecera(diasSem));
                resultado.append(generarCabecera(dias));
                
                for(int i = 0;i<horas.length;i++){
                        String[] provisional = generaArrayPorHora(i, dades);
                        resultado.append(generarCelda(provisional, i));
                }

                resultado.append(cierraTabla);
                
                return resultado.toString();
        }
        
        
        //Genera TR y los rellena con el Array que pide
                public static String generarCelda(String[] datos, int hora){
                        
                        StringBuffer resultado = new StringBuffer();
                        String[] datosFinal = datos;
                        
                        resultado.append(abreTr);
                        
                        for(int i = 0; i < datosFinal.length +1; i++){
                                
                                if(i == 0){
                                        resultado.append(abreTd);
                                        resultado.append(horas[hora]);
                                        resultado.append(cierraTd);
                                } else {
                                        resultado.append(tipoDeTD(datosFinal[i-1]));
                                }                       
                        }
                        
                        resultado.append(cierraTr);
                        
                        return resultado.toString();
                }
        
        
        //Este método sirve para recoger los datos ("invierte" el Array que le llega)
        public static String[] generaArrayPorHora(int i, String[][] datos){
                
                String[][] array = datos;
                String[] horaSemana = new String[7];
                int cont = 0;
                
                for(String[] dato : array){
                        horaSemana[cont] = dato[i];
                        cont++;
                }
                
                return horaSemana;
                
        }
        
        
        //Este método lo que hace es setear el tipo de TD que tiene que imprimir
        public static String tipoDeTD(String reunion){
                StringBuffer resultado = new StringBuffer();
                
                if(reunion.equals((Imprime.idiomaIn.getEstado()[0]))    ){
                        resultado.append(abreTdTancat);
                } else if(reunion.equals((Imprime.idiomaIn.getEstado()[1]))){
                        resultado.append(abreTdLliure);
                } else if(reunion.equals(" ")){
                        resultado.append(abreTd);
                } else {
                        resultado.append(abreTdOcupate);
                }
                
                if(reunion.equals((Imprime.idiomaIn.getEstado()[0]))    ){
                        resultado.append(Imprime.idiomaOut.getEstado()[0]);
                } else if(reunion.equals((Imprime.idiomaIn.getEstado()[1]))){
                        resultado.append(Imprime.idiomaOut.getEstado()[1]);
                } else if(reunion.equals(" ")){
                        resultado.append(" ");
                } else {
                        resultado.append(reunion);
                }

                
                resultado.append(cierraTd);
                
                return resultado.toString();
        }       
}
