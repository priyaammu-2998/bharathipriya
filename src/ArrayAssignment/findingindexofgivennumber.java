package ArrayAssignment;

public class findingindexofgivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50};   // 0 1 2 3 4
		
		int key=30;      // linear search array
		
		
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i]) {
				System.out.println(key + "present at position:" +i);
				
				
			}
			else                                                       
			System.out.println(key +"not present position:"+i);
			}	
		}
		}

	 


