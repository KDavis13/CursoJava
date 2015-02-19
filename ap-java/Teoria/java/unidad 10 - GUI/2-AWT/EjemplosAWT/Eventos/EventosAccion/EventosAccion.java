import java.awt.*;
import java.awt.event.*;


class EventosAccion extends Frame{
   private TextField c1;
   private TextField c2;
   private Button b;
   
   EventosAccion(){
      c1 = new TextField();
      c2 = new TextField();
      b = new Button("Salir");
         
      class ManipulaActionEvent implements ActionListener{
         public void actionPerformed(ActionEvent e){
            System.out.println(e.paramString());
            
            if (e.getSource() instanceof TextField){
               TextField c = (TextField) e.getSource();
               if (c == c1)
                  c2.requestFocus();
               else
                  c1.requestFocus();
            }
            else
               System.exit(0);
            
         }
      } 
     
      
               
      ManipulaActionEvent mae = new ManipulaActionEvent();      
      c1.addActionListener(mae); 
      c2.addActionListener(mae); 
      b.addActionListener(mae); 

      add(c1,BorderLayout.NORTH);
      add(c2,BorderLayout.SOUTH);      
      add(b,BorderLayout.CENTER);
   }
   
   public static void main(String[] args){
      EventosAccion ea = new EventosAccion();
      ea.setSize(200,200);
      ea.show();
   }
}