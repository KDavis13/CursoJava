package entidades;

import java.util.Date;

public class Alumno {
	private String nombre, direccion, curso;
	private int dni;	
	private Date fechaNacimiento;	
	
	private static int contador = 0;
	
	public static int getContador() {
		return contador;
	}
	
	// Constructor que delega en un m�tode intern
	public Alumno(String nombre, int dni) {		
		setNomAndDni(nombre, dni); // delegaci�
		contador++;
	}
	
	// M�tode que realment guarda els 
	// par�metres en els atributs
	private void setNomAndDni(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getDni() {
		return dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getCurso() {
		return curso;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String toString() {
		return "nom: " + nombre + " - dni: " + dni;
	}
}
