package mysql;

public class Peli {
	
	private int p_num, copias;
	private String titulo, clasif, tipo, artista;
	private double precio;
	
	public Peli(int p_num, String titulo, String tipo,
			String clasif, String artista, int copias, double precio) 
	{		
		this.p_num = p_num;
		this.copias = copias;
		this.titulo = titulo;
		this.clasif = clasif;
		this.tipo = tipo;
		this.artista = artista;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Peli [p_num=" + p_num + ", copias=" + copias + ", titulo="
				+ titulo + ", clasif=" + clasif + ", tipo=" + tipo
				+ ", artista=" + artista + ", precio=" + precio + "]";
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public int getCopias() {
		return copias;
	}

	public void setCopias(int copias) {
		this.copias = copias;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getClasif() {
		return clasif;
	}

	public void setClasif(String clasif) {
		this.clasif = clasif;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
