package systemProperties;

public class SystemPropertiesDemo {

	public static void main(String[] args) {
		
		String aux;
		
		aux = System.getProperty("file.separator");		
		muestra("Separador de directorios: " + aux);
		
		aux = System.getProperty("java.class.path");		
		muestra("Ruta de busqueda de clases java: " + aux);
		
		aux = System.getProperty("java.home");		
		muestra("Ruta JRE: " + aux);
		
		aux = System.getProperty("line.separator");		
		
		String lineSep = aux.length() == 1 ? "unix" : "windows";
		muestra("Salto de línea en ficheros: " + lineSep);
		
		aux = System.getProperty("path.separator");
		muestra("Separador variable entorno path: " + aux);
		
		aux = System.getProperty("user.dir");
		muestra("Directorio del usuario: " + aux);
		
		aux = System.getProperty("user.home");
		muestra("Directorio de inicio: " + aux);
	}

	private static void muestra(String aux) {
		System.out.println(aux);		
	}

}
