package oops;

public class mark {
	
	int m1,m2,m3,m4,m5;
	
	
	void call() {
		System.out.println(m1+m2+m3+m4+m5);
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	mark s1=new mark();
	s1.m1=90;
	s1.m2=50;
	s1.m3=83;
	s1.m4=95;
	s1.m5=100;
	s1.call();
	
	mark s2 =new mark();
	s2.m1=40;
	s2.m2=45;
	s2.m3=89;
	s2.m4=70;
	s2.m5=56;
	s2.call();
	
	

	}

}
