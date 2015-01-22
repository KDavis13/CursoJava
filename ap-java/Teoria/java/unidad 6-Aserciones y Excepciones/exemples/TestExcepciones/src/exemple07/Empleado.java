package exemple07;

public class Empleado {
	private String nom;
	private int salari;

	public Empleado(String nom, int salari) {
		this.nom = nom;
		this.salari = salari;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSalari() {
		return salari;
	}

	public void setSalari(int salari) {
		this.salari = salari;
	}

	@Override
	public String toString() {
		return "Empleado [nom=" + nom + ", salari=" + salari + "]";
	}
		
}
