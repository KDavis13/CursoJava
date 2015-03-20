package Layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

class EjFlowLayout extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EjFlowLayout() {

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				;
			}
		});

		//setLayout(new FlowLayout());
		
		setLayout( new BorderLayout());

		Button b1 = new Button("A");
		Button b2 = new Button("B");
		Button b3 = new Button("Botón más largo");
		Button b4 = new Button("D");
		Button b5 = new Button("E");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();

		p1.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.ORANGE);
		p3.setBackground(Color.CYAN);
		p4.setBackground(Color.BLACK);
		p5.setBackground(Color.GREEN);

		p1.setLayout(new FlowLayout());
		p5.setLayout(new FlowLayout());

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.WEST);
		add(p3, BorderLayout.EAST);
		add(p4, BorderLayout.CENTER);
		add(p5, BorderLayout.SOUTH);
		
		p1.add(b1);
		p1.add(b2);
		p4.add(b3);
		p5.add(b4);
		p5.add(b5);
	}

	public static void main(String[] args) {
		EjFlowLayout v = new EjFlowLayout();
		
		ImageIcon imagen = new ImageIcon("imagen/icono.png");
		
		v.setIconImage(imagen.getImage());
		
		v.setSize(300, 300);
		v.show();
	}
}