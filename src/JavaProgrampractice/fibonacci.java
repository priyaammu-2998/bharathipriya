package JavaProgrampractice;

public class fibonacci {

	public static void main(String[] args) {

		int no1 = 0;
		int no2 = 1;
		int no3 = 0;
		int PrimeNumber;
		System.out.println("Fibonacci series Primes NUmbers");

		for (int i = 1; i <= 20; i++) {
			no3 = no1 + no2;

			int count = 0;
			for (int j = 1; j <= no3; j++) {
				if (no3 % j == 0) {
					count++;

				} // bending
			}
			no1 = no2;
			no2 = no3;
			if (count == 2) {
				
				System.out.println(no3);

			}

		}
	}
}
