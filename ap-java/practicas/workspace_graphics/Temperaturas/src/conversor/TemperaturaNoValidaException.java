package conversor;

public class TemperaturaNoValidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public TemperaturaNoValidaException() {
		super("La temperatura no puede ser menor que -273ºC");
	}

}