package vehiculos;

import java.util.Vector;

public class Vehicle2 {

	//declaració d'atributs
	protected String marca, model;
	protected Matricula matricula;
	protected int any_compra;
	protected float consum_per_km;
	
	protected static Vector<Vehicle2> v =
		new  Vector<>();
	
	public static java.util.Vector<Vehicle2> getVehicles() {
		return v;
	}
	
	private static void afegirVehicleAvector(Vehicle2 vehicle) {
		v.addElement(vehicle);
	}

	//declaració de mètodes
	public Vehicle2(String fabricant, String mod, int any, String prov_matr, int num_matr, String lletres_matr, float consum)
	{
		marca = fabricant;
		model = mod;
		any_compra = any;
		matricula = new Matricula (prov_matr, num_matr, lletres_matr);
		consum_per_km = consum;
		
		afegirVehicleAvector(this);				
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
	public String getMatrícula()
	{
		return(matricula.toString());
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