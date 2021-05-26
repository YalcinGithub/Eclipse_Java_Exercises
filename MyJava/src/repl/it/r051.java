package repl.it;

import java.util.Scanner;

public class r051 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Split:");
		String split = scan.next();

		System.out.println("Number of people:");
		int numberOfPeople = scan.nextInt();

		System.out.println("Check amount:");
		double amount = scan.nextDouble();

		System.out.println("Service Quality:");
		String serviceQuality = scan.next();

		double totalTip = 0;
		double totalPay = 0;
		double totalPerPerson = 0;
		double tipPerPerson = 0;
		int service = 0;
		// WRITE YOUR CODE HERE
		System.out.print("Number of people entered: ");
		for (int i = 0; i < numberOfPeople; i++) {
			System.out.print("&");
		}
		System.out.println();

		switch (serviceQuality) {
		case "Poor":
			service = 5;
			break;
		case "Fair":
			service = 10;
			break;
		case "Good":
			service = 15;
			break;
		case "Great":
			service = 20;
			break;
		case "Excellent":
			service = 25;
			break;
		default:
		}

		totalPay = amount + (amount * service / 100);
		System.out.println("Total to pay: " + totalPay);
		System.out.println("Total tip: " + (amount * service / 100));
		System.out.println("Total per person: " + totalPay / numberOfPeople);
		System.out.println("Tip per person: " + (amount * service / 100) / numberOfPeople);

	}

	// TODO Auto-generated method stub

}
