package entidades;

public class AlumnoBecario extends Alumno {
	
	private String usuario;
	private float salario;

	public AlumnoBecario(String usuarioA, String usuarioB, 
			String newNombre, int newDni) 
	{
		super(usuarioA, newNombre, newDni);
		this.usuario = usuarioB;
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
		return usuario;
	}

	@Override 
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
				" - usuario_becario: " + usuario +
				" - salario: " + salario;
	}	
}
