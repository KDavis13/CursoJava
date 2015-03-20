package Layouts;

import java.awt.*;

class ejGridLayout extends Frame{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ejGridLayout(){
      Button b1 = new Button("A");
      Button b2 = new Button("B");
      Button b3 = new Button("C");
      Button b4 = new Button("D");
      Button b5 = new Button("E");

      setLayout(new GridLayout(2,3));

      add(b1);
      add(b5);
      add(b3);
      add(b4);
      add(b2);
   }
   
   public static void main(String[] args){
      ejGridLayout v = new ejGridLayout();
      v.setSize(300,300);
      v.show();
   }
}