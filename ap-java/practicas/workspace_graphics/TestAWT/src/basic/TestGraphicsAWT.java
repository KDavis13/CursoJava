package basic;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;

public class TestGraphicsAWT extends Frame {

	
	TestGraphicsAWT() {
		super();
		setSize(400, 300);
		int x = 30;
	}
	public void paint(Graphics g) {
		g.clearRect(0,0,400,300);
		
		g.setColor(Color.green);
		g.fillOval(getX(),30,20,20);
		
		g.setColor(Color.red);
		g.fillRect(100,100,20,30);
		
		g.setColor(Color.black);
		g.drawLine(130,10,200,50);
		
		g.drawRect(220,120,10,10);
		g.drawString("Cadena",100,145);
	}
	public static void main(String[] args) {
		TestGraphicsAWT inst = new TestGraphicsAWT();		
		inst.setLocationRelativeTo(null); // Centrar la ventana		
		inst.setVisible(true); // Hacer la ventana visible
		
		inst.addWindowListener(new WindowAdapter() {
			public void windowclosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
}