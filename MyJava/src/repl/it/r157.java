package repl.it;

import java.util.Scanner;

public class r157 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {

		if (s.length() < 10)
			s = 0 + s;
		// 07:05:45PM
		String amPm = s.substring(s.length() - 2);
		String message = s.substring(0, s.length() - 2);

		if (amPm.equalsIgnoreCase("pm")) {
			message = "" + (Integer.parseInt(message.substring(0, 2)) + 12) + message.substring(2);
		}
		System.out.println(message);
		/*
		 * Write your code here.
		 */

	}
}
