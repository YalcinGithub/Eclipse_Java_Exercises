package repl.it;

import java.util.Scanner;

public class r078 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		String sender;
		String phoneNumber;
		String messageBody;

//	    Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
//
//	    Sender: Mike Smith
//	    Phone Number: 202-123-3456
//	    Message body: I love programing and problem solving

		sender = message.substring(message.indexOf('<') + 1, message.indexOf('>'));
		phoneNumber = message.substring(message.indexOf('[') + 1, message.indexOf(']'));
		messageBody = message.substring(message.indexOf('{') + 1, message.indexOf('}'));

		System.out.println("Sender: " + sender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Message body: " + messageBody);
	}

}
