package beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class JasperReports4 {
	public static void main(String[] args) {
		String reportName = "./informes/cuartoInforme";
		JRBeanCollectionDataSource dataSource;
		JasperReport jasperReport;
		JasperPrint jasperPrint;
		Map<String, Object> pars = new HashMap<>();
		
		pars.put("LOGO_URL", "./img/logo_universidades.gif");
		pars.put("P_TITULO", "Informe de universidades");
		pars.put("P_SUBTITULO", "Región norte");
		
		try {
			// 1-Llenar el datasource con la informacion de la base de datos o
			// de donde esté, en este caso "hardcoded"
			Collection<Universidad> lista = populateData();
			dataSource = new JRBeanCollectionDataSource(lista);

			// 2-Compilamos el archivo XML y lo cargamos en memoria
			jasperReport = JasperCompileManager.compileReport(reportName
					+ ".jrxml");

			// 3-Llenamos el report con la información de la coleccion y
			// parámetros necesarios para la consulta
			jasperPrint = JasperFillManager.fillReport(jasperReport, pars,
					dataSource);

			// 4-Exportamos el report a pdf y lo guardamos en disco
			JasperExportManager.exportReportToPdfFile(jasperPrint,
					"cuartoInforme.pdf");

			System.out.println("Documento generado.");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	private static Collection<Universidad> populateData() {
		Collection<Universidad> list = new ArrayList<Universidad>();
		list.add(new Universidad("Universidad de Vigo", "Dr. Miguel Esquerro",
				"As Lagoas-Marcosende", new Integer(2800)));
		list.add(new Universidad("Universidad de Navarra",
				"Dr. Manuel Velasco", "Campus Universitario. 31080. Pamplona",
				new Integer(5656)));
		list.add(new Universidad("Universidad de Oviedo", "Dr. Andres García",
				"Plaza Feijoo s/n 33003", new Integer(3200)));
		list.add(new Universidad("Universidad Autónoma de Barcelona",
				"Dr. Joan Conill", "Bellaterra", new Integer(5700)));
		list.add(new Universidad("Universidad Politécnica de Barcelona",
				"Dra. Sandra Obrador", "Jordi Girona, 08034", new Integer(5380)));
		list.add(new Universidad("Universidad del País Vasco",
				"Dr. Patxi Echanove", "Bilbao", new Integer(4180)));
		return list;
	}
}