package reloj;
import javax.swing.*;

public class TestReloj {
	public static void main(String[] args) {
		// El reloj actua cada segundo (1000 ms)
		// true: hacer un beep
		Reloj reloj = new Reloj(1000, true);
		reloj.iniciar();

		// Mantener el programa en ejecucion hasta
		// que el usuario pulse el boton "Ok"
		JOptionPane.showMessageDialog(null, "�Salir del programa?");
		System.exit(0);
	}
}

