package ArrayAssignment;

public class movingallelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50 };

		int t = a[0];
		int i = 0;
		while (i < a.length - 1) {
			a[i] = a[i + 1];
			i = i + 1;
		}
		a[i] = t;

		System.out.println("After left shift");

		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}

	}

}
