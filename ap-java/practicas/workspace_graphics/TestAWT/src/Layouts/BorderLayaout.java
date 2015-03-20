package Layouts;

import java.awt.*;

class BorderLayaout extends Frame{
   public BorderLayaout(){
      Button b1 = new Button("A");
      Button b2 = new Button("B");
      Button b3 = new Button("C");
      Button b4 = new Button("D");
      Button b5 = new Button("E");

      setLayout(new BorderLayout());


      add(b1,BorderLayout.NORTH);
      add(b2,BorderLayout.SOUTH);
      add(b3,BorderLayout.WEST);
      add(b4,BorderLayout.EAST);
      add(b5,BorderLayout.CENTER);
   }
   
   public static void main(String[] args){
      BorderLayaout v = new BorderLayaout();
      v.setSize(300,300);
      v.show();
   }
}