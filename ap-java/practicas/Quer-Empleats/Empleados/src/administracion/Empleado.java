package administracion;

public class Empleado {
	private String dni;
	private String nombre;
	
	public Empleado(){
		
	}
	
	public Empleado(String dni,	String nombre){
		this.dni=dni;
		this.nombre=nombre;
	}
		
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int calcularSueldo(){
		return 0;
	}
}
