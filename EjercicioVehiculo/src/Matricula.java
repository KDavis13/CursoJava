
public class Matricula {

	private String codigoProvincia;
	private int numeroMatricula;
	private String otrasLetras;
	
	private String matricula;
	
	//Getters
	
	public String getCodigoProvincia() {
		return codigoProvincia;
	}



	public int getNumeroMatricula() {
		return numeroMatricula;
	}



	public String getOtrasLetras() {
		return otrasLetras;
	}
	
	public String getMatricula() {
		return otrasLetras;
	}

	//Setters

	public void setMatriculaa(String codigoProvincia) {
		this.matricula = codigoProvincia;
	}



	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}



	public void setOtrasLetras(String otrasLetras) {
		this.otrasLetras = otrasLetras;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	//Método constructor

	public Matricula (String codigoProv, int numero, String letras) {
		this.codigoProvincia = codigoProv;
		this.numeroMatricula = numero;
		this.otrasLetras = letras;
		this.matricula = aString();
	}
	
	//Método toString
	
	private String aString() {
		String matriculaFinal = codigoProvincia + Integer.toString(numeroMatricula) + otrasLetras;
		return matriculaFinal;
	}
	
	
	
}
