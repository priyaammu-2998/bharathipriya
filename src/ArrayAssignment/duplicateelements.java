package ArrayAssignment;

public class duplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.println("Duplicate elements in given array: ");

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] == a[j])
					
					System.out.println(a[j]);
			}

		}

	}
}
