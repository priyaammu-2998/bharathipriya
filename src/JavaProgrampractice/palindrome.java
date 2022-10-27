package JavaProgrampractice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 757;

		int copy = num;
		int sum = 0;

		while (num > 0) {
			int a = num % 10;
			sum = sum *10+ a;
			num = num / 10;

		}
		System.out.println(sum);

		if (sum == copy)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
	}

}
