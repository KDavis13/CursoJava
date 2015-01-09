class Vehicle {

	//declaraci� d'atributs
	protected String marca, model, matr�cula;
	protected int any_compra;
	protected float consum_per_km;

	//declaraci� de m�todes
	Vehicle(String fabricant, String mod, int any, String prov_matr, int num_matr, String lletres_matr, float consum)
	{
		marca = fabricant;
		model = mod;
		any_compra = any;
		matr�cula = prov_matr + '-' + num_matr + '-' + lletres_matr;
		consum_per_km = consum;
	}

	public String getMarca()
	{
		return(marca);
	}
	public String getModel()
	{
		return(model);
	}
	public int getAny()
	{
		return(any_compra);
	}
	public String getMatr�cula()
	{
		return(matr�cula);
	}
	public float getConsum()
	{
		return(consum_per_km);
	}
	public float calculaKmAutonomia(int litres_combustible)
	{
		return ( (float) litres_combustible / consum_per_km );
	}
}