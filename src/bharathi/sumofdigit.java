package bharathi;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=9578;
		 int sum=0,b;
		 
		 
		 while(num>0)
		{
			int r=num%10;
			System.out.println(r);
			sum=sum+r;
			num=num/10;
			
			System.out.println("sum of the digit"+sum);
			
		
		 
		 while (sum>10)
			{
				b=sum%10;
				sum=sum/10;
				sum=sum+b;
				
				
			}
		 System.out.println(sum);
		 
		 
	}}
	
	}
	
		
		
		
		
		
		
		
		
	


