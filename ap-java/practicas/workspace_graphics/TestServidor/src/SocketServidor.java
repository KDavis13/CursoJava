/*
 * 
 * Ejemplo de un socket servidor mínimo en java.
 * 
 */

import java.net.*;
import java.io.*;

/**
 * Clase principal que instancia un socket servidor, acepta una conexión de un
 * cliente y le envían datos básicos y un objeto.
 */
public class SocketServidor {
	
	private ServerSocket socket;
	private Socket cliente;
	
	public static void main(String[] args) {
		// Se instancia la clase principal para que haga todo lo que tiene
		// que hacer el ejemplo
		new SocketServidor();
	}

	/**
	 * Constructor por defecto. Hace todo lo que necesita el ejemplo.
	 */
	public SocketServidor() {
		try {
			// Se crea un socket servidor atendiendo a un determinado puerto.
			// Por ejemplo, el 35557.
			socket = new ServerSocket(35557);

			// Se acepta una conexión con un cliente. Esta llamada se queda
			// bloqueada hasta que se arranque el cliente.
			System.out.println("Esperando cliente");
			cliente = socket.accept();
			
			
			System.out.println("Conectado con cliente de " + cliente.getInetAddress());
			
			cliente.setSoLinger(true, 10);
			
			//leerMensaje();
			leerTodo();
			//enviarTodo();
			
			
			
			cliente.close();

			
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void leerMensaje(){
		try {
			DataInputStream buffer = new DataInputStream(
					cliente.getInputStream());
			
			//System.out.println("Recibido " + buffer.readInt());
			System.out.println("Recibido " + buffer.readUTF());
			
			/*ObjectInputStream bufferAlumnos = new ObjectInputStream(
					cliente.getInputStream());
			
			Alumno a = (Alumno) bufferAlumnos.readObject();
			System.out.println("Recibido " + a.toString());*/
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void leerTodo(){
		try {
			DataInputStream buffer = new DataInputStream(
					cliente.getInputStream());
			
			System.out.println("Recibido " + buffer.readInt());
			System.out.println("Recibido " + buffer.readUTF());
			
			ObjectInputStream bufferAlumnos = new ObjectInputStream(
					cliente.getInputStream());
			
			Alumno a = (Alumno) bufferAlumnos.readObject();
			System.out.println("Recibido " + a.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void enviarTodo(){
		

		try {

			DataOutputStream buffer = new DataOutputStream(
					cliente.getOutputStream());
			
			buffer.writeInt(22);
			System.out.println("Enviado 22");
			buffer.writeUTF("Hola");
			System.out.println("Enviado Hola");
			
			Alumno a = new Alumno("Pepito", "Grillo", "46633773J", "Java");
			ObjectOutputStream bufferAlumno = new ObjectOutputStream(
					cliente.getOutputStream());

			bufferAlumno.writeObject(a);
			System.out.println("Enviado " + a.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}