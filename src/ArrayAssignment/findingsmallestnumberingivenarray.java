package ArrayAssignment;

public class findingsmallestnumberingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 5, 8, 100, 50, 15, 30 };

		int smallest = 5;

		int i = 0;

		while (i < a.length) {
			if (a[i] < smallest) {
				smallest = a[i];
			}
			i++;
		}
		System.out.println("Smallest in the array is:" + smallest);
	}

}
