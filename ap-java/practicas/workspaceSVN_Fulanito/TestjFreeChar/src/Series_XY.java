import java.awt.image.BufferedImage;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class Series_XY extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private BufferedImage grafica = null;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Series_XY inst = new Series_XY();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public Series_XY() {
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

		XYSeries series = new XYSeries("Evolucion");
		series.add(1, 23);
		series.add(2, 34);
		series.add(3, 51);
		series.add(4, 67);
		series.add(5, 89);
		series.add(6, 121);
		series.add(7, 137);
		XYDataset juegoDatos = new XYSeriesCollection(series);

		JFreeChart chart = ChartFactory.createXYAreaChart(
				"Sesiones a mi pagina web", "Meses", "Sesiones", juegoDatos,
				PlotOrientation.VERTICAL, false, false, true);
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