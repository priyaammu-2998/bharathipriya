package methodcalling;

public class withoutinstance2 {

	void m1(int n) {              //localvariable
		System.out.println(n);
		n++;
		if (n <= 5) {
			m1(n);
		}
		System.out.println(n);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   withoutinstance2 a=new withoutinstance2 ();
   a.m1(1);
   
	}

}
