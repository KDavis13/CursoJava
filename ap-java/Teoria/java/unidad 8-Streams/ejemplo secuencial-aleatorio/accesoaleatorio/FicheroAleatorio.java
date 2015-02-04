package accesoaleatorio;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FicheroAleatorio {
    private RandomAccessFile salida;

    public FicheroAleatorio(String nombre, String modo) {
        try {
            salida = new RandomAccessFile(nombre, modo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crear() {
        try {
            for (int i = 1; i < 51; i++) {
                salida.writeInt(0);
                salida.write(new byte[10]);
                salida.write(new byte[15]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Alumno leer(int numero) {
        int edad = 0;
        String nombre = "", apellido = "";
        try {
            salida.seek((long) (numero - 1) * 33);
            edad = salida.readInt();
            nombre = salida.readUTF();
            apellido = salida.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Alumno(edad, nombre, apellido);
    }

    public void insertar(Alumno alumno, int numero) {
        try {// Calculamos la posición del registro
            salida.seek((numero - 1) * 33);
            salida.writeInt(alumno.getEdad());
            salida.writeUTF(alumno.getNombre());
            salida.writeUTF(alumno.getApellido());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
