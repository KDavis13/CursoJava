package dummies;

public class DummyConfig {
	
	//Atributos
	private int anyo = 2008;
	private int mes = 11;
	private String idiomaIn = "CAT";
	private String idiomaOut = "ENG";
	
	
	//Getters
	public int getAnyo() {
		return anyo;
	}

	public int getMes() {
		return mes;
	}

	public String getIdiomaIn() {
		return idiomaIn;
	}

	public String getIdiomaOut() {
		return idiomaOut;
	}

	
	//Setters
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setIdiomaIn(String idiomaIn) {
		this.idiomaIn = idiomaIn;
	}

	public void setIdiomaOut(String idiomaOut) {
		this.idiomaOut = idiomaOut;
	}

	
	//Constructor
	public DummyConfig(){
		
	}
	
}
