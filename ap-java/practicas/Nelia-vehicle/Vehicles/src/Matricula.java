
public class Matricula {
	private String codPro;
	private int numMat;
	private String lletresMat;
	public String getCodPro() {
		return codPro;
	}
	public int getNumMat() {
		return numMat;
	}
	public String getLletresMat() {
		return lletresMat;
	}
	public void setCodPro(String codPro) {
		this.codPro = codPro;
	}
	public void setNumMat(int numMat) {
		this.numMat = numMat;
	}
	public void setLletresMat(String lletresMat) {
		this.lletresMat = lletresMat;
	}
	
	
	public Matricula(String codPro, int numMat, String lletresMat) {
		this.codPro = codPro;
		this.numMat = numMat;
		this.lletresMat = lletresMat;
	}
	
	@Override public String toString(){
		String mat = this.codPro + "-"
				+ this.numMat + "-"
				+ this.lletresMat;
		return mat;
	}

}
