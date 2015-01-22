package exemple05;

import java.io.IOException;

/*
 * There are many rules if we talk about methodoverriding 
 * with exception handling. The Rules are as follows:
	-If the superclass method does not declare an exception:
		If the superclass method does not declare an exception, 
		subclass overridden method cannot declare the checked 
		exception but it can declare unchecked exception.
	-If the superclass method declares an exception:
		If the superclass method declares an exception, subclass 
		overridden method can declare same, subclass exception or 
		no exception but cannot declare parent exception.
 */

class Alumno {
	void m() throws IOException {		
	}
}
class AlumnoBecario extends Alumno {
	@Override 
	void m() throws IOException {		
	}
}
public class Main {
	public static void main(String[] args) {
		Alumno a = new AlumnoBecario();
		try {
		    a.m();
		} catch (IOException ex) {
		    
		}
	}
}
