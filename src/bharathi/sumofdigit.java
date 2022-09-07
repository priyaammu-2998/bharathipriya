package bharathi;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=9857;
		 int sum=0;
		 while(num>0)
		{
			int r=num%10;
			System.out.println(r);
			sum=sum+r;
			num=num/10;
		}
		System.out.println("sum of the digit = "+sum);
	}

}
