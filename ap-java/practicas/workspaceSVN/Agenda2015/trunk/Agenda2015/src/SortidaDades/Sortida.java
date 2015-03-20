package SortidaDades;

import java.io.FileNotFoundException;

import Utils.FicheroSortida;
import main.Data;
import main.Idioma;

public class Sortida{

        // Atributos
        private static Idioma idiomaIn = new Idioma("CAT"); //Objeto de Idioma de entrada
        private static Idioma idiomaOut = new Idioma("ENG"); //Objeto de Idioma de salida
        private static Data fecha = new Data(2008, 11); //Objeto que contiene todo la info de fechas
        private static FicheroSortida salida; //Objeto que permite generar y tratar ficheros de salida

        private static String[] salas = { "sala1", "sala2" };; //Este String equilave a las salas que hayan
        private static String[][] dades = new String[fecha.getDias()][Data.HORAS]; //Este Array simula el Array de datos
        private static String[][] dades2 = new String[fecha.getDias()][Data.HORAS]; //Este Array simula el otro Array de datos

        private static String nombre; //Variable auxiliar que me permite nombrar los archivos

        public static void setDades() {
                for (int i = 0; i < dades.length; i++) {
                        for (int j = 0; j < dades[i].length; j++) {
                                dades[i][j] = resultado();
                        }
                }
        }

        public static void setDades2() {
                for (int i = 0; i < dades2.length; i++) {
                        for (int j = 0; j < dades2[i].length; j++) {
                                dades2[i][j] = resultado();
                        }
                }
        }

        public static void setNombre(String nombre) {
                Sortida.nombre = nombre;
        }
        
        
        

        // Constructor
        /*public Sortida(Idioma idiomaIn, Idioma idiomaOut, Data fecha, String[][] array1, String[][] array2) {
            
            this.idiomaIn = idiomaIn;
            this.idiomaOut = idiomaOut;
            this.fecha = fecha;
            
            this.dades = array1;
            this.dades2 = array2;
            
            this.salas = salas;

            for (int i = 0; i < salas.length; i++) {
                    nombre = salas[i] + ".html";

                    salida = new FicheroSortida(nombre);
                    
                    Imprime texto = new Imprime(dades, idiomaIn, idiomaOut, fecha, salas[i]);
                    
                    System.out.println("Crea el archivo" + nombre);
                    
                    salida.insertar(texto.configuraArchivoHTML());
                    
                    salida.insertar(texto.generaTablas());
                    
                    salida.insertar(texto.finalizarHTML());
                    
                    salida.cerrar();
            }

            System.out.println("Archivos generados");

        }*/
        
        
        
        
        // Main
       public static void main(String[] args) throws FileNotFoundException {

    	   idiomaIn = new Idioma("CAT"); //Objeto de Idioma de entrada
           idiomaOut = new Idioma("ENG"); //Objeto de Idioma de salida
           //fecha = new Data(2008, 11);
    	   
        	setDades();
            setDades2();

            for (int i = 0; i < salas.length; i++) {
                    nombre = salas[i] + ".html";

                    salida = new FicheroSortida(nombre);
                    
                    Imprime texto = new Imprime(dades, idiomaIn, idiomaOut, fecha, salas[i]);
                    
                    System.out.println("Crea el archivo" + nombre);
                    
                    salida.insertar(texto.configuraArchivoHTML());
                    
                    salida.insertar(texto.generaTablas());
                    
                    salida.insertar(texto.finalizarHTML());
                    
                    salida.cerrar();
            }

            System.out.println("Archivos generados");

        }
        
        //M�todo que me rellena los Arrays de manera random con alg�n contenido.
        private static String resultado() { 

                int random = (int) (Math.random() * 4) + 1;

                switch (random) {
                case 1:
                        return idiomaIn.getEstado()[0];
                case 2:
                        return idiomaIn.getEstado()[1];
                case 3:
                        return "ReunioJava";
                case 4:
                        return "ReunioPerl";
                default:
                        return "Otro";
                }
        }

}