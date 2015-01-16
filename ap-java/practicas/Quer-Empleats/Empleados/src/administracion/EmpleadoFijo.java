package administracion;

public class EmpleadoFijo extends Empleado{

	public static final int SUELDO_BASE=109113; //precios en centimos
	public static final int COMPLEMENTO=19285;  //precios en centimos
	
	private int añoAlta;

	public EmpleadoFijo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpleadoFijo(String dni, String nombre, int añoAlta) {
		super(dni, nombre);
		this.añoAlta=añoAlta;
	}

	public int getAñoAlta() {
		return añoAlta;
	}

	public void setAñoAlta(int añoAlta) {
		this.añoAlta = añoAlta;
	}

	@Override
	public int calcularSueldo() {
		int sueldo=0;
		
		sueldo=SUELDO_BASE+añosEnEmpresa()*COMPLEMENTO;
		
		return sueldo;
	}

	private int añosEnEmpresa() {
		int añosTrabajados= añoEnCurso()-añoAlta;
		return añosTrabajados;
	}

	private int añoEnCurso() {
		
		return 2014;
	}
}
