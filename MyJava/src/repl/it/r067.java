package repl.it;

import java.util.Scanner;

public class r067 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE
		if (word.length() < 5)
			System.out.println("Too short!");
		else if (word.length() > 5)
			System.out.println("Too long!");
		else {
			for (int i = 4; i >= 0; i--) {
				System.out.print(word.charAt(i));
			}
		}
	}
}
