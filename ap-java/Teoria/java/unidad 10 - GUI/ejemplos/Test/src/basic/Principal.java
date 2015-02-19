package basic;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Classe nominal (perquè te un nom)
class MiRunnable implements Runnable {
	public void run() {
		try {
			Principal frame = new Principal();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Principal extends JFrame {
	
	private static final long serialVersionUID = 1L;

	// Contenidor de nivell intermedi
	private JPanel contentPane;
	private JLabel etiqueta;
	private JButton btnNewButton;
	
	public static void main(String[] args) {
		Runnable programa = new MiRunnable();
		EventQueue.invokeLater(programa);
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Aplicacion de prueba");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		
		contentPane.setToolTipText("Hola...");
		
		contentPane.setBorder(
				new SoftBevelBorder(BevelBorder.RAISED));
		
		// Li diem al JFrame que ej JPanel és el
		// seu primer contenidor de nivell intermedi
		this.setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		etiqueta = new JLabel("");
		Font fuente = new Font(Font.SANS_SERIF, Font.BOLD, 26);
		etiqueta.setFont(fuente);
		etiqueta.setBackground(Color.WHITE);
		etiqueta.setBounds(55, 41, 326, 86);
		contentPane.add(etiqueta);
		
		btnNewButton = new JButton("Pulsame");
		
		// Li estem dient a la finestra que estem interessats
		// en ser informats de les pulsacions del botó.
		// Concretament volem canviar el text de l'etiqueta
		// quan això passi
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Tu numero: " + getNum());
			}

			private String getNum() {
				int num = (int) (Math.random() * 100) + 1;
				return String.valueOf(num);
			}
		});
		
		btnNewButton.setBounds(289, 177, 135, 50);
		btnNewButton.setMnemonic('p');
		btnNewButton.setToolTipText("Superboton");
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		// Li estem dient a la nostra classe que quan
		// l'usuari faci clic sobre la creu de tancar
		// la finestra es cridi al mètode checkSalida()
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				checkSalida();
			}
		});
		
	}
	
	private void checkSalida() {
		String mensaje = 
				"¿Desea salir de la aplicacion?";
		
	    String titulo = "Ojo!";
	    
	    // display the JOptionPane showConfirmDialog
	    int respuesta = 
	    	JOptionPane.showConfirmDialog(
	    		null, mensaje, titulo, JOptionPane.YES_NO_OPTION);
	    
	    if (respuesta == JOptionPane.YES_OPTION)
	    {
	      System.exit(0);
	    }		
	    
	}
}
