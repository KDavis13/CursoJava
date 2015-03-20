package main;

import java.util.List;

import persistencia.JpaManagement;
import entidades.Estudiante;

public class Main {
	
	public static void main(String[] args) {
		
		JpaManagement jpa = new JpaManagement();
		
		Estudiante estudiante1 = new Estudiante("Benito", 1, "Filolog�a coreana 5");
		JpaManagement.crearEntidad(estudiante1);
		
		Estudiante estudiante2 = new Estudiante("Mar�a", 2, "Filolog�a alemana 5");
		JpaManagement.crearEntidad(estudiante2);
		
		
		List<Estudiante> estudiantes = jpa.getEntidades();
		
		System.out.println();
		System.out.println("Mostrando estudiantes creados.......");
		mostratEstudiantes(estudiantes);
		
		jpa.cerrarRecursos();
		System.out.println("programa finalizado");
		
	}
	
	private static void mostratEstudiantes(List<Estudiante> estudiantes){
		
		for(Estudiante est : estudiantes){
			System.out.println(est.toString());
			
		}
	}

}
