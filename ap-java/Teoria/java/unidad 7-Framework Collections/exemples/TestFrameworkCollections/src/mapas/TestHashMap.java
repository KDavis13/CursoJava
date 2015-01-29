package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestHashMap {

  public static void main(String[] args) {

    String alumnoBuscar = "";
    Map<String,String> notasJava = 
    		new HashMap<String,String>();

    notasJava.put("Felipe", "Aprobado");
    notasJava.put("Maria", "Excelente");
    notasJava.put("Jordi", "Notable");
    notasJava.put("Jaime", "Insuficiente");

    // Añadimos una clave repetida->machaca (Felipe,Aprobado)
    notasJava.put("Felipe", "Notable");
   
    System.out.println("¿De que alumno quiere conocer la nota?"); 

    // Obtenemos la entrada por teclado del usuario
    
    Scanner scanner = new Scanner (System.in);
    alumnoBuscar = scanner.next();
    
    // Si el alumno existe en el mapeo mostrar nota
    if (notasJava.containsKey(alumnoBuscar)) {
      System.out.println("Su nota es "+
        notasJava.get(alumnoBuscar)+"\n");
     
    } else
        System.out.println("Alumno no encontrado\n");
  
     /* Ahora mostramos todas las parejas alumno-nota.
       Pero ojo! HashMap no extiende de Iterable luego no
       se puede recorrer como hacemos con las listas, los
       conjuntos y las colas. Así que tenemos que utilizar 
       el método entrySet que nos devuelve un conjunto (Set)
       de referencias del tipo interfaz Map.Entry, es decir 
       la versión 'Set' de una mapa. Map.Entry sí es iterable*/
       
    for (Entry<String,String> e:notasJava.entrySet()) {
       System.out.println(e.getKey()+" obtuvo un "+e.getValue());
    }

   }
  
 }
