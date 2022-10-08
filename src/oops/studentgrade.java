package oops;

public class studentgrade {

	int rollno;
	String name;
	int mark;
	char grade;

	void setGrade() {

		if (mark < 100 && mark > 91) {
			System.out.println("A");
		}
		if (mark <= 90 && mark > 81) {
			System.out.println("B");
		}
		if (mark <= 80 && mark > 71) {
			System.out.println("C");
		}
		if (mark <= 70 && mark > 61) {
			System.out.println("D");
		}
		if (mark <= 60 && mark > 51){
			System.out.println("E");
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentgrade s1 = new studentgrade();
		s1.rollno = 100;
		s1.name = "Priya";
		s1.mark = 70;
		s1.setGrade();
		System.out.println(s1.grade);

		studentgrade s2 = new studentgrade();
		s2.rollno = 200;
		s2.name = "Bharathi";
		s2.mark = 80;
		s2.setGrade();
		System.out.println(s2.grade);

	}

}
