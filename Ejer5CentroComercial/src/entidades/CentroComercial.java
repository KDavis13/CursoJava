package entidades;

import java.util.ArrayList;

public class CentroComercial {
	private String nombre;
	private ArrayList[] locales;
	
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	
	
	public ArrayList[] getLocales() {
		return locales;
	}

	

	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setLocales(ArrayList[] locales) {
		this.locales = locales;
	}
	
	
	
	//Constructores
	 public CentroComercial(){
		 
	 }
	 
	 public CentroComercial(String nombre, ArrayList[] locales){
		 this.nombre = nombre;
		 this.locales = locales;
	 }

}
