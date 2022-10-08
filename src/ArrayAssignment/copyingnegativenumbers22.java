package ArrayAssignment;

public class copyingnegativenumbers22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 1, -2, 3, -4, 5, -6, 7, -8 };
		int b[] = new int[a.length - 1];
		for (int i = 0; i < a.length-1 ; i++) {
			if (a[i] < 0) {
				b[i] = a[i];
				System.out.println(b[i]);
			}
		}
	}}

	
