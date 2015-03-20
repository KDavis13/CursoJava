package vehiculos;

class Matricula {

	//declaraci� d'atributs
	protected String codi_provincia, lletres;
	protected int numeros;
	
	//declaraci� de m�todes
	Matricula(String codi, int nums, String lletr)
	{
		codi_provincia = codi;
		numeros = nums;
		lletres = lletr;
	}
	public String getProv�ncia()
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