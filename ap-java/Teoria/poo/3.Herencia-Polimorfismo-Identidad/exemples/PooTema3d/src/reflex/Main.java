package reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			// Tenim la classe Complejo
			Class clase = Class.forName(args[0]);
			
			// Obtenim una referencia al mètode setReal()
			Method metode = 
				clase.getMethod("setReal", double.class);
			
			// Ara creo una instancia de la classe Complejo
			Object miComplejo = clase.newInstance();
			
			// Cridem al mètode setReal(8.44)
			metode.invoke(miComplejo, 8.44);
			
			System.out.println(miComplejo);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {			
			e.printStackTrace();		
		}
	}
	
	/*
	 * // Obtinc tots els constructor de la classe Complejo
			Constructor[] constructores = 
					clase.getDeclaredConstructors();
			
			// Els vaig mostrant per pantalla
			for (Constructor constructor : constructores) {
				System.out.println(constructor.toString());
			}
			
			// Obtinc els atributs de la classe Complejo
			Field[] camps = clase.getDeclaredFields();
			
			// Els vaig mostrant per pantalla
			for (Field camp : camps) {
				System.out.println(camp.toString());
			}
			
			// Obtinc els mètodes de la classe Complejo
			Method[] metodes = clase.getDeclaredMethods();
			
			// Els vaig mostrant per pantalla
			for (Method metode : metodes) {
				System.out.println(metode.toString());
			}
	 */

}
