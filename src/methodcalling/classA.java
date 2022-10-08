package methodcalling;

public class classA {

	int n = 1;

	void m1() {
		System.out.println(n);
		n++;
		if(n<=10)
		{
		m1();                              
	}}

	void m2() {
		System.out.println(n);
		n++;
		m3();
      // System.out.println("Hello");
	}

	void m3() {
		System.out.println(n);
		n++;
		m4();
	}

	void m4() {
		System.out.println(n);
		n++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classA s=new classA();
		s.m1();
		

	}

}
