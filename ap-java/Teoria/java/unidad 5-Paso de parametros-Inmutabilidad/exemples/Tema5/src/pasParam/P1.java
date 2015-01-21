package pasParam;

class CuentaBancaria {
	long numero, saldo;
	String titular;
}

public class P1 {

	static void arruinar(CuentaBancaria c) {
		c.saldo = 0;
	}

	public static void main(String[] args) {
		CuentaBancaria ct = new CuentaBancaria();
		ct.saldo = 100000;
		System.out.println(ct.saldo);
		arruinar(ct);
		System.out.println(ct.saldo);
	}
}
