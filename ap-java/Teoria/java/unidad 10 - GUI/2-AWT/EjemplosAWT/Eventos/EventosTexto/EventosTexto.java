import java.awt.*;
import java.awt.event.*;


class EventosTexto extends Frame{
   private TextArea a;
   
   EventosTexto(){
      a = new TextArea();
      
      class ManipulaTextEvent implements TextListener{
         public void textValueChanged(TextEvent e) {
            System.out.println(e);
         }
      }
      
               
      ManipulaTextEvent mte = new ManipulaTextEvent();      
      a.addTextListener(mte); 

      add(a,BorderLayout.CENTER);     
   }
   
   public static void main(String[] args){
      EventosTexto et = new EventosTexto();
      et.setSize(200,200);
      et.show();
   }
}