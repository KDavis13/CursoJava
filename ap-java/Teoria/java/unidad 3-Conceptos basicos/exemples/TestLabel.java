
public class TestLabel {

	public static void main(String[] args) {
		
		extern:
		for (int j = 0; j <3; j++) {
			
			System.out.print(j + " ");
			
			for (int i=0; i<100; i++) {			
				if (i % 2 == 0) {
					continue extern;
				}
				System.out.print(i + " ");
			}
			
			System.out.println("...");
		}
	}

}
