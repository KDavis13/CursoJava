package entidades;

public class AlumnoDoctorando extends Alumno {

	private String temaTesis;
	
	public AlumnoDoctorando(String codigo, 
			String nombre, int dni) {
		super(codigo, nombre, dni);		
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
		return super.getCodigo() + "D";
	}
	
	public String getTemaTesis() {
		return temaTesis;
	}

	public void setTemaTesis(String temaTesis) {
		this.temaTesis = temaTesis;
	}

	@Override
	public String toString() {
		return super.toString() + 
				" - usuario_doctando: " + getCodigo() +
				" - tema_tesis: " + temaTesis;
	}
}
