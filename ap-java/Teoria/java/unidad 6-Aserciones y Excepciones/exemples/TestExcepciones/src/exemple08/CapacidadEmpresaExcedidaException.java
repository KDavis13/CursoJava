package exemple08;

public class CapacidadEmpresaExcedidaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CapacidadEmpresaExcedidaException(String nom) {
		super(nom);
	}

}
