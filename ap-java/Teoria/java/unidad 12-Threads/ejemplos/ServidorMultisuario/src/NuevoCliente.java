import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

public class NuevoCliente extends Thread {
	private Socket conexion;

	private ServidorTCP servidor;

	private int numero;

	private DataInputStream entrada;

	private DataOutputStream salida;

	NuevoCliente(Socket conexion, ServidorTCP servidor, int numero) {
		this.conexion = conexion;
		this.servidor = servidor;
		this.numero = numero;
		try {
			entrada = new DataInputStream(conexion.getInputStream());
			salida = new DataOutputStream(conexion.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * El método run() será el encargado de gestionar al nuevo cliente
	 */
	public void run() {
		boolean salir = false;
		servidor.añadir("Cliente " + numero + " se ha conectado\n");
		String cadena = null;
		while (!salir) {
			try {
				cadena = entrada.readUTF();
				if (cadena.equals("Salir")) {
					salir = true;
				} else {
					servidor.añadir("El cliente " + numero + " ha enviado:\n"
							+ "       " + cadena + '\n');
					
					grabar(cadena);
					salida.writeUTF("Información recibida");
				}
			} catch (EOFException e) {
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		servidor.añadir("Se ha ido el cliente " + numero + "\n");
		try {
			conexion.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void grabar(String info) {

		BufferedWriter out = null;

		try {
			out = new BufferedWriter(
					new FileWriter("info-recibida.txt", true));
			out.write('\r');
			out.write('\n');
			out.write(info);
			out.close();
		} catch (IOException e) {
		}

	}
}
