import java.awt.*;
import java.awt.event.*;


class EventosComponente extends Frame{
   private int cont=0;
   
   EventosComponente(){
      Button b = new Button("Boton");
      TextField c = new TextField();
      
      class ManipulaComponentEvent implements ComponentListener{
         public void componentHidden(ComponentEvent e){
         }
         public void componentMoved(ComponentEvent e){
            cont = cont+1;
            System.out.println(cont + "*************************");
            System.out.println(e.getSource());
            System.out.println("Ha sido movido");
         }
         public void componentResized(ComponentEvent e){
            cont = cont+1;
            System.out.println(cont + "*************************");
            System.out.println(e.getSource());
            System.out.println("Ha cambiado su tamaño");
         }
         public void componentShown(ComponentEvent e){
         }
         
      }
      
      ManipulaComponentEvent mce = new ManipulaComponentEvent();
      
      b.addComponentListener(mce);
      c.addComponentListener(mce);
      
      addComponentListener(mce);
      
      add(b,BorderLayout.NORTH);
      add(c,BorderLayout.SOUTH);
      
      
   }
   
   public static void main(String[] args){
      EventosComponente ec = new EventosComponente();
      ec.setSize(200,200);
      ec.show();
   }
}