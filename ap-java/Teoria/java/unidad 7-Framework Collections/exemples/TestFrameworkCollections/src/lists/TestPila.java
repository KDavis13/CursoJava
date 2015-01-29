package lists;

import java.util.Stack;
import java.util.EmptyStackException;

public class TestPila {

	public static void main(String args[]) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		Integer entero=null;

		System.out.println("Contenido inicial de la pila:");
		System.out.println("pila: " + st);

		entero=new Integer(15);
		System.out.println("Añadimos el primer numero:"+entero);
		st.push(entero);
		System.out.println("pila: " + st);

		entero=new Integer(45);
		System.out.println("Añadimos el segundo numero:"+entero);
		st.push(entero);
		System.out.println("pila: " + st);

		entero=new Integer(69);
		System.out.println("Añadimos el tercer numero:"+entero);
		st.push(entero);
		System.out.println("pila: " + st);
		
		System.out
		.println("\nBuscamos donde se encuentra el numero 45 en la pila...");
		
		int pos=st.search(45);
		System.out.println("Se encuentra en la posicion "+pos);

		System.out
		.println("\nBuscamos donde se encuentra el numero 507 en la pila...");
		
		pos=st.search(507);
		System.out
		.println(pos==-1?"No se encuentra":"Se encuentra en la posicion "+pos);

		System.out.println("\nSacamos los elementos de la pila...");
		
		while (!st.empty()) { 
			st.pop();
			System.out.println("pila: " + st);
		}
		
		try {
			System.out
			.println("Sabemos que ahora está vacia, pero igualmente");
			System.out.println("intentamos extraer un elemento...");
			st.pop();
		} catch (EmptyStackException e) {
			System.out.println("pila vacia!");
		}
	}
}
