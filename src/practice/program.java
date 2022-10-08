package practice;

public class program {

	int n; 

	program(int n)
	{
		this.n = n;
	}

	void m1() 
	{
		n++;
		m2();
	}

	void m2() {
		n++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		program p1=new program(5);
		p1.m1();
		System.out.println(p1.n);
		
		
		

	}

}
