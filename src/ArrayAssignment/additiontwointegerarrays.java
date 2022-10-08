package ArrayAssignment;

public class additiontwointegerarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 1, 2, 3, 4, 5 };   
		int b[] = { 1, 2, 3, 4, 5 };        // 1+1=2,2+2=4,3+3=6,4+4=8,5+5=10
		int sum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum = a[i] + b[i];
			System.out.println(sum);
		}

	}

}
