package pattern;

public class numbertriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		
		int n=4;
		int p=1;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(p++  + " ");
			}
			System.out.println();
		}

	}

}
