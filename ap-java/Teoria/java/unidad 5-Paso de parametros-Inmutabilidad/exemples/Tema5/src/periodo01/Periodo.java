package periodo01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Periodo {

	private final Date inicio;
	private final Date fin;

	public Periodo(Date inicio, Date fin) {
		if (inicio.compareTo(fin)>0)
			throw new IllegalArgumentException(inicio +" despues "+fin);
		this.inicio = inicio;
		this.fin = fin;
	}

	public Date getInicio() { return inicio; }

	public Date getFin() { return fin; }

	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String strInicio = df.format(inicio);
		String strFin = df.format(fin);
		return "Periodo - inicio: " + strInicio +
				" - fin: " + strFin;
	}

}
