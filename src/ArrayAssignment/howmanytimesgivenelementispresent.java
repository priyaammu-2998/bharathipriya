package ArrayAssignment;

public class howmanytimesgivenelementispresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int a[]= {1,2,3,4,5,5,5,5,6,7,8,9,10};
		
		int element=5;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(element==a[i])
				count++;
		}
		System.out.println("Repeat in element:" +count +"times");
		

	}

}
