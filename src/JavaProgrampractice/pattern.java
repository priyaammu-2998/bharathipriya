package JavaProgrampractice;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int n=5; while(n>=1) {
		 * 
		 * 
		 * for(int i=1;i<=n;i++) { System.out.print(i); } System.out.println(); n--; }
		 */

		/*
		 * int n=1; while(n<=5) {
		 * 
		 * for(int i=1;i<=n;i++) { System.out.print(i); } System.out.println(); n++; }
		 */
		int n = 1;

		while (n <= 5) {
			for (int i = 5; i >= n; i--) {
				System.out.print(i);
			}
			System.out.println();
		    n++;
		}

	}
}
