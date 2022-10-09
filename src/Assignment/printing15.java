package Assignment;

public class printing15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int i;
             int j;
             System.out.println("first 20 prime Numbers:");
		for (i = 1; i <=20; i++) {
			for (j = 2; j <i; j++) {
				if (i % j == 0) 
					break;
			}
				if (i ==j) {

					System.out.println(i);

			}

		}
	}
	}
