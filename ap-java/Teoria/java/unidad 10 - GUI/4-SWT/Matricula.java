package vehiculos;

class Matricula {

	//declaració d'atributs
	protected String codi_provincia, lletres;
	protected int numeros;
	
	//declaració de mètodes
	Matricula(String codi, int nums, String lletr)
	{
		codi_provincia = codi;
		numeros = nums;
		lletres = lletr;
	}
	public String getProvíncia()
	{
		return(codi_provincia);
	}
	public String getLletres()
	{
		return(lletres);
	}
	public int getNums()
	{
		return(numeros);
	}
	public String toString()
	{
		return(codi_provincia + '-' + numeros + '-' + lletres);
	}
}