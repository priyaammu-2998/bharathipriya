package methodcalling;

public class withoutinstance {

	void m1(int n) {

		System.out.println(n);
		n++;
		if (n <= 10) {

			m1(n);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		withoutinstance A = new withoutinstance();
		A.m1(1);

	}

}
