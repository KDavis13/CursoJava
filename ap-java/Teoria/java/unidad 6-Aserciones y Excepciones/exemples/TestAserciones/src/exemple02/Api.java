package exemple02;

public class Api {
	
	public static void metode1(int[] v) {
		for (int i=0; i<10; i++) { // condición ok 
			assert i<10 : i;
			v[i] = i;
			System.out.print(v[i] + ", ");
		}		
	}
	
	public static void metode2(int[] v) {
		for (int i=0; i<=3; i++) { // condición errónea 
			assert i<3 : i;
			v[i] = i;
			System.out.print(v[i] + ", ");
		}		
	}
}
