
public class Coche extends Vehicle2 {
	int numPlaces;
	String extres;
	
	public Coche(int numPlaces, String extres, String mar, String mod, int any, String prov_matr,
			int num_matr, String lletres_matr, double con) {
		super(mar, mod, any, prov_matr, num_matr, lletres_matr, con);
		this.numPlaces = numPlaces;
		this.extres = extres;
	}

	public int getNumPlaces() {
		return numPlaces;
	}

	public String getExtres() {
		return extres;
	}

	public void setNumPlaces(int numPlaces) {
		this.numPlaces = numPlaces;
	}

	public void addExtres(String extres) {
		//this.extres = extres;
		this.extres =  this.extres + ", " + extres;		
	}
/*
	public void setExtres(String extres) {
		this.extres = extres;	
	}
	private void addExtres(String extra){
		String ext = this.extres + ", " + extra;
		setExtres(ext);
	}
*/
	public static void main(String[] args) {
		Coche coche1 =  new Coche(5,"extra1,extra2","Opel","Corsa",2013,"BA",4546,"HVJ",5.2F);
		coche1.addExtres("nou extra");
		coche1.addExtres("faros de xenon");
		coche1.addExtres("navegador");
		System.out.println(coche1);
		
	}

	@Override
	public String toString() {
		return "Coche [numPlaces=" + numPlaces + ", extres=" + extres
				+  super.toString() + "]";
	}
	
}
