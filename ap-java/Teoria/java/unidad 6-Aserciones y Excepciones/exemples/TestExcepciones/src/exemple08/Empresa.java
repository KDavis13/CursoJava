package exemple08;

import java.util.Arrays;

public class Empresa {
	private String nom;
	private Empleado[] empleados;
	private static int cont;
	
	public Empresa(String nomEmpresa, int maxEmpleados) {
		nom = nomEmpresa;
		empleados = new Empleado[maxEmpleados];
	}

	public void nuevoEmpleado(String nom, int salari) 
			throws CapacidadEmpresaExcedidaException 
	{
		if (empleadoCabe()) {
			Empleado e = new Empleado(nom, salari);
			empleados[cont] = e;
			cont++;			
		} else {
			final String MSG = "\nSe ha excedido la capacidad de " +
					"empleados de la empresa " + this.nom + 
					".\nEl tope est� en " + cont + " empleados.\n" +
					"El empleado " + nom + " no se ha podido crear.";
			throw new CapacidadEmpresaExcedidaException(MSG);	
		}
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
