package JavaProgrampractice;

public class multipleofthreewithoutusingoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12;
		
		boolean flag=true;
		
		for(int i=3;i<=n;i+=3) {
			if(n==i) {
				System.out.println("Multiple of three");
				flag=false;
			}
		}
			if(flag)
				System.out.println("Not multiple of three");
		

	}

}
