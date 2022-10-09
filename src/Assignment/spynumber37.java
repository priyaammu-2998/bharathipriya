package Assignment;

public class spynumber37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=123;       //Given number is spy number 1+2+3=6  1*2*3=6
		int sum=0;
		int p=1;
		int t;
		
		while (n>0) {
			t=n%10;
			sum=sum+t;
			p=p*t;
			n=n/10;
			
		}
		if(sum==p)
		{
			System.out.println("Given number is spy number");
		}
		else {
			System.out.println("Givem number is not spy number");
		}
		
		

	}

}
