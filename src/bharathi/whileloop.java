package bharathi;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=7589;
		int reverse=0;
		int check=num;
		int r;
		while (num>0)
		{
			r =num%10;
			reverse=(reverse*10)+r;
			num=num/10;
		}
		System.out.println(reverse);
		
		
		if(check==reverse)
		System.out.println("given no is palindrom");
		else
			System.out.println("given no is no palindrom");
	}

}
