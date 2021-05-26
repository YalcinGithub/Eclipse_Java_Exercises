package repl.it;

import java.util.Scanner;

public class r062 {

	public static void main(String[] args) {
//		Example:
//			Display message: "Please enter the text:"
//			input: java
//			Display message: "Length is: 4"

		System.out.println("Please enter the text:");
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		System.out.println("Length is: " + message.length());

	}

}
