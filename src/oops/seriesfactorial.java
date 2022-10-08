package oops;

public class seriesfactorial {
	
	int fact (int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		seriesfactorial f=new seriesfactorial();
		
		for(int i=1;i<5;i++)
		{
			int a=f.fact(i);
					System.out.println(a);
		}
		
		
		
		
		
		
		

	}

}
