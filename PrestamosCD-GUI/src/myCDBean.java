public class myCDBean implements Comparable<Object> {


	private String Titulo;
	private String Genero;
	private String Autor;
	private String Prestamo;
	
	public myCDBean(String Titulo, String Genero, String Autor, String Prestamo){
		super();
		this.setTitulo(Titulo);
		this.setGenero(Genero);
		this.setAutor(Autor);
		this.setPrestamo(Prestamo);
		
		
	}

	String getPrestamo() {
		return Prestamo;
	}

	void setPrestamo(String prestamo) {
		Prestamo = prestamo;
	}

	String getAutor() {
		return Autor;
	}

	void setAutor(String actor) {
		Autor = actor;
	}

	String getGenero() {
		return Genero;
	}

	void setGenero(String genero) {
		Genero = genero;
	}

	String getTitulo() {
		return Titulo;
	}

	void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public String toString() {
			return Titulo;
		}
	/* Dos titulos son iguales aunque difieran en 
	 * mayusculas o minusculas */
	@Override
	public int compareTo(Object o) {
		String otroTitulo=((CDBean)o).getTitulo();		
		return Titulo.compareToIgnoreCase(otroTitulo);	
	}
}
