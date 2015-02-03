package console;

import java.io.Console;

public class ConsoleDemo {
	
	public static void main(String[] args) {

		Console cnsl = null;
		String name = null;
		char[] pwd = null;		

		try {
			// creates a console object
			cnsl = System.console();

			// if console is not null
			if (cnsl != null) {

				// read line from the user input
				name = cnsl.readLine("Name: ");
				
				pwd = cnsl.readPassword("Password: ");

				byte[] pwdXifrat = xifrarPwd(pwd); 
				
				// prints
				System.out.println("Name entered : " + name);
				System.out.println("Password entered : " + pwd);
			}
		} catch (Exception ex) {

			// if any error occurs
			ex.printStackTrace();
		}
	}

	private static byte[] xifrarPwd(char[] pwd) {		
		// Aplicar l'algorisme que toqui
		return null;
	}
}
