package bharathi;

public class differencearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,4,8,9};
		int c=0;
		
		for (int i=0;i<a.length-1;i++)
		{
			c=a[i]-a[i+1];
			System.out.println(-c);
		}
		
		
		
	}

}
