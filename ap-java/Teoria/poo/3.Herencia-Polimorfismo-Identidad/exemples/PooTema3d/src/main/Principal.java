package main;

import entidades.Complejo;

public class Principal {

	public static void main(String[] args) {
		Complejo c1 = new Complejo(3,5);
		Complejo c2 = c1.clone();
		c2.valores[0] = "aaa";
		System.out.println("c1.valores[0]" + c1.valores[0]);
		System.out.println("c2.valores[0]" + c2.valores[0]);
		
		
		System.out.print("c1==c2? ");
		
		System.out
		  .println(c1==c2? "Objetos iguales" : "Objetos diferentes");
		
		System.out.print("c1.equals(c2)? ");
		System.out
		  .println(c1.equals(c2)?"Valores iguales":"Valores diferentes");

	}

}
