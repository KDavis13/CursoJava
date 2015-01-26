package stringBuffer;

public class TestStringBuffer3 {

	public static void main(String[] args) {
		
		String saludo = "Hola ";
		saludo += "que ";
		saludo += "tal?";
		
		char[] temp = saludo.toCharArray();
		imp(temp);	
	}
	
	private static void imp(char[] caracters) {
		String cadena = new String(caracters);
		System.out.println(cadena);
	}

}
