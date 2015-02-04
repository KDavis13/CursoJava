package ex05;

public class IsoscelesException extends Exception {

	private static final long serialVersionUID = 1L;

	public IsoscelesException() {
		super("Dos lados han de ser iguales y uno diferente!");
	}
}
