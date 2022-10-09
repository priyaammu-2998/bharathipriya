package Assignment;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=153;         // Amstrong number 1*1*1=1  5*5*5=125  3*3*3=27    1+125+27=153
		int number=0;
		int p=0;
		int total=0;
		number=n;
		
		while (number!=0)
		{
			p=number%10;
			total=total+p*p*p;
			number=number/10;
		}
		if(total==n)
		{
			System.out.println("Given number is Amstrong number");
		}
		else
		{
			System.out.println("Given number is not Amtrong number");
		}
		
		
		
		

	}

}
