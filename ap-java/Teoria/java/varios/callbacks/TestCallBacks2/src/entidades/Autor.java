package entidades;

public class Autor {
	private int codigoAutor;
	private String nombre, direccion, telefono;
	
	public Autor(int codigoAutor, String nombre, String direccion,
			String telefono) {
		super();
		this.codigoAutor = codigoAutor;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Autor [codigoAutor=" + codigoAutor + ", nombre=" + nombre
				+ ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}

	public int getCodigoAutor() {
		return codigoAutor;
	}

	public void setCodigoAutor(int codigoAutor) {
		this.codigoAutor = codigoAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
