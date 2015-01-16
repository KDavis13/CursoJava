package entidades;

public class Complejo implements Cloneable {

	private double real, imag;
	public String[] valores;
	
	/*
	 * Això és un constructor de còpia
	 */
	public Complejo(Complejo copia) {
		real = copia.real;
		imag = copia.imag;
		valores = new String[5];
		valores[0] = copia.valores[0];
		valores[1] = copia.valores[1];
		valores[2] = copia.valores[2];
		valores[3] = copia.valores[3];
		valores[4] = copia.valores[4];
	}
	
	public Complejo clone() {
		return new Complejo(this);
	}
	
	/*@Override
	public Object clone() {
		try {
			Complejo nuevo = (Complejo)super.clone();
			nuevo.valores = new String[5];
			nuevo.valores[0] = "AAA";
			nuevo.valores[1] = "BBB";
			nuevo.valores[2] = "CCC";
			nuevo.valores[3] = "DDD";
			nuevo.valores[4] = "EEE";
			return nuevo;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}*/

	public Complejo() {
		valores = new String[5];
		valores[0] = "AAA";
		valores[1] = "BBB";
		valores[2] = "CCC";
		valores[3] = "DDD";
		valores[4] = "EEE";
	}

	public Complejo(double re, double im) {
		this();
		this.setReal(re);
		this.setImag(im);		
	}
	
	/*
	 * public boolean equals(Object obj) {
	 * 
	 * if (obj == null) return false;
	 * 
	 * if (!obj.getClass().equals(this.getClass())) return false;
	 * 
	 * Complejo otro = (Complejo) obj;
	 * 
	 * return this.real==otro.real && this.imag==otro.imag; }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imag);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imag) != Double
				.doubleToLongBits(other.imag))
			return false;
		if (Double.doubleToLongBits(real) != Double
				.doubleToLongBits(other.real))
			return false;

		return true;
	}

	

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "Complejo [real=" + real + ", imag=" + imag + "]";
	}

}
