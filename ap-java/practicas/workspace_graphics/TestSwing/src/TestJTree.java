import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.BoxLayout;
import javax.swing.JTree;

import java.awt.Dimension;
import java.awt.ComponentOrientation;

import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JLabel;


public class TestJTree extends JFrame {
	
	String nomImagen;
	JLabel lblImagen;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestJTree frame = new TestJTree();
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
	public TestJTree() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlEstructura = new JPanel();
		pnlEstructura.setBounds(5, 5, 108, 252);
		contentPane.add(pnlEstructura);
		
		
		//Esto tiene que ir primero
		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Imagenes");
		
		DefaultMutableTreeNode barcos = new DefaultMutableTreeNode("Barcos");
		DefaultMutableTreeNode barco1 = new DefaultMutableTreeNode("barco1");
		DefaultMutableTreeNode barco2 = new DefaultMutableTreeNode("barco2");
		
		DefaultMutableTreeNode coches = new DefaultMutableTreeNode("Coches");
		DefaultMutableTreeNode coche1 = new DefaultMutableTreeNode("coche1");
		DefaultMutableTreeNode coche2 = new DefaultMutableTreeNode("coche2");
		
		DefaultMutableTreeNode motos = new DefaultMutableTreeNode("Motos");
		DefaultMutableTreeNode moto1 = new DefaultMutableTreeNode("moto1");
		DefaultMutableTreeNode moto2 = new DefaultMutableTreeNode("moto2");
		
		raiz.add(barcos);
		barcos.add(barco1);
		barcos.add(barco2);
		
		raiz.add(coches);
		coches.add(coche1);
		coches.add(coche2);
		
		raiz.add(motos);
		motos.add(moto1);
		motos.add(moto2);
		pnlEstructura.setLayout(null);
		
		JTree arbol = new JTree(raiz);//Para que elija la carpeta que tu quieres tiene que ponerle la ruta antes
		
		
		arbol.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				
				TreePath tp = e.getNewLeadSelectionPath();
				
				if(tp.getPathCount() == 3){
					
					/*nomImagen = tp.getLastPathComponent().toString();
					String ruta = tp.getPath()[0].toString() + "/" + tp.getPath()[1].toString() + "/" + tp.getPath()[2].toString() + nomImagen + ".jpg";
					ImageIcon ii = new ImageIcon(ruta);
					lblImagen.setIcon(ii);*/
					
					System.out.println(tp);
					
				}
			}
		});
		
		
		arbol.setBounds(0, 0, 108, 252);
		arbol.setToolTipText("");
		pnlEstructura.add(arbol);
		
		JPanel pnlImagen = new JPanel();
		pnlImagen.setBounds(123, 5, 306, 252);
		contentPane.add(pnlImagen);
		pnlImagen.setLayout(null);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setBounds(10, 11, 286, 230);
		pnlImagen.add(lblImagen);
	}
}
