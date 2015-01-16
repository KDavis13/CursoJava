package entidades;

public class AlumnoBecario extends Alumno {
		
	private float salario;

	public AlumnoBecario(String codigo,  
			String newNombre, int newDni) 
	{
		super(codigo, newNombre, newDni);		
	}
	
	// Mètode per llegir el codi d'alumne 
	// que li pertany al becari 
	public String getCodigoAlumno() {
		return super.getCodigo();
	}
	
	// Mètode per llegir el codi de  
	// becari que li pertany
	@Override 
	public String getCodigo() {
		return super.getCodigo() + "B";
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float newSalario) {
		salario = newSalario;
	}

	@Override
	public String toString() {
		return super.toString() + 
				" - usuario_becario: " + getCodigo() +
				" - salario: " + salario;
	}	
}
