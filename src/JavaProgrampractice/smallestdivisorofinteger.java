package JavaProgrampractice;

public class smallestdivisorofinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=25;
		int i=2;
		while(i<=n/2) {
			if(n%i==0)
				System.out.println(i);
			i++;
		}
		
		
	}

}
