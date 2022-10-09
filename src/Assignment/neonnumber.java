package Assignment;

public class neonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9;                  // neon number 9*9=81  8+1=9
		int sum=0;
		int s=n*n;
		while(s!=0)
		{
			int t=s%10;
			sum=sum+t;
			s=s/10;
			
		}
		if(n==sum)
		{
			System.out.println("Given number is neon number");
		}
		else
		{
			System.out.println("Given number is not neon number");
		}
		
		
		
		

	}

}
