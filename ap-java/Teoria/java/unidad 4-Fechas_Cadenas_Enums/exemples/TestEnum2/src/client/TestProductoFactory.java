package client;

import productos.Producto;
import productos.ProductoFactory;

public class TestProductoFactory {
	
	public static void main(String[] args) {
		
		// Creem un producte Excel
		Producto producto = ProductoFactory.Excel.get();
		
		System.out.println("La clase del producto es: "
				+ producto.getClass().getSimpleName());
		
		System.out.println("Representacion String del producto: "
				+ ProductoFactory.Excel.toString());
		
		Producto producto2 = ProductoFactory.Excel.get();
		
		System.out.println("producto == producto2: " + (producto == producto2));
	}
}





















