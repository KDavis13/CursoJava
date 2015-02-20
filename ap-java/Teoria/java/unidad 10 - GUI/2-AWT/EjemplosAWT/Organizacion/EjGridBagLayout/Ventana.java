import java.awt.*;
import java.awt.event.*;


public class Ventana extends Frame{
   private TextField t1;
   private TextField t2;
   private TextField t3;
   private TextField t4;
   private TextField t5;
   private TextField t6;
   private TextField t7;
   private TextField t8;
   private TextField t9;
   

   Ventana(){
      
      // Fuente a utilizar      
      setFont(new Font("Arial", Font.BOLD, 16));
            
      // Un panel que contiene unos cuuantos componentes
      Panel p1 = new Panel();
      p1.setBackground(new Color(240,240,240));

      // Se especifica como se deben organizar los componentes en el panel
      p1.setLayout(new GridBagLayout());

      GridBagConstraints c = new GridBagConstraints();
      // Los componentes se alinearan a la izquierda
      c.anchor = GridBagConstraints.WEST;
      
      // Separacion entre entre componentes
      // Insets(int top, int left, int bottom, int right) 
      c.insets = new Insets(2,2,2,2); 

      // Para que rellene todo el espacio disponible
      c.fill = GridBagConstraints.BOTH;
      c.weightx = 1.0;

      // Fila 0, Columna 0
      c.gridy = 0; c.gridx = 0;    
      p1.add(new Label("Nombre"),c);
      
      // Columna 1, Fila 0 (se utiliza el ultimo valor de c.gridy)
      c.gridx = 1;
      c.gridwidth=3;
      t1 = new TextField(25);
      p1.add(t1,c);
      
      // Fila 1, Columna 0
      c.gridy = 1; c.gridx = 0;
      c.gridwidth=1;
      p1.add(new Label("Departamento"),c);

      // Columna 1, Fila 1
      c.gridx = 1;
      c.gridwidth=3;
      t2 = new TextField(25);
      p1.add(t2,c);

      // Fila 2 Columna 0
      c.gridy = 2; c.gridx = 0;
      c.gridwidth=1;
      p1.add(new Label("Grupo"),c);

      // Columna 1, Fila 2
      c.gridx = 1;
      c.gridwidth=3;
      t3 = new TextField(25);
      p1.add(t3,c);
            
      c.gridwidth=1;
      // Fila 3 Columna 0
      c.gridy = 3; c.gridx = 0;
      p1.add(new Label("Dias"),c);
      
      // Columna 1
      c.gridx = 1;
      t4 = new TextField(25);
      p1.add(t4,c);
      
      // Columna 2
      c.gridx = 2;
      p1.add(new Label("Horas"),c);
   
      // Columna 3
      c.gridx = 3;
      t5 = new TextField(25);
      p1.add(t5,c);
      
      // Fila 4 Columna 1
      c.gridy = 4; c.gridx = 1;
      t6 = new TextField(25);
      p1.add(t6,c);
      
      c.gridx = 3;
      t7 = new TextField(25);
      p1.add(t7,c);
      
      // Fila 5 Columna 1
      c.gridy = 5; c.gridx = 1;
      t8 = new TextField(25);
      p1.add(t8,c);
      
      // Columna 3, Fila 5
      c.gridx = 3;
      t9 = new TextField(25);
      p1.add(t9,c);
      
      // Fila 6 Columna 0
      c.gridy=6; c.gridx=0;
      p1.add(new Label("Descripción"),c);
      
      c.gridx=1;
      c.gridheight=2;
      c.gridwidth=2;
      p1.add(new TextArea(),c);

      // Otro panel
      Panel p2 = new Panel();
      p2.setBackground(new Color(240,240,240));

      p2.setLayout(new GridBagLayout());
    
      CheckboxGroup group = new CheckboxGroup();
      
      c.gridheight=1;
      c.gridwidth=1;
      
      c.gridy=0; c.gridx=0;
      p2.add(new Label("Equipamiento necesario"),c);
      
      c.gridy=1; 
      p2.add(new Checkbox("PC-IBM Pentium III", group, true),c);
      
      c.gridx=1;
      p2.add(new Checkbox("PC-IBM Pentium IV", group, false),c);
      
      c.gridy=2; c.gridx=0;     
      p2.add(new Checkbox("Portatil Pentium III", group, false),c);
      
      c.gridx=1;
      p2.add(new Checkbox("Portatil Pentium IV", group, false),c);

      c.gridy=3; c.gridx=0;      
      p2.add(new Checkbox("Pantalla"),c);

      c.gridx=1;
      p2.add(new Checkbox("Cañón de video"),c);

      // Otro panel

      Panel p3 = new Panel();
      p3.setBackground(new Color(240,240,240));

      p3.setLayout(new GridBagLayout());
    
      group = new CheckboxGroup();
      
      c.gridheight=1;
      c.gridwidth=1;
      
      c.gridy=0; c.gridx=0;
      p3.add(new Label("Sistemas operativos y aplicaciones"),c);
      
      c.gridy=1; 
      p3.add(new Checkbox("Windows 2000", group, true),c);
      
      c.gridx=1;
      p3.add(new Checkbox("Windows XP", group, false),c);
      
      c.gridy=2; c.gridx=0;   
      p3.add(new Checkbox("Linux Suse", group, false),c);
      
      c.gridx=1;
      p3.add(new Checkbox("Linux RedHat", group, false),c);

      c.gridy=3; c.gridx=0;      
      p3.add(new Checkbox("Matlab"),c);

      c.gridx=1;
      p3.add(new Checkbox("Eclipse"),c);

      c.gridy=4; c.gridx=0;      
      p3.add(new Checkbox("J2SDK"),c);

      c.gridx=1;
      p3.add(new Checkbox("C++"),c);

      // Otro panel             
      Panel p4 = new Panel(); 
      
      p4.setLayout(new GridBagLayout());
      
      c.gridx=0; c.gridy=0;    
      p4.add(new Label("Observaciones"),c);
      
      c.gridy=1;
      p4.add(new TextArea(),c);
     
      // Otro panel
      Panel p5 = new Panel(); 
      
      p5.setLayout(new FlowLayout());
      
      p5.add(new Button("Enviar solicitud"),c);
     
      // Un panel que contiene a los demas
      Panel global = new Panel();
       
      global.setLayout(new GridBagLayout());

      c.anchor = GridBagConstraints.CENTER;
      
      // Separacion : Insets(int top, int left, int bottom, int right) 
      c.insets = new Insets(3,2,3,2); 

      Label titulo = new Label("Solicitud de reserva de Aula de I+D");
      titulo.setFont(new Font("Arial", Font.BOLD, 24));
      titulo.setForeground(new Color(100,0,0));


      c.gridy=0; c.gridx=0;      
      global.add(titulo,c);
      
      c.gridy=1;
      global.add(p1,c);
      
      c.gridy=2;
      global.add(p2,c);      
      
      c.gridy=3;
      global.add(p3,c);      

      c.gridy=4;
      global.add(p4,c);      

      c.gridy=5;
      global.add(p5,c);      

      // Ponemos el panel global dentro de un ScrollPane
      ScrollPane barraDesp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
      barraDesp.add(global);
      
      setLayout(new BorderLayout());
      add(barraDesp,BorderLayout.CENTER);
      
      addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
      });
            
      setSize(1000,700);
      show();
   }
   
   public static void main(String[] args){
      new Ventana();
   }  
}