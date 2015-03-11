package cliente;

import hilos.HiloLectorRed;
import hilos.HiloLectorTeclado;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteChat {

	public ClienteChat() {

		try {
			Socket socket = new Socket("localhost", 35557);
			System.out.println("Conectado al servidor");
			System.out
					.println("Bienvenido al chat, para salir escribe q! y return");

			HiloLectorTeclado lt = 
					new HiloLectorTeclado(socket);
			HiloLectorRed lr = 
					new HiloLectorRed(socket);
			lt.start();
			lr.start();

			try {
				lr.join();
				lt.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			socket.close();
			System.out.println("Programa finalizado");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ClienteChat();
	}
}