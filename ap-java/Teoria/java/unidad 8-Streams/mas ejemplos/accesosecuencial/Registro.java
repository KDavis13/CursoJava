package accesosecuencial;

public class Registro {
    
	private String titulo;

    private String autor;

    private String isbn;

    private int year;

    public Registro(String isbn, String titulo, String autor, int year) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
    }

    public String getISBN() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }
    
    @Override
	public String toString() {
		return "Registro [titulo=" + titulo + ", autor=" + autor + ", isbn="
				+ isbn + ", year=" + year + "]";
	}
}
