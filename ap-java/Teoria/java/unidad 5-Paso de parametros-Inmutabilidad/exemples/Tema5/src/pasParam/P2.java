package pasParam;

public class P2 {

	static void f(int x[]) {
		x[3] = 0;
		x = new int[8];
		x[3] = 5;
	}

	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };
		System.out.println(a[3]);
		f(a);
		System.out.println(a[3]);
	}
}
