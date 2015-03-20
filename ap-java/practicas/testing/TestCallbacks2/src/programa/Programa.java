package programa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import db.Conexion;
import db.GestorConsultas;
import db.ProcesadorFilas;
import entidades.Libro;

public class Programa {

	public static void main(String[] args) {

		Conexion.setURL("jdbc:mysql://localhost:3306/Libros?user=root&password=toor");
		String sql="SELECT * FROM libros";
				
		for (Libro libro:recuperarLibros(sql)) {
			System.out.println(libro);
		}		
	}
	
	private static List<Libro> recuperarLibros(String sql) {		
		final List<Libro> libros = new ArrayList<Libro>();
		
		GestorConsultas gestorConsultas = 
			new GestorConsultas(Conexion.getConexion());
		
		gestorConsultas.consulta(sql, new ProcesadorFilas() {
				@Override public void procesarFila(ResultSet rs) throws SQLException 
				{
					int codlib = rs.getInt(1);
					String isbn = rs.getString(2);
					String titulo = rs.getString(3);
					String editorial = rs.getString(4);
					Date fecha = rs.getDate(5);
					libros.add(new Libro(codlib, isbn, titulo, editorial, fecha));
				}			
			}		
		);
		
		return libros;
	}
	
}
