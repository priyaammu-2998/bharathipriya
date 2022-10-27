package JavaProgrampractice;

public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 145;
		int copy = n;
		int sum = 0;

		while (n > 0) {
			int fact = 1;
			int a = n % 10;
			for (int i = 1; i <= a; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
			System.out.println(sum);
		}
		if (sum == copy)
			System.out.println("Given number is strong number");
		else
			System.out.println("Given number is not strong number");

	}
}