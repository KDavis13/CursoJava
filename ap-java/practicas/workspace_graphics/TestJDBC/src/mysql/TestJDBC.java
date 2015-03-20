package mysql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestJDBC {
	
	private static Properties props = initProps();
	
	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			
			String driverEspecific = getPropietat("rdbms.driver");
			Class.forName(driverEspecific).newInstance();
			
			conn = DriverManager
				.getConnection(
						getPropietat("rdbms.url"),
						getPropietat("rdbms.usuario"), 
						getPropietat("rdbms.pwd"));
			
			mostrarInfoMetadata(conn);			
			modificarPelicula(8, conn);
			
			PreparedStatement ps = 
					prepararInsercionPelicula(conn);
					
			Peli peli = new Peli(getNewId(conn),"El francontirador","Thriller","M18","Peter G.",10,15.5);
			insertarPelicula(peli, ps);
			
			peli = new Peli(getNewId(conn),"El francontirador 2","Thriller","M18","Luigi",6,13.8);
			insertarPelicula(peli, ps);
			
			mostrarPeliculas(conn);
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {					
					e.printStackTrace();
				}
			}
		}
	}

	private static int getNewId(Connection conn) {
		String sql = "select max(p_num) + 1 from pel";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if (rs.next()) {
				return rs.getInt(1);	
			}			
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		throw new RuntimeException("Error recuperando el proximo ID de pel!");
	}

	private static void  insertarPelicula(Peli peli, PreparedStatement ps) 
	{
		try {
			ps.setInt(1, peli.getP_num());
			ps.setString(2, peli.getTitulo());
			ps.setString(3, peli.getTipo());
			ps.setString(4, peli.getClasif());
			ps.setString(5, peli.getArtista());
			ps.setInt(6, peli.getCopias());
			ps.setDouble(7, peli.getPrecio());
			
			int filasAfectadas = ps.executeUpdate();
			
			if (filasAfectadas == 1 ) {
				System.out.println("Peli insertada: " + peli);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	private static PreparedStatement prepararInsercionPelicula(Connection conn) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("INSERT INTO PEL ")
		  .append("(p_num, titulo, tipo, ")
		  .append("clasif, artista, copias, precio)")
		  .append("VALUES (?,?,?,?,?,?,?)");
		  
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sb.toString());
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return ps;
	}

	private static void modificarPelicula(int numPel, Connection conn) {
		try {
			Statement st = conn.createStatement();
			String query = 
					"update pel set titulo='cocoon-modif' " + 
					"where p_num=" + numPel;
			int filasAfectadas = st.executeUpdate(query);
			System.out.println("Filas afectadas: " + filasAfectadas);
			mostrarPeliculas(conn);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}

	private static void mostrarPeliculas(Connection conn) {
		try {
			Statement statement = conn.createStatement();
			
			ResultSet rs = 
					statement.executeQuery("select * from pel");
			
			while(rs.next()) {
				System.out.println(
						rs.getInt("p_num") + " - " +
						rs.getString("titulo"));
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}

	private static void mostrarInfoMetadata(Connection conn) {
		try {
			DatabaseMetaData dbmd = conn.getMetaData();
			
			System.out.println("Nombre driver: " + dbmd.getDriverName());
			System.out.println("Version driver: " + dbmd.getDriverVersion());
			System.out.println("Nombre del RDMBS: " + dbmd.getDatabaseProductName());
			System.out.println("Version del RDMBS: " + dbmd.getDatabaseProductVersion());
			
			System.out.println("Catalogos en el RDBMS:");
			ResultSet rs = dbmd.getCatalogs();			
			while (rs.next()) {
				System.out.println("-" + rs.getString(1));
			}			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}

	private static Properties initProps() {
		
		String nomPropertiesFileDb =
				System.getProperty("propFileDbName");
		
		InputStream is = 
			TestJDBC.class.getResourceAsStream("/"+nomPropertiesFileDb);
			
		props = new Properties();
		try {
			props.load(is);
			return props;
		} catch (IOException e) {			
			e.printStackTrace();
		}
		throw new RuntimeException("Error cargando fichero de propiedades de la BD!");
	}

	private static String getPropietat(String propiedad) {
		return props.getProperty(propiedad);
	}

}
