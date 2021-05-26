package repl.it;

import java.util.Scanner;

public class r053__ {

	public static void main(String[] args) {

		// 1995-1998, 2001-2002, 2004-2006 and 2015-2017.

		System.out.println("Enter vehicle's year:");
		Scanner scan = new Scanner(System.in);

		int vehicleYear = scan.nextInt();

		if (vehicleYear == 1995 || vehicleYear == 1995 || vehicleYear == 1996 || vehicleYear == 1997
				|| vehicleYear == 1998 || vehicleYear == 2001 || vehicleYear == 2002 || vehicleYear == 2004
				|| vehicleYear == 2005 || vehicleYear == 2006 || vehicleYear == 2015 || vehicleYear == 2016
				|| vehicleYear == 2017) {
			System.out.println("Your vehicle needs to be recalled!");
		} else
			System.out.println("Your vehicle is fine, enjoy!");
//		switch (vehicleYear) {
//		case 1995, 1996, 1997, 1998, 2001, 2002, 2004, 2005, 2006, 2015, 2016, 2017:
//			System.out.println("Your vehicle needs to be recalled!");
//			break;
//
//		default:
//			System.out.println("Your vehicle is fine, enjoy!");
//
//		}

	}

}
