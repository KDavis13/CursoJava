
public class Principal {

	public static void main(String[] args) {
		
		Vehiculo veh = new Vehiculo("Seat", "León", 2001, "B", 5236, "DF", 3f);
		/*Scanner sc = new Scanner(System.in);*/
		
		String miCoche = "Mi coche es: " + veh.getMarca() + " " + veh.getModelo() + " con matricula " + veh.getMatricula();
		
		System.out.println(miCoche + " que consume " + veh.calculoConsumo(1) + " litros cada km.");
		
		/*System.out.println("\nIntroduce litros para saber cuanto andará mi coche");
		
		String litros = sc.nextLine();
		
		float consumoTotal = veh.calculoConsumo(parseFloat(litros));*/
		
		

	}

}
