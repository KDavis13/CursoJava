package pasParam;

public class TestStringInmutable2 {
	public static void main(String[] args) {		
		String nom1 = "Antonio";		
		String nom2 = nom1;
		
		nom1 = "Paco";
				
		System.out.println("nom2: " + nom2);
	}

}
