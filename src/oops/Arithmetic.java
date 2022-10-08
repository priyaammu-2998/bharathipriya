package oops;

public class Arithmetic {
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	void mul(int a,int b)
	{
		int c=a*b;
	 System.out.println(c);
	}
	void div(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic a=new Arithmetic();
		a.add(5,0);
		a.add(6,2);
		a.sub(7,8);
		a.sub(3,5);
		a.mul(2,3);
		a.mul(3,5);
		a.div(1,2);
		a.div(2,3);
	}

}
