import java.io.*;

public class Alumno implements Serializable {
	private static final long serialVersionUID = 1152823724853875600L;
	private String nombre, apellidos, dni, curso;

	public Alumno(String nombre, String apellidos, String dni, String curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.curso = curso;
	}

	public String toString() {
		StringBuilder resultado = new StringBuilder();
		resultado.append("\nnombre: " + this.nombre);
		resultado.append("\napellidos: " + this.apellidos);
		resultado.append("\ndni: " + this.dni);
		resultado.append("\ncurso: " + this.curso);

		return resultado.toString();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}