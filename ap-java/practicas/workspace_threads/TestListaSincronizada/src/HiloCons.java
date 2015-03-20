public class HiloCons extends Thread {

   private boolean continuar=true;
   private MiListaSincronizada listaSincronizada;
   private int[] valores=new int[5];
   private int contador=0;

   public HiloCons(MiListaSincronizada lista) {
      listaSincronizada=lista;
   }
   public void setContinuar(boolean continuar) {
      this.continuar = continuar;
   }

   public void run() {
      while (continuar) {
         try {
            valores[contador++]=listaSincronizada.getDato();
            sleep((int) (Math.random() * 3000));
         } catch (InterruptedException e) {
           System.out.println("Salida controlada");
         }
      }
      System.out.println("Nada que consumir!");
      System.out.println("Valores consumidos:");
      for (Integer i:valores)
         System.out.print(i+" ");
   }
}