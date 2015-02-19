import java.awt.*;
import java.awt.event.*;


class EventosRaton extends Frame{
   private Button b;
   private TextField c;
   private int contador=0;
   
   EventosRaton(){
      b = new Button("Boton");
      c = new TextField();
      
      class ManipulaMouseEvent implements MouseListener{
         public void mouseEntered(MouseEvent e) {
            System.out.println("El raton entra en el componente:");
            System.out.println(e.getComponent());
         }
      
         public void mouseExited(MouseEvent e) {
            System.out.println("El raton sale del componente:");
            System.out.println(e.getComponent());
         }
         public void mousePressed(MouseEvent e){}
         public void mouseClicked(MouseEvent e){}
         public void mouseReleased(MouseEvent e){}
         
      }
      
      class ManipulaMouseEventBoton extends ManipulaMouseEvent{
         public void mousePressed(MouseEvent e){
            contador++;
            System.out.println("El componente:");
            System.out.println(e.getComponent());
            System.out.println("Ha sido pulsado : " + contador + " veces");
         }
      }
      
      
               
      ManipulaMouseEvent mme = new ManipulaMouseEvent();  
      ManipulaMouseEventBoton mmeb = new ManipulaMouseEventBoton();      
      b.addMouseListener(mmeb); 
      c.addMouseListener(mme); 

      add(b,BorderLayout.NORTH);
      add(c,BorderLayout.SOUTH);      
   }
   
   public static void main(String[] args){
      EventosRaton er = new EventosRaton();
      er.setSize(200,200);
      er.show();
   }
}