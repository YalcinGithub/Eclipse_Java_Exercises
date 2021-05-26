package assignments_8;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		System.out.println("enter the amount");
		Scanner scan = new Scanner(System.in);
		double unit = scan.nextDouble();
		waterTax(unit);

	}

	private static void waterTax(double unit) {
		double tax = 0;
		if (unit <= 50) {
			tax = unit * 0.60;

		} else if (unit > 50) {
			tax = unit * 0.90;
		}
		if (unit > 100) {
			tax += 50;
		}
		if (unit > 150) {
			tax += 50;
		}
		System.out.println(tax);
	}
}
