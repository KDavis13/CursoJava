package reloj;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;


/*
 * Un reloj que imprime la hora a intervalores regulares
 */
public class Reloj {
		
	private int intervalo;
	private boolean beep;
	
	/*
	 * @param beep: boleano para indicar si debe sonar
	 * @param intervalo: intervalo de actuacion en ms.
	 */
	public Reloj(int intervalo, boolean beep) {
		this.intervalo = intervalo;
		this.beep = beep;
	}

	/*
	 * Iniciar el reloj.
	 */
	public void iniciar() {
		
		ActionListener listener = new ImpresorReloj();
		
		Timer t = new Timer(intervalo, listener);
		
		t.start();
	}

	/*
	 * Clase interna de retrollamada. Sera invocada
	 * segun el intervalo temporal establecido
	 */

	private class ImpresorReloj implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) 
		{
			Date ahora = new Date();
			DateFormat df=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			System.out.println(df.format(ahora));
			if (beep)
				Toolkit.getDefaultToolkit().beep();
		}
	}
}