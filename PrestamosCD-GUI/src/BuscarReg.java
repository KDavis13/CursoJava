import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;


public class BuscarReg extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CD ventanaPadre;
	
	JList jlsListaCDs = new JList();
	
	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public BuscarReg(JFrame frame) {
		super(frame);
		ventanaPadre=(CD)frame;
		jlsListaCDs.setListData(ventanaPadre.getCDs());
		initGUI();
	}

	private void initGUI() {
		setTitle("Buscar Registro");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton jbtAceptar = new JButton("Aceptar");
		jbtAceptar.setMnemonic('A');
		jbtAceptar.setBounds(285, 21, 90, 26);
		contentPanel.add(jbtAceptar);
		jbtAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			jbtAceptarActionPerformed(e);

				
			}
			});
		
		
		JButton jbtCancelar = new JButton("Cancelar");
		jbtCancelar.setMnemonic('B');
		jbtCancelar.setBounds(285, 58, 90, 26);
		contentPanel.add(jbtCancelar);
		jbtCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			jbtCancelarActionPerformed(e);
				
			}
			});
		
		JButton jbtBorrar = new JButton("Borrar");
		jbtBorrar.setMnemonic('C');
		jbtBorrar.setBounds(285, 95, 90, 26);
		contentPanel.add(jbtBorrar);
		jbtBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			jbtBorrarActionPerformed(e);
				
			}
			});
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		getRootPane().setDefaultButton(jbtAceptar);
		
		JScrollPane jScrollPane1 = new JScrollPane();
		jScrollPane1.setBounds(17, 21, 247, 220);
		contentPanel.add(jScrollPane1);
		
		
		jScrollPane1.setViewportView(jlsListaCDs);
		
		JButton jbtBorrarTodo = new JButton("Borrar Todo");
		jbtBorrarTodo.setBounds(285, 135, 90, 26);
		contentPanel.add(jbtBorrarTodo);
		jbtBorrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			jbtBorrarTodoActionPerformed(e);
				
			}

		});
		
	}
	private void jbtAceptarActionPerformed(ActionEvent e) {
		int i=jlsListaCDs.getSelectedIndex();
		if (i>=0){
			ventanaPadre.setRegDatos(i);

		}
	}
	private void jbtCancelarActionPerformed(ActionEvent e) {
		this.setVisible(false);
		this.dispose();
	}
	public void actualizarLista() {
		jlsListaCDs.setListData(ventanaPadre.getCDs());
	}
	private void jbtBorrarActionPerformed(ActionEvent e) {
		int i=jlsListaCDs.getSelectedIndex();
		if (i>=0) {
			ventanaPadre.getCDs().remove(i);
			this.actualizarLista();
		}
		
	}
	private void jbtBorrarTodoActionPerformed(ActionEvent e) {
		
		
			ventanaPadre.getCDs().removeAllElements();
			this.actualizarLista();
		
	
	}
}
