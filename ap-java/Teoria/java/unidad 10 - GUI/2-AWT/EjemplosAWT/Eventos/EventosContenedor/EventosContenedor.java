import java.awt.*;
import java.awt.event.*;


class EventosContenedor extends Frame{
   private Panel p;
   private Button b;
   private TextField c;
   
   EventosContenedor(){
      
      p = new Panel();      
      b = new Button("Boton");
      c = new TextField();
      
      class ManipulaContainerEvent implements ContainerListener{
         public void componentAdded(ContainerEvent e) {
            System.out.println("*************************");
            System.out.println(e.getSource());
            System.out.println("Añadido");  
            System.out.println(e.getChild());      
         }
      
         public void componentRemoved(ContainerEvent e) {
            System.out.println("*************************");
            System.out.println(e.getSource());
            System.out.println("Retirado");   
            System.out.println(e.getChild());                       
         }
      }
      
      
      class Hilo extends Thread{
         public void run(){
            while (true){
               try{
                  sleep(1500);
               }catch(InterruptedException e){
                  System.out.println("Hilo interrumpido");
               }               
               p.add(b,BorderLayout.NORTH);
               p.add(c,BorderLayout.SOUTH);  
               p.validate();
               p.repaint();

               try{
                  sleep(1500);
               }catch(InterruptedException e){
                  System.out.println("Hilo interrumpido");
               }
               p.remove(b);
               p.remove(c);
               p.validate();
               p.repaint();
            }           
         }
      }
      
      new Hilo().start();
               
      ManipulaContainerEvent mce = new ManipulaContainerEvent();      
      p.addContainerListener(mce);            
      add(p);      
   }
   
   public static void main(String[] args){
      EventosContenedor ec = new EventosContenedor();
      ec.setSize(200,200);
      ec.show();
   }
}