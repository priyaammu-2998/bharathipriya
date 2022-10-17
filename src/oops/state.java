package oops;

public class state {

	String name;
	static String country = "India";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		state tn=new state();
		tn.name="Tamilnadu";
		tn.print();
		
		state kr =new state();
		kr.name="kerala";
		kr.print();
	}
		static void print()
		{
			System.out.println(country);
		}
		
		
	}


