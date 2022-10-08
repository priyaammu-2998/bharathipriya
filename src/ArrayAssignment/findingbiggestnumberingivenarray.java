package ArrayAssignment;

public class findingbiggestnumberingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,5,8,100,50,30};
		
		int biggest=100;               // int biggest=Integer.MIN_VALUE;
		
		int i=0;
		
		while(i<a.length)
		{
			if (a[i]>biggest)
			{
				biggest=a[i];
			}
			i++;
		}
			System.out.println("Biggest in the array is:" +biggest);
		}
		
		
		

	}


