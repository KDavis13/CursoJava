package entidades;

public class AlumnoBecario extends Alumno {
		
	private float salario;

	public AlumnoBecario(String usuarioA,  
			String newNombre, int newDni) 
	{
		super(usuarioA, newNombre, newDni);		
	}
	
	// Mètode per llegir el codi d'alumne 
	// que li pertany al becari 
	public String getUsuarioAlumno() {
		return super.getUsuario();
	}
	
	// Mètode per llegir el codi de  
	// becari que li pertany
	@Override 
	public String getUsuario() {
		return super.getUsuario() + "B";
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
				" - usuario_becario: " + getUsuario() +
				" - salario: " + salario;
	}	
}
