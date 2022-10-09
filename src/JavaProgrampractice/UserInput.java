package JavaProgrampractice;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int a=0;
		System.out.println("Please enter the Number");
		
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		
		if(n>a) {
			System.out.println("Given number is Positive");
		}
		else
			System.out.println("Given number is Negative");
		

	}

}
