public class Fibunachi {

	public static void main(String[] args) {

		//for (int i = 1; i < 48; i++)
			//System.out.println(fibschleife(i));
			//System.out.println(pot(2,15));
			System.out.println(fak(5));
			
	}

	// ohne Rekursion //
	public static int fibschleife(int x) {
		int v = 1;
		int vv = 1;
		int z = 1;

		if (x == 1)
			return 1;
		else if (x == 2)
			return 1;
		for (int i = 0; i < x - 2; i++) {
			z = v + vv;
			vv = v;
			v = z;
		}
		return z;

	}
		// Rekursives Rechnen Addieren//
	public static int sum(int a, int b) {
		if (b == 0)	return a;
		return sum(a + 1, b - 1);
	}
	// Rekursives Rechnen Multiplizieren ohne mal//
	public static int mul(int a, int b) {
		if (b == 0)	return 0;
		return sum(a, mul (a,b - 1));
	}
	// Rekursives Rechnen Potenzieren ohne pot//
		public static int pot(int a, int b) {
			if (b == 0)	return 1;
			return mul(pot(a, b - 1),a);
	}
	// Rekursives Berechnen Fakultät//
		public static int fak(int a) {
			if (a == 1)	return 1;
			return mul(fak(a - 1),a);
	}
	

}

// Mit Rekursion //
// public static int fib(int x){

// if (x==1) return 1;
// else if (x==2) return 1;
// else return fib(x-1) + fib (x-2);

// }