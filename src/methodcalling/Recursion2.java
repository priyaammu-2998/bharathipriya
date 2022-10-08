package methodcalling;

public class Recursion2 {

	int n = 2;

	void m1() {
		System.out.println(n);
		n++;
		if (n <= 5) {
			m1();
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Recursion2 p=new Recursion2();
    p.m1();
	}

}
