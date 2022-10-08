package methodcalling;

public class withoutinstancefactorial {

	int fact(int n) {
		if (n > 1) 
		{
			int f = fact(n - 1);
			return n * f;
		} 
		else {
			return 1;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		withoutinstancefactorial a= new withoutinstancefactorial();
		
		System.out.println(a.fact(5));

	}

}
