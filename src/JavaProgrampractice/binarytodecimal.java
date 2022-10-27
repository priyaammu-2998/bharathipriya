package JavaProgrampractice;

public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int binary = 1010;
		int decimal = 0;
		int a = 0;
		int i = 0;
		while (binary > 0) {
			a = binary % 10;

			decimal = (int) (decimal + (a * Math.pow(2, i)));
			binary = binary / 10;
			i++;
		}
		System.out.println(decimal);

	}

}
