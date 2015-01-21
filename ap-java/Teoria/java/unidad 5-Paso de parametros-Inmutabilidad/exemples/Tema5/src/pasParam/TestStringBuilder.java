package pasParam;

public class TestStringBuilder {

	private static void modificar(StringBuilder sb) {
		sb.append("-modificado");
		System.out.println("en el metodo: " + sb.toString());		
	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Antonio");
		
		System.out
		.println("antes de la llamada al metodo: " + sb.toString());

		modificar(sb);

		System.out
		.println("despues de la llamada al metodo: " + sb.toString());
	}

}
