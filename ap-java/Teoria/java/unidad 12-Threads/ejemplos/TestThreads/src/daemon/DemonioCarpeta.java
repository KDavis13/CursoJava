package daemon;

import java.io.File;
import java.util.Scanner;

public class DemonioCarpeta extends Thread {
	
  public DemonioCarpeta() {
    setDaemon(true); // Establer el thread como demonio
    start(); // Arrancar el demonio
  }
  
  public void run() {
    while (true) {
      try {
        sleep(3000); // duerme durante 5 segundos
        if (new File("anonimo.txt").exists())
          System.out.println("Atencion! fichero anonimo.txt en la carpeta del proyecto");
        else 
        	System.out.print(".");         
     } catch (InterruptedException e) {
    	 e.printStackTrace();
     }
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Pulsar enter para finalizar");
    DemonioCarpeta demonio=new DemonioCarpeta();
    Scanner finalizar = new Scanner(System.in);
    finalizar.nextLine(); demonio.stop();
  }
  
}
