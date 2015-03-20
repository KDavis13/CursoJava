import java.awt.image.BufferedImage;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class Barras3D extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private BufferedImage grafica = null;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Barras3D inst = new Barras3D();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public Barras3D() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 400);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public BufferedImage creaImagen() {

		DefaultCategoryDataset ds = new DefaultCategoryDataset();
		ds.setValue(6, "POO", "Antonio");
		ds.setValue(8, "BD-SQL", "Antonio");
		ds.setValue(7, "JEE", "Antonio");
		ds.setValue(9, "POO", "Juan");
		ds.setValue(5, "BD-SQL", "Juan");
		ds.setValue(8, "JEE", "Juan");
		ds.setValue(7, "POO", "Alberto");
		ds.setValue(10, "BD-SQL", "Alberto");
		ds.setValue(6, "JEE", "Alberto");

		JFreeChart chart = ChartFactory.createBarChart3D("Notas Informatica",
				"Estudiantes", "Notas", ds, PlotOrientation.VERTICAL, true,
				true, false);

		BufferedImage image = chart.createBufferedImage(300, 300);
		return image;
	}

	public void paint(java.awt.Graphics g) {
		super.paint(g);

		if (grafica == null) {
			grafica = this.creaImagen();
		}
		g.drawImage(grafica, 30, 30, null);
	}

}
