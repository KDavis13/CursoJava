package Utils;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroSortida {
	
	private static DataOutputStream salida;
	
	public static void FicheroEscritura(String nombre) {
        try {
            salida = new DataOutputStream(new FileOutputStream(nombre));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void insertar(String string) {
        try {
            salida.writeUTF(string);
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
    
    public FicheroSortida(String nombre){
    	FicheroEscritura(nombre);
    }

}
