package oops;

public class classA {

	int max(int a, int b, int c) {
		int p=0;
		if ((a >b) && (a>c)) {
			 p=a;
			}
		 if((b>a) && (b>c)) {
			p=b;
		}
		 else if((c>a)&&(c>b)) {
			p=c;
		}

		return p;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classA a=new classA();
				int m=a.max(70,50,10);
				System.out.println(m);
		

	}

}
