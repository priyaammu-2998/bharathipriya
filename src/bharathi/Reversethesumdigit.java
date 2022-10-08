package bharathi;

public class Reversethesumdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=7589,t,reverse=0;
		t=num;
		while(num>0){
			t=num%10;
			reverse=(reverse*10)+t;
			}
		System.out.println(reverse);
		
	}

}
