package exemple07;

import java.util.Arrays;

public class Empresa {
	private String nom;
	private Empleado[] empleados;
	private static int cont;
	
	public Empresa(String nomEmpresa, int maxEmpleados) {
		nom = nomEmpresa;
		empleados = new Empleado[maxEmpleados];
	}

	public boolean nuevoEmpleado(String nom, int salari) {
		if (empleadoCabe()) {
			Empleado e = new Empleado(nom, salari);
			empleados[cont] = e;
			cont++;
			return true;
		}
		return false;
	}

	private boolean empleadoCabe() {		
		return cont < empleados.length;
	}

	@Override
	public String toString() {
		return "Empresa [nom=" + nom + ", empleados="
				+ Arrays.toString(empleados) + "]";
	}
	
}
