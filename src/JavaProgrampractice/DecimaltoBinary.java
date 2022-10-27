package JavaProgrampractice;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=10;
		int i=0;
		int b[]=new int [10];
		while(n>0) {
			b[i]=n%2;
			n=n/2;
			i++;
			
		}
		for(int j=b.length-1;j>=0;j--) {
			System.out.print(b[j]);
		}
		

	}

}
