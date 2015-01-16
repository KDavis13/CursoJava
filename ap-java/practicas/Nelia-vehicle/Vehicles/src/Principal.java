
public class Principal {

	public static void main(String[] args) {
		
		double carburant = 30.5F;
		Vehicle v2 = new Vehicle("Opel","Corsa",2014,"zz",4546,"HBJ",3.2F);
		
		System.out.println(v2.autonomia(carburant));
	}
}
