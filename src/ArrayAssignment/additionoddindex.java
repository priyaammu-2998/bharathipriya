package ArrayAssignment;

public class additionoddindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 3, 40, 5,30}; // 0 1 2 3 4 5

		int sum = 0;

		for (int i = 1; i < a.length; i +=2) {   //20+40+30=90
			sum = sum + a[i];
		}

		System.out.println("Total of odd index number is:" + sum);

	}

}
