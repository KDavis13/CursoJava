
public class TestForBreak {

	public static void main(String[] args) {
		
		for (int i=0; i<100; i++) {
			System.out.print(i + " ");
			if (i == 10) {
				break;
			}
		}
	}
}
