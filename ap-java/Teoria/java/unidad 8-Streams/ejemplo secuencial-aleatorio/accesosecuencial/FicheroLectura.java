package accesosecuencial;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class FicheroLectura {
    private DataInputStream ent;

    private boolean fin;

    public FicheroLectura(String nombre) {
        fin = false;
        try {
            ent = new DataInputStream(new FileInputStream(nombre));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isEof() {
        return fin;
    }

    public Registro leer() {
        Registro reg = null;
        try {
            reg = new Registro(ent.readUTF(), ent.readUTF(), ent.readUTF(), ent
                    .readInt());
        } catch (EOFException eof) {
            fin = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reg;
    }

    public void cerrar() {
        try {
            ent.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
