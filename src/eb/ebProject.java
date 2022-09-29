package eb;

public class ebProject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int unit =250;

		if (unit <100 && unit > 0) {
			System.out.println(0);
		}

		if (unit < 200 && unit > 100) {
			int rem = unit - 100;
			double cost = rem * 1.5;
			System.out.println(cost);
		}
		
		if (unit > 200 && unit < 500) {
			int rem = unit - 200;
			int cost = rem * 3;
			int total = cost+200;
			System.out.println(total);
		}
		
		if (unit>500) {
		int	rem=unit-500;
		double	cost=rem*6.6;
		double total=cost+1730;
		System.out.println(total);
		}
		
		}		
		}




