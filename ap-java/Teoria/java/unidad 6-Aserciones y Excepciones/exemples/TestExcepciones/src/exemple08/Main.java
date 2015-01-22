package exemple08;

public class Main {

	public static void main(String[] args) {
		
		Empresa emp1 = new Empresa("La colosal S.A.", 2);
		
		try {
			emp1.nuevoEmpleado("Joan", 1100);
			emp1.nuevoEmpleado("Laura", 1150);			
			emp1.nuevoEmpleado("Pere", 1000);
		} catch (CapacidadEmpresaExcedidaException e) {			
			e.printStackTrace();
		}
				
		System.out.println(emp1);
	}

}
