package oops;

public class oopsfibonacci {
	
	int a;
	int b=-1;      
	 int c=1;
	
	 void fibo() {
	
	for (int i=1;i<=7;i++)
	{
		a=b+c;
		System.out.println(a);
	
		b=c;
		c=a;
	
	}}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		oopsfibonacci f1=new oopsfibonacci();
		f1.a=7;
		
		f1.fibo();
				
		
		
	}
	}


