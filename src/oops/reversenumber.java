package oops;

public class reversenumber {

	int reverse(int p) {

		int t = 0;
		int s = 0;
		while (p > 0) {
			t = p % 10;       // t=7
			s = (s * 10) + t;  // 0*10=0  ,  0+7=7
			p = p / 10; // 56/10
		}

		return s;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reversenumber a=new reversenumber();
		int v=567;
		int x=a.reverse(v);
		System.out.println(x);
		
		
		
		
		

	}

}
