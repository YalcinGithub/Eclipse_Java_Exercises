package unclassified;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		int num1, num2, big, small, ask = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = scan.nextInt();

		System.out.println("Enter the second number: ");
		num2 = scan.nextInt();

		if (num1 > num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}

		do {
			System.out.println("Do you want to add another number? ( 1- yes | no - 0 ) ");
			ask = scan.nextInt();

			if (ask == 1) {
				System.out.println("Enter the next number: ");
				num2 = scan.nextInt();
				if (num2 > big)
					big = num2;
				else if (num2 < small)
					small = num2;
			}

		} while (ask == 1);
		System.out.println("The biggest number is " + big);
		System.out.println("The smallest number is " + small);
	}

}
