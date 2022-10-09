package Assignment;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=496;
		int sum=0;
		
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n) 
			System.out.println(n + " is perfect number" );
			else
			System.out.println(n+ " is not perfect number");
		}
		
			
		}
		
		
		


	


