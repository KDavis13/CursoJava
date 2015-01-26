package periodo04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Periodo {

	private final Date inicio;
	private final Date fin;

	public Periodo(Date inicio, Date fin) {
		
		this.inicio = new Date(inicio.getTime());
		this.fin = new Date(fin.getTime());
		
		if (this.inicio.compareTo(this.fin)>0)
			throw new IllegalArgumentException(this.inicio +" despues "+this.fin);
		
	}

	public Date getInicio() { return new Date(inicio.getTime()); }

	public Date getFin() { return new Date(fin.getTime()); }

	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String strInicio = df.format(inicio);
		String strFin = df.format(fin);
		return "Periodo - inicio: " + strInicio +
				" - fin: " + strFin;
	}

}
