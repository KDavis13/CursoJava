class Matricula {

	//declaraci� d'atributs
	protected String codi_prov�ncia, lletres;
	protected int n�meros;
	
	//declaraci� de m�todes
	Matricula(String codi, int nums, String lletr)
	{
		codi_prov�ncia = codi;
		n�meros = nums;
		lletres = lletr;
	}
	public String getProv�ncia()
	{
		return(codi_prov�ncia);
	}
	public String getLletres()
	{
		return(lletres);
	}
	public int getNums()
	{
		return(n�meros);
	}
	public String toString()
	{
		return(codi_prov�ncia + '-' + n�meros + '-' + lletres);
	}
}