package JavaProgrampractice;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 12;
		int n2 = 30;
		int min;

		min = n1 < n2 ? n1 : n2;
		while (min >= 2) {
			if (n1 % min == 0 && n2 % min == 0) {
				System.out.println(min);
			}
			min--;

		}

	}
}
