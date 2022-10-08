package methodcalling;

public class Instancevariablefactorial {

	int a = 1;

	int fact = 2;

	void m1() {
		fact = fact * a;
		System.out.println(fact);

		a++;

		if (a <= 5) {
			m1();
			//System.out.println();

		}
		

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Instancevariablefactorial a = new Instancevariablefactorial();
		a.m1();

	}

}
