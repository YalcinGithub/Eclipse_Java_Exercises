package repl.it;

import java.util.Scanner;

public class r056 {

	public static void main(String[] args) {
		// DO NOT CHANGE
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter command:");
		char response = scan.next().charAt(0);
		// WRITE YOUR CODE HERE

		switch (response) {
		case 'y':
			System.out.println("Your request is being processed");
			break;
		case 'n':
			System.out.println("Thank you anyway for your consideration");
			break;
		case 'h':
			System.out.println("Sorry, no help is currently available");
			break;

		default:
			System.out.println("Invalid entry, please try again!");
			break;
		}

//	    if response is y, the message Your request is being processed is printed
//	    if response is n, the message Thank you anyway for your consideration is printed
//	    if response is h, the message Sorry, no help is currently available is printed
//	    for any other value of response, the message "Invalid entry, please try again!" is printed
//	    

	}
}