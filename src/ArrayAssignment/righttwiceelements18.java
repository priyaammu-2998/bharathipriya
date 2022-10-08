package ArrayAssignment;

public class righttwiceelements18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5};
		int n = 2; 
		for (int k = 0; k < n; k++) {

			int i = a[0];
			for (int t = 0; t < a.length - 1; t++) {
				a[t] = a[t + 1];
			}
			a[a.length - 1] = i;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

	}

}
