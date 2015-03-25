package ejercicioCD;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.Rectangle;
import java.util.Vector;

public class BuscarReg extends JDialog {

	private static final long serialVersionUID = 1L;

	private final JPanel contentPanel = new JPanel();
	CD ventanaPadre;
	JList jlsListaCDs/* = new JList(ventanaPadre.getCDs())*/;

	public static void main(String[] args) {
		try {
			BuscarReg dialog = new BuscarReg();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BuscarReg() {
		setTitle("Buscar Registro");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(286, 0, 158, 138);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JButton jbtBorrar = new JButton("Borrar");
			jbtBorrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i = jlsListaCDs.getSelectedIndex();
					if (i >= 0) {
						ventanaPadre.getCDs().remove(i);
						actualizarLista();
					}
				}
			});
			jbtBorrar.setBounds(10, 79, 130, 23);
			contentPanel.add(jbtBorrar);
		}
		{
			JButton jbtCancelar = new JButton("Cancelar");
			jbtCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cerrar();
				}
			});
			jbtCancelar.setBounds(10, 45, 130, 23);
			contentPanel.add(jbtCancelar);
		}

		JButton jbtAceptar = new JButton("Aceptar");
		jbtAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = jlsListaCDs.getSelectedIndex();
				if (i >= 0)
					ventanaPadre.setRegDatos(i);
			}
		});
		jbtAceptar.setMnemonic('A');
		jbtAceptar.setBounds(10, 11, 130, 23);
		contentPanel.add(jbtAceptar);

		getRootPane().setDefaultButton(jbtAceptar);

		// JList jlsListaCDs = new JList();

		JScrollPane jScrollPane1 = new JScrollPane();
		jScrollPane1 = new JScrollPane();
		getContentPane().add(jScrollPane1);
		jScrollPane1.setBounds(17, 21, 247, 220);
		{
			jlsListaCDs = new JList(ventanaPadre.getCDs());
			jScrollPane1.setViewportView(jlsListaCDs);
		}

	}

	public BuscarReg(JFrame frame) {
		super(frame);
		initGUI();
		ventanaPadre = (CD) frame;
		//jlsListaCDs.setListData(ventanaPadre.getCDs());
	}

	// M�todo apra cerrar el pu�etero JDialog ��
	private void cerrar() {
		this.setVisible(false);
		this.dispose();

	}

	// m�todo apra actualizar la lista
	public void actualizarLista() {
		jlsListaCDs.setListData(ventanaPadre.getCDs());

	}

	private void initGUI() {
		try {
			//setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}