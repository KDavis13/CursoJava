class Matricula {

	//declaració d'atributs
	protected String codi_província, lletres;
	protected int números;
	
	//declaració de mètodes
	Matricula(String codi, int nums, String lletr)
	{
		codi_província = codi;
		números = nums;
		lletres = lletr;
	}
	public String getProvíncia()
	{
		return(codi_província);
	}
	public String getLletres()
	{
		return(lletres);
	}
	public int getNums()
	{
		return(números);
	}
	public String toString()
	{
		return(codi_província + '-' + números + '-' + lletres);
	}
}