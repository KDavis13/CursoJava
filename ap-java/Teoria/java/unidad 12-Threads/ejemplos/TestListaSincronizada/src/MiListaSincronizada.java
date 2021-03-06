import java.util.LinkedList;
import java.util.List;

public class MiListaSincronizada {
	
   private List<Integer> lista = new LinkedList<Integer>();

   public synchronized boolean addDato(Integer dato) {
      if (lista.size()==0) {
         System.out.println("A�adiendo a la lista..."+dato);
         lista.add(dato);
         System.out.println("Dato a�adido...informo al consumidor");
         this.notify();
         return true;
      }
      return false;
   }

   public synchronized Integer getDato() throws InterruptedException {
      
      if (lista.size() == 0) {
        System.out.println("Lista vacia...SUELTO EL MONITOR");
        this.wait();
      }
      
      Integer dato = lista.get(0);
      System.out.println("leyendo de la lista..." + dato);
      lista.remove(0);
      return dato;
   }
}
