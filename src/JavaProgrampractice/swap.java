package JavaProgrampractice;

//import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		for (int i = 2; i <= 20; i++) {
			boolean flag=true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag=false;
				}

			}
			if (flag) {
				System.out.println(i);
			}
		}

	}
}