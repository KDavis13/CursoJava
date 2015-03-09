import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketException;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class ServidorTCP extends Frame {

	private static final long serialVersionUID = 1L;

	private TextArea entrada;

    private ServerSocket servidor;

    private int clientes;    
    private boolean continuar;
    
    ServidorTCP() {    	
        setTitle("Servidor");
        setSize(350, 400);
        entrada = new TextArea(20, 40);
        entrada.setEditable(false);
        add(entrada);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent evt) {
        		finalizar();
        	}
        });
        clientes = 0;
        continuar=true;
    }

    private void finalizar() {
    	this.continuar=false;
    	try {
			if (!servidor.isClosed())
				servidor.close();
    	}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	}
		System.exit(0);
    }
    
    private void lanzarServidor() {
        try {
            servidor = new ServerSocket(5000, 50);
            while (continuar) {
                new NuevoCliente(servidor.accept(), this, clientes++).start();
            }                    
            
        } catch (SocketException e) {
			    	
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void añadir(String texto) {
        entrada.append(texto);
    }

    public static void main(String[] args) {
        ServidorTCP Servidor = new ServidorTCP();
        Servidor.lanzarServidor();
    }
}
