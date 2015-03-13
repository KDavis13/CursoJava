package entidades;

import java.util.Date;

public class Libro {	
	private int codigoLibro;
	private String isbn;
	private String titulo;
	private String editorial;
	private Date fecha;
	
	/*public Libro() {
		
	}*/
	public Libro(int codigoLibro, String isbn, String titulo, String editorial,
			Date fecha) {
	
		this.codigoLibro = codigoLibro;
		this.isbn = isbn;
		this.titulo = titulo;
		this.editorial = editorial;
		this.fecha = fecha;
	}

	public int getCodigoLibro() { return codigoLibro; }
	public String getIsbn() { return isbn; }
	public String getTitulo() { return titulo; }
	public String getEditorial() { return editorial; }
	public Date getFecha() { return fecha; }

	public void setCodigoLibro(int codigoLibro) {
		this.codigoLibro = codigoLibro;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Libro [codigoLibro=" + codigoLibro + ", isbn=" + isbn
				+ ", titulo=" + titulo + ", editorial=" + editorial
				+ ", fecha=" + fecha + "]";
	}
			
}
