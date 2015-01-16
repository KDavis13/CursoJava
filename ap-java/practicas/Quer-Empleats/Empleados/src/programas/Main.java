package programas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import administracion.*;

public class Main {
	
	private static List<Empleado> empleados;
	
	public static void main(String[] args) {
		
		empleados= new ArrayList<Empleado>();
		
		empleados.add(new EmpleadoFijo("33445566G","Pepito Sanchez", 2011));
		empleados.add(new EmpleadoHoras("22997766S","Manolito Perales", 120));
		empleados.add(new EmpleadoTemporal("55443322E", "Francesca Garcia", conversorFecha(20,11,2014),conversorFecha(25,11,2014)) );
		
		if (args.length>0){
			
				switch (args[0]){
					case "F":
						empleados.add(new EmpleadoFijo(args[1],args[2], Integer.valueOf(args[3])));
						break;
					case "H":
						empleados.add(new EmpleadoFijo(args[1],args[2], Integer.valueOf(args[3])));
						break;
					case "T":
						empleados.add(new EmpleadoTemporal(args[1], args[2], 
								conversorFecha(Integer.valueOf(args[3]),Integer.valueOf(args[4]),
								Integer.valueOf(args[5])),conversorFecha(Integer.valueOf(args[6]),
								Integer.valueOf(args[7]),Integer.valueOf(args[8]))) );
						
				}
				
			
		}
		
		imprimirSueldos();
	}
	
	public static void imprimirSueldos(){
		
		for (Empleado empleadoSueldo : empleados){
			System.out.println("Empleado " + empleadoSueldo.getClass().getSimpleName() + ":" +
								empleadoSueldo.getDni() + ": " + 
								empleadoSueldo.getNombre() + "  Sueldo: " + 
								sueldoEuros(empleadoSueldo.calcularSueldo())+" €");
		}
	}
	
	public static String sueldoEuros(int sueldo){
		String auxSueldoEuros;
		String sueldoEuros;
		
		auxSueldoEuros= Integer.toString(sueldo);
		sueldoEuros= auxSueldoEuros.substring(0, auxSueldoEuros.length()-2)+
					"."+auxSueldoEuros.substring(auxSueldoEuros.length()-2);
		
		
		return sueldoEuros;
	}
	
	private static Calendar conversorFecha(int dia,int mes, int año){
		
		Calendar mCalendar = Calendar.getInstance();
		mCalendar.set(año, mes-1, dia);
		
		return mCalendar;
	}

}
