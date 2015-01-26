package enumSingleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.INSTANCIA;
		
		System.out.println(singleton.getRandom());
		System.out.println(singleton.getRandom());
		System.out.println(singleton.getRandom());

	}

}
