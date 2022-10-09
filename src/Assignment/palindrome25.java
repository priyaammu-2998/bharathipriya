package Assignment;

public class palindrome25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=757;
		int a=num;
		int reverse=0;
		
		while(num>0)
		{
			int remainder=num%10;
			num=num/10;
			reverse=reverse*10+remainder;
		}
		System.out.println(reverse);
		
		if (a==reverse)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("not a palindrome number");
		}

	}

}
