import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
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
public class ClienteTCP extends Frame implements ActionListener {

    private static final long serialVersionUID = 5874146874744364803L;

    private Socket conexion;

    private DataOutputStream salida;

    private DataInputStream entrada;

    // Interfaz Usuario
    private TextField textoEntrada, textoSalida;

    private Button enviar, conectar, desconectar;

    private Panel panel;

    ClienteTCP(String nombre) {
        super(nombre);
        setSize(350, 200);
        panel = new Panel();
        textoSalida = new TextField(40);
        textoEntrada = new TextField(40);
        textoEntrada.setText("Pulsa el boton \"Conectar\" para conectarte");
        textoEntrada.setEditable(false);
        enviar = new Button("Enviar");
        enviar.setEnabled(false);
        conectar = new Button("Conectar");
        desconectar = new Button("Desconectar");
        desconectar.setEnabled(false);
        panel.add(new Label("Datos a enviar"));
        panel.add(textoSalida);
        panel.add(new Label("Datos recibidos"));
        panel.add(textoEntrada);
        panel.add(enviar);
        panel.add(conectar);
        panel.add(desconectar);

        enviar.addActionListener((ActionListener) this);
        conectar.addActionListener(this);
        desconectar.addActionListener(this);
        add(panel);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent evt) {
        		try {
					salida.writeUTF("Salir");
					conexion.close();
        		} catch (SocketException e) {
        		} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}                
                System.exit(0);
        	}
        });
    }

    public void actionPerformed(ActionEvent e) {
        String com = e.getActionCommand();
        if (com.equals("Enviar")) {
            try {
                textoEntrada.setText("");
                salida.writeUTF(textoSalida.getText());
                textoEntrada.setText(entrada.readUTF());
                textoSalida.setText("");
            } catch (IOException io) {
                io.printStackTrace();
            }
        } else if (com.equals("Conectar")) {
            try {
                conexion = new Socket(InetAddress.getLocalHost(), 5000);
                salida = new DataOutputStream(conexion.getOutputStream());
                entrada = new DataInputStream(conexion.getInputStream());
                conectar.setEnabled(false);
                desconectar.setEnabled(true);
                enviar.setEnabled(true);
                textoEntrada.setText("");
            } catch (IOException io) {
                io.printStackTrace();
            }
        } else if (com.equals("Desconectar")) {
            try {
                salida.writeUTF("Salir");
                conexion.close();
                //entrada=null;
                //salida=null;
                //conexion.shutdownInput();
                //conexion.shutdownOutput();
                conectar.setEnabled(true);
                desconectar.setEnabled(false);
                enviar.setEnabled(false);
                textoEntrada.setText("Pulsa el boton Conectar para conectarte");
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        new ClienteTCP("Cliente");
    }
}
