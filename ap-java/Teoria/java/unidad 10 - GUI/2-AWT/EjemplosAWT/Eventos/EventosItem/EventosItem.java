import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;



class EventosItem extends Frame{
   private Checkbox cbox = new Checkbox("Seleccionar");
   private Choice choice = new Choice();
   private List lista = new List();
   private Button b = new Button("Informacion");
   private HashMap hm = new HashMap();
   
   
   class ManipulaMouseEvent implements MouseListener{
      public void mousePressed(MouseEvent e){
         System.out.println(hm);
      }
      public void mouseReleased(MouseEvent e){}
      public void mouseClicked(MouseEvent e) {}
      public void mouseEntered(MouseEvent e) {}
      public void mouseExited(MouseEvent e) {}
   }

   class ManipulaItemEvent implements ItemListener{
      
      public void itemStateChanged(ItemEvent e){     
         if (e.getSource() instanceof Checkbox){
            hm.remove("Seleccionar");
            if (e.getStateChange() == ItemEvent.SELECTED)
               hm.put("Seleccionado","SI");
            else
               hm.put("Seleccionado","NO");
         }

         if (e.getSource() instanceof List){
            hm.remove("Pais");
            hm.remove("Ciudad");
            String pais = lista.getSelectedItem();
            hm.put("Pais",pais);
            
            if (pais.compareTo("Francia")==0){
               choice.removeAll();
               choice.add("Paris");
               choice.add("Niza");
               choice.add("Monaco");
            }
            else{
               choice.removeAll();
               choice.add("Londres");
               choice.add("Oxford");
               choice.add("Cambridge");
            }
            
         }
         
         if (e.getSource() instanceof Choice){
            hm.remove("Ciudad");
            String ciudad = (String)e.getItem();
            hm.put("Ciudad",ciudad);
         }
         
               
               
      }
   }
   
   
   EventosItem(){
      
      lista.setMultipleMode(false);
      
      hm.put("Seleccionar","");
      hm.put("Pais","");
      hm.put("Ciudad","");
      
      lista.add("Francia");
      lista.add("Inglaterra");
      
      choice.add("             ");
      
      cbox.addItemListener(new ManipulaItemEvent());
      choice.addItemListener(new ManipulaItemEvent());
      lista.addItemListener(new ManipulaItemEvent());
      b.addMouseListener(new ManipulaMouseEvent());
      
      setLayout(new FlowLayout());
      
      
      add(cbox);
      add(lista);
      add(choice);
      add(b);  
   }
   
   public static void main(String[] args){
      EventosItem ei = new EventosItem();
      ei.setSize(200,400);
      ei.show();
   }
}