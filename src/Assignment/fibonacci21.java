package Assignment;



public class fibonacci21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a,b=-1;       // fibonacci series 0 1 1 2 3 5 8
		 int c=1;
		
		
		for (int i=1;i<=7;i++)
		{
			a=b+c;
			System.out.println(a);
		
			b=c;
			c=a;
		}
					
			
		
		
		

	}

}