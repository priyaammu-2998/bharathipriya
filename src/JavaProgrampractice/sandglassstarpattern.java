package JavaProgrampractice;

public class sandglassstarpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		int a=1;
		while(n>=1) {
		for(int i=1;i<=n;i++) {
			System.out.print(" *");
		}
		System.out.println();
		
		n--;
		}
		
		
		while(a<=5) {
		for(int i=1;i<=a;i++) {
			System.out.print(" *");
		}
		System.out.println();
		a++;
		}

	}

}
