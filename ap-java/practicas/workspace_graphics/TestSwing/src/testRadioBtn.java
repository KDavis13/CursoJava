import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;


public class testRadioBtn extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					
					//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //Este coge el default por el sistema operativo
					
					//for(LookAndFeelInfo information: info){}
					
					testRadioBtn frame = new testRadioBtn();
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
	public testRadioBtn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panelRadios = new JPanel();
		contentPane.add(panelRadios);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		panelRadios.add(rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		panelRadios.add(rdbtnMujer);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnHombre);
		btnGroup.add(rdbtnMujer);
		
		JComboBox<String> preferencias = new JComboBox<String>();
		panelRadios.add(preferencias);
		preferencias.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccione....", "Item 1", "Item 2", "Item 3", "Item4"}));
		
		JPanel panelComboBox = new JPanel();
		contentPane.add(panelComboBox);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prefs = (String) preferencias.getSelectedItem();
				
				if(prefs.equals("Seleccione...")){
					System.out.println("No has selecionado nada");
				}else {
					System.out.println(prefs);
				}
			}
		});
		panelComboBox.add(btnSiguiente);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setName("Tabla");
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Java", "PUE"},
				{"2", ".NET", "CIFO"},
			},
			new String[] {
				"C\u00F3digo", "Curso", "Centro"
			}
		));
	}
}
