package Assignment;

public class smallestdivisor26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=15;
		int i=2;
		
		while(i<=n/2)
		{
			if (n%i==0)
				System.out.println(i);
			i=i+1;
		}

	}

}
