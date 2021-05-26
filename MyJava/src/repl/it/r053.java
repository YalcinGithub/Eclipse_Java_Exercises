package repl.it;

import java.util.Scanner;

public class r053 {

	public static void main(String[] args) {

		// 1995-1998, 2001-2002, 2004-2006 and 2015-2017.

		System.out.println("Enter vehicle's year:");
		Scanner scan = new Scanner(System.in);

		int vehicleYear = scan.nextInt();

		switch (vehicleYear) {
		case 1995, 1996, 1997, 1998, 2001, 2002, 2004, 2005, 2006, 2015, 2016, 2017:
			System.out.println("Your vehicle needs to be recalled!");
			break;

		default:
			System.out.println("Your vehicle is fine, enjoy!");

		}

	}

}
