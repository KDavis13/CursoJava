import java.awt.*;
import java.awt.event.*;


class EventosVentana extends Frame{
   
   EventosVentana(){
      
      class ManipulaWindowEvent implements WindowListener{
         // Metodo llamado cuando se activa la ventana
         public void windowActivated(WindowEvent e){
            System.out.println("Ventana activada");
         }  
   
         // Metodo llamado cuando se ha cerrado la ventana
         public void windowClosed(WindowEvent e){
            System.out.println("Ventana cerrada");
         }
         
         // Metodo llamado cuando el usuario cierra la ventana
         public void windowClosing(WindowEvent e){
            System.out.println("Finalizacion de la aplicacion");
            System.exit(0);
         }
   
         // Metodo llamado cuando la ventana deja de estar activa
         public void windowDeactivated(WindowEvent e)  {
            System.out.println("Ventana desactivada");
         }

         // Metodo llamado cuando la ventana pasa de icono a su estado normal
         public void windowDeiconified(WindowEvent e)  {
            System.out.println("Ventana visible");
         }

         // Metodo llamado cuando se iconifica la ventana
         public void windowIconified(WindowEvent e){
            System.out.println("Ventana iconificada");
         }  
   
         // Metodo llamado la primera vez que se muestra la ventana
         public void windowOpened(WindowEvent e)  {
            System.out.println("Ventana abierta");
         }
      }
      
      addWindowListener(new ManipulaWindowEvent());
      
   }
   
   public static void main(String[] args){
      EventosVentana ev = new EventosVentana();
      ev.setSize(200,200);
      ev.show();
   }
}