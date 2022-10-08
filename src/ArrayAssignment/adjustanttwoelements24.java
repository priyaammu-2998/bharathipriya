package ArrayAssignment;

public class adjustanttwoelements24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 7, 9, 10, 23, 87, 233, 333, 654 };   // we identify how many numbers difference
		int sum = 0;
		for (int i = 0; i < a.length - 1; i++) {
			sum = a[i + 1] - a[i];
			System.out.println(sum);
		}
		
		
		
		
		
		
	}

}
