package JavaProgrampractice;

public class oddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int row=4;
	    while(row>=1) {
		for(int i=5;i>=1;i--)
		{
			
		System.out.print(i);
			
		}
		System.out.println();
		row--;

	}*/
		
	/*	int n=1;
		
		while(n<=5)
		{
		  for(int i=1;i<=n;i++)
		  {
			System.out.print(i);
		  }
		   System.out.println();
            n++;
		}*/
		
	/*	int n=5;
		
		
		while(n>=1) {
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		n--;
		}
		*/
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
}}
