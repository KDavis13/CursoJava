package exemple02;

import java.util.Arrays;

public class Invariante {
	
	public static void main(String [] args) {
		
		int[] vector = new int[10];
		System.out.println(Arrays.toString(vector));
		
		Api.metode1(vector);
		Api.metode2(vector);
	}

	
}
