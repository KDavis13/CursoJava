package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			// Tenim la classe Complejo
			Class clase = Class.forName("singleton.Singleton");
			
			Constructor[] constructors = 
					clase.getDeclaredConstructors();
			
			for (Constructor constructor: constructors) {
				constructor.setAccessible(true);
			}
			
			// Ara creo una instancia de la classe Singleton
			Object miSingleton = clase.newInstance();
						
			// Obtenim una referencia al mètode setReal()
			Method metode = 
				clase.getMethod("conectarBD");
			
			// Cridem al mètode
			metode.invoke(miSingleton);
			
			// *****************************
			
			
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
