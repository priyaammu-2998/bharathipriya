package JavaProgrampractice;

import java.util.Scanner;

public class UserInputGreatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b)
			if(a>c)
				System.out.println(a + "is greter");
        if(b>a)
        	if(b>c)
        		System.out.println(b + " is greater");
        if(c>a)
        	if(c>b)
        		System.out.println(c + " is greater");
	}

}
