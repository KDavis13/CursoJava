
public class Libro {
	private String nombre;
	private String autor;
	private String editorial;
	private String anyo;
	private String cantidadEjemplares;
	private float coste;
	private String isbn;
	
// Empiezan los setters
	
	public String getNombre() {
		return nombre;
	}
	
	public String getAutor() {
		return autor;
	}


	public String getEditorial() {
		return editorial;
	}


	public String getAnyo() {
		return anyo;
	}


	public String getCantidadEjemplares() {
		return cantidadEjemplares;
	}


	public float getCoste() {
		return coste;
	}


	public String getIsbn() {
		return isbn;
	}


//Empiezan los getters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}


	public void setCantidadEjemplares(String cantidadEjemplares) {
		this.cantidadEjemplares = cantidadEjemplares;
	}


	public void setCoste(float coste) {
		this.coste = coste;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


// Método constructor de la clase	
	
	public Libro(String autor, String editorial, String anyo,
			String cantidadEjemplares, float coste, String isbn) {
		super();
		this.autor = autor;
		this.editorial = editorial;
		this.anyo = anyo;
		this.cantidadEjemplares = cantidadEjemplares;
		this.coste = coste;
		this.isbn = isbn;
	}


	public Libro() {
		// TODO Auto-generated constructor stub
	}

//Resto de la clase


}
