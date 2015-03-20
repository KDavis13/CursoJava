package gestioPeticions;


import main.Config;
import main.Data;

public class Agenda {

	private final int HORES=24;
	private int maxDies;
	private int any;
	private int mes;
	private String tiposActivitatReserva;	
	private String[][] arrayDiesHores;
	private String nomSala;
	
	public Agenda(Config config, String nomSala) {
		
		this.any = config.getAnyo();
		this.mes = config.getMes();
		Data data = new Data(any,mes);
		this.maxDies =data.getDias();
		this.nomSala= nomSala;
		
		crearCalBuit();
	}
	
	

	public String getNomSala() {
		return nomSala;
	}



	public void setNomSala(String nomSala) {
		this.nomSala = nomSala;
	}



	private String[][] crearCalBuit() {
		
		
		/** int[dies][24h] **/
		this.arrayDiesHores= new String [maxDies][HORES]; // array amb el numero
														// de dies i numero
														// d'hores del mes

		for (int i = 0; i < this.arrayDiesHores.length; i++) {

			for (int j = 0; j < this.arrayDiesHores[i].length; j++) {

				this.arrayDiesHores[i][j] = "free";
			}			
		}

		return this.arrayDiesHores;
	}
	
	public void imprimirCalendari(){
		

		for (int i = 0; i < this.arrayDiesHores.length; i++) {

			for (int j = 0; j < this.arrayDiesHores[i].length; j++) {
				
				System.out.print(this.arrayDiesHores[i][j] + "-");

			}
			System.out.println();
		}
		
	}
	
	public boolean comprovarDisponibilitat(int dia, int hora, String tiposActivitatReserva) {
		
		boolean disponible=false;
		dia--;
		
		if ((this.arrayDiesHores[dia][hora]=="free")||(this.arrayDiesHores[dia][hora]==tiposActivitatReserva)){
			disponible=true;
		}
				
		return disponible;
		
	}
	
//	public void reservarDiaHoraGeneric(Peticio p) {		
//		
//		this.arrayDiesHores[0][1]="ocupat";
//	}
//	
	
	public void reservarDiaHora(int dia, int hora, String reserva) {
	//  com l'array comença desde 0 i el dia el passem normal, el resto abans d bucar-lo a l'array
		dia--;														
		this.arrayDiesHores[dia][hora]=reserva;
	
	}
	
	public String[][] getArrayDiesHores() {
		return arrayDiesHores;
	}

	
		
}
