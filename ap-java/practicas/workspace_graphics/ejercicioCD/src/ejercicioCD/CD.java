package ejercicioCD;

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

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Collections;
import java.util.Vector;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CD extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Vector<CDBean> CDs;

	private JPanel contentPane;
	private JTextField jtfTitulo;
	private JTextField jtfAutor;
	private JTextField jtfGenero;
	private JTextArea jtaPrestamo;

	BuscarReg dlgBuscar;

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

	public BuscarReg getDlgBuscar() {
		return dlgBuscar;
	}

	/**
	 * Create the frame.
	 */
	public CD() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				salirForm();
			}
		});
		
		
		

		CDs = new Vector<CDBean>();

		setResizable(false);
		setTitle("CD's prestados");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuSuperior = new JMenuBar();
		menuSuperior.setBounds(0, 0, 444, 27);
		contentPane.add(menuSuperior);

		JMenu jmnuArchivo = new JMenu("Archivo");
		jmnuArchivo.setMnemonic('a');
		menuSuperior.add(jmnuArchivo);

		JMenuItem jmItemAnadirReg = new JMenuItem("A\u00F1adir registro");
		jmItemAnadirReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jmItemAnadirRegActionPerformed(evt);
			}

			private void jmItemAnadirRegActionPerformed(ActionEvent evt) {
				String titulo, autor, genero, descripcion;

				titulo = jtfTitulo.getText().toString();

				// Comprobamos que el titulo no sea nulo
				if (titulo.compareTo("") == 0) {
					JOptionPane.showMessageDialog(null, "El campo titulo no puede estar vacio");
					return;
				}

				autor = jtfAutor.getText().toString();
				genero = jtfGenero.getText().toString();
				descripcion = jtaPrestamo.getText().toString();
					
				CDBean cd = new CDBean(titulo, autor, genero, descripcion);
				CDs.add(cd);
				Collections.sort(CDs);
				
				if (dlgBuscar!=null && dlgBuscar.isVisible())
					dlgBuscar.actualizarLista();
			}
		});
		jmnuArchivo.add(jmItemAnadirReg);

		JMenuItem jmItemBuscarReg = new JMenuItem("Buscar registro");
		jmItemBuscarReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlgBuscar = new BuscarReg(); // Aquí faltaba un this
				dlgBuscar.setVisible(true);
			}
		});
		jmnuArchivo.add(jmItemBuscarReg);

		JSeparator separator = new JSeparator();
		jmnuArchivo.add(separator);

		JMenuItem jmItemSalir = new JMenuItem("Salir");
		jmItemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salirForm();
			}
		});
		jmnuArchivo.add(jmItemSalir);

		JPanel pnlNuevo = new JPanel();
		pnlNuevo.setBounds(10, 38, 424, 223);
		contentPane.add(pnlNuevo);
		pnlNuevo.setLayout(null);

		JLabel jlbTitulo = new JLabel("T\u00EDtulo");
		jlbTitulo.setFont(new Font("Arial", Font.BOLD, 12));
		jlbTitulo.setBounds(10, 11, 81, 15);
		pnlNuevo.add(jlbTitulo);

		JLabel jlbAutor = new JLabel("Autor");
		jlbAutor.setFont(new Font("Arial", Font.BOLD, 12));
		jlbAutor.setBounds(10, 37, 81, 14);
		pnlNuevo.add(jlbAutor);

		JLabel jlbGenero = new JLabel("G\u00E9nero");
		jlbGenero.setFont(new Font("Arial", Font.BOLD, 12));
		jlbGenero.setBounds(10, 62, 81, 14);
		pnlNuevo.add(jlbGenero);

		JLabel jlbPrestamo = new JLabel("Pr\u00E9stamo");
		jlbPrestamo.setFont(new Font("Arial", Font.BOLD, 12));
		jlbPrestamo.setBounds(10, 87, 81, 14);
		pnlNuevo.add(jlbPrestamo);

		JLabel jlbCreditos = new JLabel("copyright 2009 - SoftCIF");
		jlbCreditos.setBounds(0, 209, 414, 14);
		pnlNuevo.add(jlbCreditos);

		jtfTitulo = new JTextField();
		jtfTitulo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent evt) {
				jtfFocusGained(evt);
			}

		});
		jtfTitulo.setBounds(100, 9, 300, 20);
		pnlNuevo.add(jtfTitulo);
		jtfTitulo.setColumns(10);

		jtfAutor = new JTextField();
		jtfAutor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent evt) {
				jtfFocusGained(evt);
			}
		});
		jtfAutor.setBounds(100, 35, 300, 20);
		pnlNuevo.add(jtfAutor);
		jtfAutor.setColumns(10);

		jtfGenero = new JTextField();
		jtfGenero.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent evt) {
				jtfFocusGained(evt);
			}
		});
		jtfGenero.setBounds(101, 60, 300, 20);
		pnlNuevo.add(jtfGenero);
		jtfGenero.setColumns(10);

		jtaPrestamo = new JTextArea();
		jtaPrestamo.setBounds(101, 87, 300, 100);
		pnlNuevo.add(jtaPrestamo);
	}

	// Método para el focus
	private void jtfFocusGained(FocusEvent evt) {
		// System.out.println("titulo.focusGained, event="+evt);
		// jtfTitulo.selectAll();
		javax.swing.text.JTextComponent jtb = null;

		jtb = (javax.swing.text.JTextComponent) evt.getSource();
		jtb.selectAll();
	}

	// Método para recuperar el Vector
	public Vector<CDBean> getCDs() {
		return CDs;
	}

	// Método que recupera un CD del vector
	public void setRegDatos(int i) {
		CDBean cd = CDs.get(i);
		jtfTitulo.setText(cd.getTitulo());
		jtfAutor.setText(cd.getAutor());
		jtfGenero.setText(cd.getGenero());
		jtaPrestamo.setText(cd.getPrestamo());
	}

	private void salirForm() {
		int respuesta = JOptionPane.showConfirmDialog(null,
		"Esta acción cerrará la aplicación, ¿desea continuar?",
		"Atención",
		JOptionPane.YES_NO_OPTION);

		if (respuesta != JOptionPane.YES_OPTION) {
			return;
		}
		System.exit(0);
	}
}
