import java.awt.*;

class Ventana extends Frame{
   public Ventana(){
      Button b1 = new Button("A");
      Button b2 = new Button("B");
      Button b3 = new Button("Botón más largo");
      Button b4 = new Button("D");
      Button b5 = new Button("E");

      setLayout(new FlowLayout());
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);
   }
   
   public static void main(String[] args){
      Ventana v = new Ventana();
      v.setSize(300,300);
      v.show();
   }
}