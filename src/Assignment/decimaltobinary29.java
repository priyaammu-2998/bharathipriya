package Assignment;

public class decimaltobinary29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int a=20,i=0;
		
		int b[]=new int [10];	
		while (a>0)
		{
			b[i]=a%2;
			System.out.print(b[i]);
			a=a/2;
			i++;
			
		}
		
		
	}

}
