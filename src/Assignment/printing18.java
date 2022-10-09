package Assignment;

public class printing18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5! 4! 3! 2! 1!

		for (int i = 5; i > 0; i--) {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact = fact * j;

			}
			System.out.println(fact);

		}

	}
}