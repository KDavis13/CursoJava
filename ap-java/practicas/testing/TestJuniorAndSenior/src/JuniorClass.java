class SeniorClass { // PADRE
	public SeniorClass() { // constructor
		toString();
	}

	public String toString() {
		return "Soy la clase senior";
	}
}

public class JuniorClass extends SeniorClass { // HIJA
	private String name;

	public JuniorClass() { // constructor
		super();
		name = "Soy la clase junior";
	}

	@Override
	public String toString() {
		//return name.toUpperCase();
		return "cosa";
	}

	public static void main(String args[]) {
		new JuniorClass();
	}
}