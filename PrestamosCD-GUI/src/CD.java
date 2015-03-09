import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Vector;


public class CD extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Vector<myCDBean> CDs;
	private JPanel contentPane;
	private JTextField jtfTitulo;
	private JTextField jtfAutor;
	private JTextField jtfGenero;
	private JTextArea jtaPrestamo;
	private BuscarReg dlgBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CD frame = new CD();
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
	public CD() {
		
		CDs = new Vector<myCDBean>();
		setResizable(false);
		setTitle("Cds prestados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu jmnuArchivo = new JMenu("Archivo");
		menuBar.add(jmnuArchivo);
		
		JMenuItem jmItemanadirReg = new JMenuItem("A\u00F1adir Registro");
		jmnuArchivo.add(jmItemanadirReg);
		jmItemanadirReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmItemAnadirRegActionPerformed(e);
				
				
			}
		});
		
		JMenuItem jmItemBuscarReg = new JMenuItem("Buscar Registro");
		jmnuArchivo.add(jmItemBuscarReg);
		jmItemBuscarReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmItemBuscarRegActionPErformed(e);				
			}
		});
		
		
		JSeparator separator = new JSeparator();
		jmnuArchivo.add(separator);
		addWindowListener(new WindowAdapter(){
	    	  public void windowClosing(WindowEvent i){
//	    		  int respuesta = JOptionPane.showConfirmDialog(null,
//							"¿Realmente desea salir?",
//							"Atención",
//							JOptionPane.YES_NO_OPTION);
//
//							if (respuesta != JOptionPane.YES_OPTION) {
//								return;
//							}
//							System.exit(0);
	    		  thisWindowClosing();
	    	  }


	      });
		JMenuItem jmItemSalir = new JMenuItem("Salir");
		jmItemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int respuesta = JOptionPane.showConfirmDialog(null,
//						"¿Realmente desea salir?",
//						"Atención",
//						JOptionPane.YES_NO_OPTION);
//
//						if (respuesta != JOptionPane.YES_OPTION) {
//							return;
//						}
//						System.exit(0);
				thisWindowClosing();

			}
		});
		jmnuArchivo.add(jmItemSalir);
		
		JLabel jlbTitulo = new JLabel("Titulo");
		jlbTitulo.setBounds(20, 20, 50, 14);
		contentPane.add(jlbTitulo);
		
		JLabel jlbAutor = new JLabel("Autor");
		jlbAutor.setBounds(20, 60, 50, 14);
		contentPane.add(jlbAutor);
		
		JLabel jlbGenero = new JLabel("Genero");
		jlbGenero.setBounds(20, 100, 50, 14);
		contentPane.add(jlbGenero);
		
		JLabel jlbPrestamo = new JLabel("Prestamo");
		jlbPrestamo.setBounds(20, 140, 100, 14);
		contentPane.add(jlbPrestamo);
		
		JLabel jlbCreditos = new JLabel("copyright 2009 - SoftCIF");
		jlbCreditos.setBounds(2, 255, 392, 14);
		contentPane.add(jlbCreditos);
		
		jtfTitulo = new JTextField();
		jtfTitulo.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				jtfFocusGained(evt);
			}
		});
		jtfTitulo.setBounds(100, 17, 275, 21);
		contentPane.add(jtfTitulo);
		jtfTitulo.setColumns(10);
		
		jtfAutor = new JTextField();
		jtfAutor.setBounds(100, 57, 275, 21);
		contentPane.add(jtfAutor);
		jtfAutor.setColumns(10);
		
		jtfGenero = new JTextField();
		jtfGenero.setBounds(100, 97, 275, 21);
		contentPane.add(jtfGenero);
		jtfGenero.setColumns(10);
		
		jtaPrestamo = new JTextArea();
		jtaPrestamo.setLineWrap(true);
		jtaPrestamo.setBounds(100, 137, 275, 70);
		contentPane.add(jtaPrestamo);
	}
	
	protected void jmItemBuscarRegActionPErformed(ActionEvent e) {
		dlgBuscar = new BuscarReg(this);
		dlgBuscar.setVisible(true);

		
	}

	private void jtfFocusGained(FocusEvent evt) {
javax.swing.text.JTextComponent jtb=null;
		
		jtb=(javax.swing.text.JTextComponent)evt.getSource();		
		jtb.selectAll();
	}

	public Vector<myCDBean> getCDs() {
		return CDs;
	}

	private void jmItemAnadirRegActionPerformed(ActionEvent evt) {
		System.out.println("jmItemAnadirReg.actionPerformed, event="+evt);
String titulo=null, autor=null, genero=null, descripcion=null;
		
		titulo=jtfTitulo.getText().toString();
		
		// Comprobamos que el titulo no sea nulo
		if (titulo.compareTo("")==0) {
			JOptionPane.showMessageDialog(null, "El campo titulo no puede estar vacio");
			return;
		}	
		
		autor=jtfAutor.getText().toString();
		genero=jtfGenero.getText().toString();
		descripcion=jtaPrestamo.getText().toString();
		
		CDs.add(new myCDBean(titulo,autor,genero,descripcion));
		if (dlgBuscar!=null && dlgBuscar.isVisible()){
			dlgBuscar.actualizarLista();
		}
		
	}
	public void setRegDatos(int i) {
		myCDBean cd=CDs.get(i);
		jtfTitulo.setText(cd.getTitulo());
		jtfAutor.setText(cd.getAutor());
		jtfGenero.setText(cd.getGenero());
		jtaPrestamo.setText(cd.getPrestamo());
	}
	
	private void thisWindowClosing() {
		int respuesta = JOptionPane.showConfirmDialog(null,
				"¿Realmente desea salir?",
				"Atención",
				JOptionPane.YES_NO_OPTION);

				if (respuesta != JOptionPane.YES_OPTION) {
					return;
				}
				System.exit(0);
		
	}
}
