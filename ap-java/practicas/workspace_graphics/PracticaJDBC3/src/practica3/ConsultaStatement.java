package practica3;

import java.sql.*;
import java.text.SimpleDateFormat;

/**
 * Ejemplo de uso de JDBC: -Se establece la cadena de conexi�n con la base de
 * datos Libros -Se obtienen todos los libros del autor cuyo codigo=5 -Se
 * muestran los datos por pantalla
 */
public class ConsultaStatement {

	static Statement sentenciaSQL;

	public static void main(String[] args) {
		try {
			Conexion.setURL("jdbc:mysql://localhost:3306/Libros?user=usuario1&password=usuario1");
			sentenciaSQL = Conexion.getConexion().createStatement();

			String sql = "select * from libros where titulo like '%Java%'";

			ResultSet res = lanzarSelect(sql);

			mostrarSelect(res);

			getNuevoID("autores", "CodigoAutor");
			
			grabarFila("update autores set Nombre='CAY HORSTMANN'  where CodigoAutor='1'");

			nuevoAutor();
			
			editarFecha();
			
			Conexion.desconecta();
			

		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		}
	}

	/*
	 * EJERCICIO 2 APARTADO A
	 * 
	 * Cread un m�todo que permita ejecutar cualquier SELECT y ubicar aqu� el
	 * c�digo que actualmente utilizamos para crear y ejecutar los SELECT. Este
	 * m�todo debe recibir un String con el SELECT a ejecutar y debe devolver un
	 * ResultSet
	 * 
	 */

	private static ResultSet lanzarSelect(String select) {
		// System.out.println(select.toString());

		ResultSet res = null;
		try {
			res = sentenciaSQL.executeQuery(select.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

	/*
	 * EJERCICIO 2 APARTADO B
	 * 
	 * Cread un m�todo llamado mostrarSelect() que recibiendo un objeto
	 * ResultSet sea capaz de imprimir por pantalla todos los campos y todas las
	 * filas existentes en un ResultSet.:
	 * 
	 */

	private static void mostrarSelect(ResultSet res) throws SQLException {
		ResultSetMetaData resMD = res.getMetaData();

		res.beforeFirst();
		while (res.next()) {
			System.out.println(resMD.getColumnName(1) + "    "
					+ resMD.getColumnName(2) + "                 "
					+ resMD.getColumnName(3));
			System.out.println(res.getString(1) + "              "
					+ res.getString(2) + "        " + res.getString(3));
			System.out.println(resMD.getColumnName(4) + "               "
					+ resMD.getColumnName(5));
			System.out.println(res.getString(4) + "      " + res.getString(5));
			System.out
					.println("---------------------------------------------------------------------");
		}

	}

	/*
	 * EJERCICIO 3 APARTADO A
	 * 
	 * Cread un m�todo llamado getNuevoID() que en funci�n del nombre de la
	 * tabla y del nombre del campo clave suministrado devuelva el siguiente
	 * valor para ese campo. Asumimos que el campo para el cual hay que
	 * conseguir el siguiente valor ser� siempre de tipo int:
	 * 
	 */

	private static int getNuevoID(String tabla, String ID) throws SQLException {

		String T = tabla;
		String I = ID;

		String sql = "Select " + I + " from " + T;

		int idFinal = 0;

		ResultSet res = lanzarSelect(sql);

		while (res.next()) {
			idFinal = res.getInt(I);
		}

		return ++idFinal;
	}

	/*
	 * EJERCICIO 3 APARTADO B
	 * 
	 * Cread un m�todo llamado grabarFila() que permita ejecutar una sentencia
	 * SQL de inserci�n o de actualizaci�n sobre cualquier tabla. Para ello debe
	 * recibir un String que represente la orden y devolver un entero con el
	 * valor de las filas que han sido afectadas
	 * 
	 */

	private static int grabarFila(String orden) {
		String sql = orden;
		int filasAfectadas = 0;

		try {System.out.println("llego D:");
			filasAfectadas = sentenciaSQL.executeUpdate(sql);
			System.out.println("Filas afectadas: " + filasAfectadas);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return filasAfectadas;
	}
	
	/*
	 * Apartado C
	 * 
	 * A�adir un nuevo autor a la tabla Autores utilizando los dos m�todos creados 
	 * en los apartados anteriores de este mismo ejercicio: getNuevoID() y grabarFila()
	 * 
	 */
	
	private static void nuevoAutor(){
		try {
			int codigoNuevo = getNuevoID("autores", "CodigoAutor");
			String sql = "Insert into autores (CodigoAutor, Nombre, Direccion, Telefono) values ('" + codigoNuevo + "', 'Pepe Casta�a', 'Calle Chunga', 666666666)" ;
			
			grabarFila(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Apartado D
	 * 
	 * A�adir el c�digo necesario en el main para crear una instrucci�n 
	 * que modifique la fecha del libro cuyo c�digo es el 3 por la fecha 
	 * actual. Utilizad el m�todo grabarFila().
	 * 
	 */
	
	private static void editarFecha(){
		
		String fecha = "Select current_date();";
		
		ResultSet res = lanzarSelect(fecha);

		try {
			while (res.next()) {
				fecha = res.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String actualizar = "update libros set fecha='"+ fecha +"'  where CodigoLibro='3'";
		
		grabarFila(actualizar);
		
		System.out.println(fecha.toString());
		
	}

}
