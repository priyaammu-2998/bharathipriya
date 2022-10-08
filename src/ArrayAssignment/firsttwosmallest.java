package ArrayAssignment;

public class firsttwosmallest {

	public static void main(String[] args) {
		
		int a[]= {10,20,5,30,2,40,3};
		
		int small=Integer.MAX_VALUE;
		
		int i=0;
		
		while(i<a.length)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			i++;
			                                                            // bending
		}
		System.out.println("Fist smallest number:" + small);
		
	
		
		
		

	}

}
