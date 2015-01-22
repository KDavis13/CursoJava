package exemple07;

public class Main {

	public static void main(String[] args) {
		
		Empresa emp1 = new Empresa("La colosal S.A.", 2);
		
		boolean empleadoCabe = false;
		
		empleadoCabe = emp1.nuevoEmpleado("Joan", 1100);
		
		if (!empleadoCabe) 
			System.out.println("Ojo, no ha creado a Joan");
		
		empleadoCabe = emp1.nuevoEmpleado("Laura", 1150);
		
		if (!empleadoCabe) 
			System.out.println("Ojo, no ha creado a Laura");
		
		empleadoCabe = emp1.nuevoEmpleado("Pere", 1000);
		
		if (!empleadoCabe) 
			System.out.println("Ojo, no ha creado a Pere");
		
		System.out.println(emp1);
		
	}

}
