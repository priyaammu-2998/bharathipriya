package pattern;

public class hollownumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4, p=n;
		
		for (int i=1;i<=n;i++) {
		
			for(int j=i;j<n;j++) {
				
				if(j==i||i==1) 
					System.out.print(j + " " );
					
				
				else {
					System.out.print("  ");   // 2 space
				}
				
			}                                           
			for(int j=p;j>n-i;j--) {
				
				if (i==n ||i+j==n+1)
					System.out.print(j + " ");
				else 
					System.out.print("  ");        // 2 sapce
				
				
		}
			System.out.println();

	}

	}
}