package administracion;

public class EmpleadoHoras extends Empleado{
	private static final int PRECIO_HORAS= 939; //centimos
	
	private int horasTrabajadas;

	public EmpleadoHoras() {
		super();
	}
	
	public EmpleadoHoras(String nombre, String dni,int horasTrabajadas) {
		super(nombre, dni);
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	public int calcularSueldo(){
		int sueldo=0;
		
		sueldo=horasTrabajadas*PRECIO_HORAS;
		
		return sueldo;
	}
}
