package administracion;

public class EmpleadoFijo extends Empleado{

	public static final int SUELDO_BASE=109113; //precios en centimos
	public static final int COMPLEMENTO=19285;  //precios en centimos
	
	private int a�oAlta;

	public EmpleadoFijo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpleadoFijo(String dni, String nombre, int a�oAlta) {
		super(dni, nombre);
		this.a�oAlta=a�oAlta;
	}

	public int getA�oAlta() {
		return a�oAlta;
	}

	public void setA�oAlta(int a�oAlta) {
		this.a�oAlta = a�oAlta;
	}

	@Override
	public int calcularSueldo() {
		int sueldo=0;
		
		sueldo=SUELDO_BASE+a�osEnEmpresa()*COMPLEMENTO;
		
		return sueldo;
	}

	private int a�osEnEmpresa() {
		int a�osTrabajados= a�oEnCurso()-a�oAlta;
		return a�osTrabajados;
	}

	private int a�oEnCurso() {
		
		return 2014;
	}
}
