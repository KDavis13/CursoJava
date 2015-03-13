package programa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import db.Conexion;
import db.GestorConsultas;
import db.ProcesadorFilas;
import entidades.Autor;
import entidades.Libro;

public class Programa {

	static {
		Conexion.setURL("jdbc:mysql://localhost:3306/Libros?user=root&password=toor");
	}	
	
	static GestorConsultas gestorConsultas = 
		new GestorConsultas(Conexion.getConexion());
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM libros";

		for (Libro libro : recuperarLibros(sql)) {
			System.out.println(libro);
		}

		sql = "SELECT * FROM autores";

		for (Autor autor : recuperarAutores(sql)) {
			System.out.println(autor);
		}
		
		Conexion.desconecta();				
	}

	private static List<Autor> recuperarAutores(String sql) {

		final List<Autor> autores = new ArrayList<Autor>();

		gestorConsultas.consulta(sql, new ProcesadorFilas() {
			@Override
			public void procesarFila(ResultSet rs) throws SQLException {
				int codAut = rs.getInt(1);
				String nombre = rs.getString(2);
				String dir = rs.getString(3);
				String tel = rs.getString(4);				
				autores.add(new Autor(codAut, nombre, dir, tel));
			}
		});
		
		return autores;
	}

	private static List<Libro> recuperarLibros(String sql) {

		final List<Libro> libros = new ArrayList<Libro>();
		
		gestorConsultas.consulta(sql, new ProcesadorFilas() {
			@Override
			public void procesarFila(ResultSet rs) throws SQLException {
				int codlib = rs.getInt(1);
				String isbn = rs.getString(2);
				String titulo = rs.getString(3);
				String editorial = rs.getString(4);
				Date fecha = rs.getDate(5);
				libros.add(new Libro(codlib, isbn, titulo, editorial, fecha));
			}
		});
		
		return libros;
	}

}
