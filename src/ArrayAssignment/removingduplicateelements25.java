package ArrayAssignment;

public class removingduplicateelements25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = { 1, 2, 3, 2, 2, 2, 4, 5, 5, 5, 6, 7, 8, 8, 9 };
		int i = 0;
		int j = 0;
		int count = 0;
		int b[] = new int[a.length];
		for (i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("remove duplicate element");
		for (i = 0; i < a.length; i++) {
			count = 0;
			for (j = 0; j < a.length; j++) {
				if (a[i] == b[j])
					count++;
			}
			if (count <= 1)
				System.out.println(a[i]);
		
		
		

	}

}}
