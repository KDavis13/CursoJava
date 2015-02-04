package accesosecuencial;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroEscritura {
    private DataOutputStream salida;

    public FicheroEscritura(String nombre) {
        try {
            salida = new DataOutputStream(new FileOutputStream(nombre));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void insertar(Registro reg) {
        try {
            salida.writeUTF(reg.getISBN());
            salida.writeUTF(reg.getTitulo());
            salida.writeUTF(reg.getAutor());
            salida.writeInt(reg.getYear());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            salida.flush();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
