package oops;

public class oopsfactorial {
	
	int fact=1;
	int a;
	void fact() {	
	
		for(int i=1;i<=a;i++) {

		fact=fact*i;
	}
	System.out.println(fact); }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		oopsfactorial f1=new oopsfactorial();
		f1.a=5;
		f1.fact();
	
		
		
		
		

	}

}
