package ArrayAssignment;

public class firsttwobiggest {

	public void findTwoMaxNumbers(int[] array) {

		int max1 = 0;
		int max2 = 0;
		for (int n : array) {

			if (max1 < n) {
				max2 = max1;         // swap
				max1 = n;
			} 
			else if (max2 < n) {
				max2 = n;
			}
		}
		System.out.println("First Max Number: " + max1);
		System.out.println("Second Max Number: " + max2);
	}

	public static void main(String[] args) {
		int n[] = { 10, 20, 45, 56, 90, 1 };
		firsttwobiggest a = new firsttwobiggest();
		a.findTwoMaxNumbers(n);

	}

}
