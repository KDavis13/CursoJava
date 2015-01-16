
public class Vehicle2 {
	
	private String marca;
	private String model;
	private int any;
	private Matricula matricula;
	/*private String prov_matr;
	private int num_matr;
	private String lletres_mat;*/
	private double consum;
	
	public Vehicle2(String mar, String mod, int any, String prov_matr,int num_matr, String lletres_matr, double con){
		this.marca = mar;
		this.model = mod;
		this.any = any;
		this.matricula = new Matricula(prov_matr, num_matr,lletres_matr);
		
		this.consum = con;
	}

	public static void main(String[] args) {
		//Vehicle2 v1 = new Vehicle2("Opel","Corsa",2013,"BA",4546,"HVJ",5.2F);
		Vehicle2 v1 = new Vehicle2(args[0],args[1],Integer.valueOf(args[2]),
				args[3],Integer.valueOf(args[4]),args[5],Float.valueOf(args[6]));
		System.out.println(v1.autonomia(Float.valueOf(args[7])));
		System.out.println(v1);
	}
	
	@Override
	public String toString() {
		return "Vehicle2 [marca=" + marca + ", model=" + model + ", any=" + any
				+ ", matricula=" + matricula + ", consum=" + consum + "]";
	}

	public double autonomia(double lt){
		return lt / this.consum;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public int getAny() {
		return any;
	}

	public Matricula getMatricula() {
		return matricula;
	}
/*
	public String getProv_matr() {
		return prov_matr;
	}

	public int getNum_matr() {
		return num_matr;
	}

	public String getLletres_mat() {
		return lletres_mat;
	}
*/
	public double getConsum() {
		return consum;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setAny(int any) {
		this.any = any;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
/*
	public void setProv_matr(String prov_matr) {
		this.prov_matr = prov_matr;
	}

	public void setNum_matr(int num_matr) {
		this.num_matr = num_matr;
	}

	public void setLletres_mat(String lletres_mat) {
		this.lletres_mat = lletres_mat;
	}
*/
	public void setConsum(double consum) {
		this.consum = consum;
	}
	
}
