package methodcalling;

public class fibonaccirecursion {

	int f = 1; // fibonacci series 0 1 1 2 3 5 8
	int n = 0;

	void m1() {

		System.out.println(n);
		f = f + n;
		n = f - n;
		if (n <= 10) {
			m1();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibonaccirecursion a = new fibonaccirecursion();
		a.m1();

	}

}
