class Cotxe extends Vehicle2 {

	//declaració d'atributs
	protected int num_places;
	protected String extres_comfort;

	//declaració de mètodes
	Cotxe(String fabricant, String mod, int any, int places, 
			String extres, String prov_matr, int num_matr, 
			String lletres_matr, float consum) {
	
		super(fabricant, mod, any, prov_matr, num_matr, 
				lletres_matr,consum);

		num_places = places;
		extres_comfort = extres;
	}

	public int getPlaces() {
		return(num_places);
	}

	public String getExtres() {
		return(extres_comfort);
	}

	public void afegirExtra(String extra) {
		extres_comfort = extres_comfort + ", " + extra;
	}
}