package accesosecuencial;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
    public static void main(String args[]) {
        Registro registro;
        
        FicheroEscritura fichero = new FicheroEscritura("libros.dat");
        
        registro = new Registro("1132-AAA", "el titulo", "el autor", 1997);
        fichero.insertar(registro);
        
        registro = new Registro("77179-BBB", "el otro titulo", "el otro autor", 2002);
        fichero.insertar(registro);
        
        registro = new Registro("0030-SSS", "el nuevo titulo", "el viejo autor", 1970);
        fichero.insertar(registro);
        
        fichero.cerrar();
        
        // fin de la edicion. Pasamos a la lectura
        
        FicheroLectura fichero2 = new FicheroLectura("libros.dat");        
        
        List<Registro> registros=new ArrayList<Registro>();
        while (!fichero2.isEof()) {
        	registros.add(fichero2.leer());
        }        
        
        fichero2.cerrar();
        
        System.out.println("Mostrar todos...");
        
        for (Registro reg:registros)
        	System.out.println(reg);
                
        System.out.println("Buscar uno  cuyo titulo contiene la palabra 'otro'...");
        for (Registro reg:registros) {
        	if (reg.getTitulo().contains("otro")) {
        		System.out.println(reg);
        		break;
        	}	
        }
        	
    }

}
