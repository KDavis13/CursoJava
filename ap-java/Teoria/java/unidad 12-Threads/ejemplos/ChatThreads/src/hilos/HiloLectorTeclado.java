package hilos;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class HiloLectorTeclado extends Thread {

	private DataOutputStream bufferSalida;

	public HiloLectorTeclado(Socket socket) throws IOException {
		bufferSalida = new DataOutputStream(socket.getOutputStream());
	}

	public void run() {
		boolean continuar = true;
		while (continuar) {

			Scanner finalizar = new Scanner(System.in);
			String datos = finalizar.nextLine();

			if (datos.equals("q!")) {
				continuar = false;
				System.out
						.println("Solicitando cierre de conexion al otro extremo...");
			}

			if (datos.length() > 0) {
				try {
					bufferSalida.writeUTF(datos);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
