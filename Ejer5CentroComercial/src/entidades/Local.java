package entidades;

import java.util.ArrayList;

public abstract class Local {
	private String nombre;
	private String horario;
	private ArrayList[] empleados;
	private int metros;
	
	//Getters
	public String getNombre() {
		return nombre;
	}

	public String getHorario() {
		return horario;
	}

	public ArrayList[] getEmpleados() {
		return empleados;
	}

	public int getMetros() {
		return metros;
	}
	
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void setEmpleados(ArrayList[] empleados) {
		this.empleados = empleados;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}
	
	
	
	//Constructores
	public Local(){
		
	}
	
	public Local(String nombre){
		this.nombre = nombre;
	}
	
	/////////////////////   Otros métodos   //////////////////////
	protected abstract void impuesto();
}
