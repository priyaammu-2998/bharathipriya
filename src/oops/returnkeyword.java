package oops;

public class returnkeyword {
	
	void print (int k)        // No return value
	{
		System.out.println(k);
	}
	int give ()                 // return value
	{
		int a=6,b=5;
		int c=a+b;
		
		return c;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		returnkeyword a=new returnkeyword();
		a.print(5);
		int x=a.give();
		
		System.out.println(x);
		

	}

}
