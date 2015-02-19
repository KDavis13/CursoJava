import java.awt.*;

class EjemploGraphics extends Frame{
   private int diametro=20;
   private int x;
   private int y;  
   private int velx;
   private int vely;
   private long tiempo;      
   private int xmax;
   private int ymax;

   private Lienzo sup;
   
   class Lienzo extends Panel{
      Lienzo(){
         super();
      }
         
      public void paint(Graphics g){
         
         g.setColor(Color.red);
         g.fillOval(x,y,diametro,diametro);
      }
         
      public void desplaza(){
            
         if ((x >= (xmax-3*diametro)) || (x <= diametro))
            velx = -velx;
          
         if ((y >= (ymax-3*diametro)) || (y <= diametro))
            vely = -vely;
          
         x = x+(int)(velx*((float)tiempo/1000));
         y = y+(int)(vely*((float)tiempo/1000));
          
      }            

   }

   class Hilo extends Thread{
      public void run(){
         while (true){

            
            try {
               sleep(tiempo);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            sup.repaint();
            sup.desplaza();
         }       
      }
   }      
   
   EjemploGraphics(int cx, int cy, int vx, int vy, long t, int mx, int my){
      
      x = cx;
      y = cy;
      velx = vx;
      vely = vy;
      tiempo = t;
      xmax = mx;
      ymax = my;

      sup = new Lienzo();
      
      new Hilo().start();
      
      sup.setSize(ymax,xmax);
      
      setSize(ymax,xmax);
      
      add(sup);
      
   }
   
   public static void main(String[] args){
      long tiempo=100;
      
      EjemploGraphics eg = new EjemploGraphics(100,100,50,25,tiempo,500,500);
      
      eg.setSize(500,500);
      eg.show();      
   }
}
      
      
      
      
   