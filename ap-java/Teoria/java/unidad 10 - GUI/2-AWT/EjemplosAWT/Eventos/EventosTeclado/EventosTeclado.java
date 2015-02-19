import java.awt.*;
import java.awt.event.*;


class EventosTeclado extends Frame{
   private TextArea a;
   
   EventosTeclado(){
      a = new TextArea();
      
      class ManipulaKeyEvent implements KeyListener{
         public void keyPressed(KeyEvent e) {
            char car;
            car = e.getKeyChar();
            if ( !(Character.isLetter(car)) & !(Character.isDigit(car)))
               System.out.println(e.getKeyText(e.getKeyCode()));                        
         }
      
         public void keyReleased(KeyEvent e) {}
         
         public void keyTyped(KeyEvent e) {
            char car;
            car = e.getKeyChar();
            if ( (Character.isLetter(car)) | (Character.isDigit(car)))
               System.out.println(car);
         }
         
      }
      
               
      ManipulaKeyEvent mce = new ManipulaKeyEvent();      
      a.addKeyListener(mce); 

      add(a,BorderLayout.CENTER);     
   }
   
   public static void main(String[] args){
      EventosTeclado ea = new EventosTeclado();
      ea.setSize(200,200);
      ea.show();
   }
}