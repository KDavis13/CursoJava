import java.net.*;
import java.io.*;

/**
 * Clase que crea un socket cliente, establece la conexión y lee los datos del
 * servidor, escribiéndolos en pantalla.
 */
public class SocketCliente {
	
	private Socket socket;
	
	/** Programa principal, crea el socket cliente */
	public static void main(String[] args) {
		new SocketCliente();
	}

	/**
	 * Crea el socket cliente y lee los datos
	 */
	public SocketCliente() {
		try {
			
			socket = new Socket("192.168.20.129", 35557);
			
			/* Se crea el socket cliente */
			 //Ip 192.168.20.129
			System.out.println("conectado");
			
			
			
			//enviarString();
			enviarTodo();
			//recibirCosas();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void enviarTodo(){
		
		try {

			DataOutputStream buffer = new DataOutputStream(
					socket.getOutputStream());
			
			buffer.writeInt(22);
			System.out.println("Enviado 22");
			buffer.writeUTF("Hola");
			System.out.println("Enviado Hola");
			
			Alumno a = new Alumno("Pepito", "Grillo", "46633773J", "Java");
			ObjectOutputStream bufferAlumno = new ObjectOutputStream(
					socket.getOutputStream());

			bufferAlumno.writeObject(a);
			System.out.println("Enviado " + a.toString());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
private void enviarString(){
		
		try {
			DataOutputStream buffer = new DataOutputStream(
					socket.getOutputStream());
			
			buffer.writeUTF("Vengo del cliente");
			System.out.println("Enviado string");
			
		} catch (IOException e) {
			System.out.println("Error al enviar string");
			e.printStackTrace();
		}
	}
	
	private void recibirCosas(){
		
		try {

			DataInputStream buffer = new DataInputStream(
					socket.getInputStream());

			System.out.println("Recibido " + buffer.readInt());
			System.out.println("Recibido " + buffer.readUTF());

			/* Se obtiene un stream de lectura para leer objetos */
			ObjectInputStream bufferAlumnos = new ObjectInputStream(
					socket.getInputStream());

			/*
			 * Se lee un Alumno que nos envía el servidor y se muestra en
			 * pantalla
			 */
			Alumno a = (Alumno) bufferAlumnos.readObject();
			System.out.println("Recibido " + a.toString());
			
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}