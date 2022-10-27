package JavaProgrampractice;

public class spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 123;                       // sum=  1+2+3=6   multiplication= 1*2*3=6
		int lastdigit;
		int sum = 0;
		int multi = 1;

		while (n > 0) {
			lastdigit = n % 10;

			sum = sum + lastdigit;
			multi = sum * lastdigit;
			n=n/10;
		}
		if(sum==multi) 
			System.out.println("Given number is spy number");
			else
				System.out.println("Given number is not spy number");
		}

	}


