package oops;

public class largestarraynumber {

	int largest(int a[]) {
		int p = 0;
		for (int i = 0; i < a.length; i++) {

			if (p < a[i]) {

				p = a[i];
			}

		}

		return p;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		largestarraynumber a = new largestarraynumber();
		int k[] = { 5, 6, 7, 8, 10, };
		int t[] = { 10, 20, 40, 50 };
		int x = a.largest(t);
        int s = a.largest(k);                // stored
		System.out.println(s);
		System.out.println(x);

	}

}
