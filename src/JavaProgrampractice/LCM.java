package JavaProgrampractice;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 3;
		int n2 = 5;
		int max;
		int lcm;

		max = n1 > n2 ? n1 : n2;
		while (true) {
			if (max % n1 == 0 && max % n2 == 0) {
				lcm = max;
				break;

			}
			max++;
		}
		System.out.println(lcm);

	}

}
