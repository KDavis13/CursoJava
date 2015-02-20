import java.awt.event.*;
import java.awt.*;

public class Ventana extends Frame{
   private CardLayout cardLayout;
   private Panel cardPanel;
   private Button b1;
   private Button b2;
  
   Ventana(){
      
      // El panel que va a contener tres paneles
      // organizados como CardLayout
      cardPanel = new Panel();

      cardLayout = new CardLayout();
      cardPanel.setLayout(cardLayout);
      
      // El primero de los paneles
      Panel botonesPanel = new Panel();
      botonesPanel.add(new Button("Boton 1"));
      botonesPanel.add(new Button("Boton 2"));
      botonesPanel.add(new Button("Boton 3"));
    
      // El segundo de los paneles
      Panel camposTextoPanel = new Panel();
      camposTextoPanel.add(new TextField(10));
      camposTextoPanel.add(new TextField(10));
      
      // El panel que se mostrara al inicio
      Panel inicioPanel = new Panel();
      inicioPanel.setBackground(new Color(.85f,.85f,.85f));
      inicioPanel.add(new Label("Ejemplo de CardLayout"));
      
      // Añadimos los tres paneles asignandoles un nombre
      cardPanel.add(inicioPanel,"inicial");
      cardPanel.add(botonesPanel,"botones");
      cardPanel.add(camposTextoPanel,"texto");

      // Panel de control desde donde se selecciona el subpanel a mostrar
      Panel controlPanel = new Panel();
      b1 = new Button("Botones");
      b2 = new Button("Campos de Texto");
      
      // Si se pulsa b1 mostramos el panel con nombre "botones"
      b1.addMouseListener(new MouseAdapter(){
         public void mousePressed(MouseEvent e){
            cardLayout.show(cardPanel,"botones");
         }
      });

      // Si se pulsa b2 mostramos el panel con nombre "texto"
      b2.addMouseListener(new MouseAdapter(){
         public void mousePressed(MouseEvent e){
            cardLayout.show(cardPanel,"texto");
         }
      });

    
      controlPanel.add(b1);
      controlPanel.add(b2);

      // Organizacion en la ventana
      setLayout(new BorderLayout());
      add(controlPanel,BorderLayout.NORTH);
      add(cardPanel,BorderLayout.CENTER);
   }
   
   public static void main(String[] args){
      Ventana v = new Ventana();
      v.setSize(300,300);
      v.show();
   }
   
}
