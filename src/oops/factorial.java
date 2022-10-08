package oops;

public class factorial {

	int fact(int n) // sum of two factorial
	{
		int f = 1;
		for (int i = 1; i <=n; i++) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		factorial p=new factorial();
		int a=p.fact(4);
		System.out.println(a);
		int b=p.fact(5);
		System.out.println(b);
		
		System.out.println(a+b);
		
		
		

	}

}
