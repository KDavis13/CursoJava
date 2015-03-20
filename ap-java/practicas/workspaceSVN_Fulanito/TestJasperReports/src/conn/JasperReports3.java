package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class JasperReports3 {
	public static void main(String[] args) {
		String reportName = "./informes/tercerInforme";
		JasperReport jasperReport;
		JasperPrint jasperPrint;
		Map<String,Object> pars = new HashMap<>();
		pars.put("LOGO_URL", "./img/pue-logo.jpg");
		pars.put("P_INSTITUCION", "PUE");
		pars.put("P_ID_CURSO", "2");
		try {
			// 1-Se hace la conexion a la Base de Datos
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/Formacion?user=root&password=toor");

			// 2-Compilamos el archivo XML y lo cargamos en memoria
			jasperReport = JasperCompileManager.compileReport(reportName
					+ ".jrxml");

			// 3-Llenamos el informe con la información de la BD y parámetros
			// necesarios para la consulta
			jasperPrint = JasperFillManager.fillReport(jasperReport, pars, conn);

			// 4-Exportamos el report a pdf y lo guardamos en disco
			JasperExportManager.exportReportToPdfFile(jasperPrint, "tercerInforme.pdf");

			// 5-Cerrar la conexion
			conn.close();

			System.out.println("Informe generado.");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}