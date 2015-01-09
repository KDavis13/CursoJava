
public class Principal {
	
	static String nombre1 = "Libro Uno";
	static String autor1 = "Pepe";
	static String editorial1 = "editorial X";
	static String anyo1 = "1985";
	static String cantidadEjemplares1 = "4";
	static float coste1 = 9.4f;
	static String isbn1 = "456D4554F455";
	
	static String nombre2 = "Libro Dos";
	static String autor2 = "Paco";
	static String editorial2 = "editorial Y";
	static String anyo2 = "1547";
	static String cantidadEjemplares2 = "2";
	static float coste2 = 65.4f;
	static String isbn2 = "916D4554F474";
	
	static String nombre3 = "Libro Tres";
	static String autor3 = "Juan";
	static String editorial3 = "editorial Z";
	static String anyo3 = "1996";
	static String cantidadEjemplares3 = "12";
	static float coste3 = 23.1f;
	static String isbn3 = "336D4614F955";

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Instancia el Libro 1 y setea sus variables.
		
		Libro l1 = new Libro();
		
		l1.setNombre(nombre1);
		l1.setAutor(autor1);
		l1.setEditorial(editorial1);
		l1.setAnyo(anyo1);
		l1.setCantidadEjemplares(cantidadEjemplares1);
		l1.setCoste(coste1);
		l1.setIsbn(isbn1);
		
		//Instancia el libro 2 y setea sus variables
		
		Libro l2 = new Libro();
		
		l2.setNombre(nombre2);
		l2.setAutor(autor2);
		l2.setEditorial(editorial2);
		l2.setAnyo(anyo2);
		l2.setCantidadEjemplares(cantidadEjemplares2);
		l2.setCoste(coste2);
		l2.setIsbn(isbn2);
		
		//Instancia el libro 3 y setea sus variables
		
		Libro l3 = new Libro();
		
		l3.setNombre(nombre3);
		l3.setAutor(autor3);
		l3.setEditorial(editorial3);
		l3.setAnyo(anyo3);
		l3.setCantidadEjemplares(cantidadEjemplares3);
		l3.setCoste(coste3);
		l3.setIsbn(isbn3);
		
		//Recoger variables del objeto y meterlas nuevamente en variables.
		
		//Libro1
		
		String getNombre1 = l1.getNombre();
		String getAutor1 = l1.getAutor();
		String getEditorial1 = l1.getEditorial();
		String getAnyol1 = l1.getAnyo();
		String getCantidadl1 = l1.getCantidadEjemplares();
		float getCostel1 = l1.getCoste();
		String getIsbnl1 = l1.getIsbn();
		
		String libro1 = "Libro " + getNombre1 + " de " + getAutor1 + " de la editorial " + getEditorial1 + " del año " + getAnyol1 + " con ISBN " + getIsbnl1 + " con coste " + getCostel1 + " Euros, quedan " + getCantidadl1 + " ejemplares.";
		
		//Imprimir resultado del mega cosa almacenada en lo del libro

		System.out.println(libro1);
		
		
		//Libro2
		
		String getNombre2 = l2.getNombre();
		String getAutor2 = l2.getAutor();
		String getEditorial2 = l2.getEditorial();
		String getAnyol2 = l2.getAnyo();
		String getCantidadl2 = l2.getCantidadEjemplares();
		float getCostel2 = l2.getCoste();
		String getIsbnl2 = l2.getIsbn();
				
		String libro2 = "Libro " + getNombre2 + " de " + getAutor2 + " de la editorial " + getEditorial2 + " del año " + getAnyol2 + " con ISBN " + getIsbnl2 + " con coste " + getCostel2 + " Euros, quedan " + getCantidadl2 + " ejemplares.";
				
		//Imprimir resultado del mega cosa almacenada en lo del libro

		System.out.println(libro2);
		
		//Libro3
		
		String getNombre3 = l3.getNombre();
		String getAutor3 = l3.getAutor();
		String getEditorial3 = l3.getEditorial();
		String getAnyol3 = l3.getAnyo();
		String getCantidadl3 = l3.getCantidadEjemplares();
		float getCostel3 = l3.getCoste();
		String getIsbnl3 = l3.getIsbn();
						
		String libro3 = "Libro " + getNombre3 + " de " + getAutor3 + " de la editorial " + getEditorial3 + " del año " + getAnyol3 + " con ISBN " + getIsbnl3 + " con coste " + getCostel3 + " Euros, quedan " + getCantidadl3 + " ejemplares.";
						
		//Imprimir resultado del mega cosa almacenada en lo del libro

		System.out.println(libro3);
	}

}
