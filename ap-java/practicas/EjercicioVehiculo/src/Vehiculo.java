
public class Vehiculo {

	
	private String marca;
	private String modelo;
	private int anyCompra;
	private String matricula;
	private float consumo;
	private  float carburantePorKm;
	
	//Métodos get
	
	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public int getAnyCompra() {
		return anyCompra;
	}


	public String getMatricula() {
		return matricula;
	}


	public float getConsumo() {
		return consumo;
	}


	public float getCarburantePorKm() {
		return carburantePorKm;
	}

	//Métodos set

	public void setMarca(String marca) {
		this.marca = marca;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public void setAnyCompra(int anyCompra) {
		this.anyCompra = anyCompra;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public void setConsumo(float consumo) {
		
		
		
		this.consumo = consumo;
	}



	public void setCarburantePorKm(float carburantePorKm) {
		this.carburantePorKm = carburantePorKm;
	}

	//Método constructor

	public Vehiculo (String marca, String modelo, int any, 
			String letraMatricula, int numeroMatricula, String letrasFinalMatricula, 
			float consumo){
		
		this.marca = marca;
		this.modelo = modelo;
		this.anyCompra = any;
		this.matricula = letraMatricula + numeroMatricula + letrasFinalMatricula;
		this.consumo = consumo;
		
	}
	
	//Método para calcular el consumo
	
	public float calculoConsumo(float litros) {
		this.carburantePorKm = litros/consumo;
		
		return carburantePorKm;
	}
	
	
}
