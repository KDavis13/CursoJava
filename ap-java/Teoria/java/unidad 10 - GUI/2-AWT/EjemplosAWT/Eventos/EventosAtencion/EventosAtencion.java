import java.awt.*;
import java.awt.event.*;


class EventosAtencion extends Frame{
   private Button b;
   private TextField c;
   
   EventosAtencion(){
      b = new Button("Boton");
      c = new TextField();
      
      class ManipulaFocusEvent implements FocusListener{
         public void focusGained(FocusEvent e) {
            System.out.println("******************");
            System.out.println(e.getSource());
            System.out.println("Gana la atencion");
         }
      
         public void focusLost(FocusEvent e) {
            System.out.println("******************");
            System.out.println(e.getSource());
            System.out.println("Pierde la atencion");
         }
      }
      
               
      ManipulaFocusEvent mce = new ManipulaFocusEvent();      
      b.addFocusListener(mce); 
      c.addFocusListener(mce); 

      add(b,BorderLayout.NORTH);
      add(c,BorderLayout.SOUTH);      
   }
   
   public static void main(String[] args){
      EventosAtencion ea = new EventosAtencion();
      ea.setSize(200,200);
      ea.show();
   }
}