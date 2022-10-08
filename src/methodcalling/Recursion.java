package methodcalling;

public class Recursion {

	int n = 2;

	void m1() {
		System.out.println(n);
		n += 2;
		if (n <= 10) {
			m1();
			

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion a = new Recursion();
		a.m1();

	}

}
