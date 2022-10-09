package JavaProgrampractice;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		a = sc.nextInt();

		System.out.println("Enter the second number");
		b = sc.nextInt();
		char operator;

		System.out.println("Enter the character +,-,*,/ or % :");
		operator = sc.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case '-':
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case '*':
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		case '/':
			System.out.println(a + "/" + b + "=" + (a / b));
			break;
		case '%':
			System.out.println(a + "%" + b + "=" + (a % b));
			break;
		default:
			System.out.println("You have enter the wrong operator");

		}

	}
}