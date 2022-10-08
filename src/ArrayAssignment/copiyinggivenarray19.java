package ArrayAssignment;

public class copiyinggivenarray19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8}; //0 1 2 3 4 5 6 7(index)
		int i=0;
		int j=a.length-1;                     //7
		int b[]=new int [a.length];
		for(i=0;i<a.length;i++) {
			b[i]=a[j];
			j--;
			System.out.println(b[i]);
		}		
		
		
		
		
		

	}

}
