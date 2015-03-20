import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class PruebaMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaMenu frame = new PruebaMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaMenu() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Barra de menu
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.setBounds(0, 0, 434, 30);
		
		//El menú
		JMenu mClientes = new JMenu();
		mClientes.setText("Cliente");
		barraMenu.add(mClientes);
		
		JMenu miBuscar = new JMenu("Buscar");
		
		JMenu miSalir = new JMenu("Salir");
		miSalir.setAlignmentX(Component.RIGHT_ALIGNMENT);
		miSalir.setHorizontalAlignment(SwingConstants.TRAILING);
		
		miSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado Salir");
			}
		});
		
		barraMenu.add(miSalir);
		
		//Los items del menú
		JMenuItem miNuevo = new JMenuItem("Nuevo");
		
		miNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado Cliente -> Nuevo");
			}
		});
		
		mClientes.add(miNuevo);
		
		JMenuItem miBorrar = new JMenuItem("Borrar");
		mClientes.add(miBorrar);
		
		mClientes.add(miBuscar);
		
		JSeparator sep = new JSeparator();
		mClientes.add(sep);
		
		JMenuItem bdd = new JMenuItem("Base de datos");
		miBuscar.add(bdd);
		
		JMenuItem miOtroOtro = new JMenuItem("Otro");
		miBuscar.add(miOtroOtro);
		
		JMenuItem miOtro = new JMenuItem("Otro");
		mClientes.add(miOtro);
		contentPane.add(barraMenu);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 41, 39, 210);
		contentPane.add(toolBar);
		
		JButton btnNya = new JButton("nya!");
		btnNya.setIcon(new ImageIcon("C:\\Users\\poo\\Desktop\\photo.jpg"));
		toolBar.add(btnNya);
		
	}
}
