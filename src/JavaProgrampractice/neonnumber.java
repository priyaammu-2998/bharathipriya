package JavaProgrampractice;

public class neonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		int copy = n;
		int sum = 0;
		while (n > 0) {
			int a = n % 10;

			sum = sum + a;
			n = n / 10;

		}
		System.out.println(sum);
		if(sum==copy)
			System.out.println("Given number is neon number");
		else
			System.out.println("given number is not neon number");

	}

}
