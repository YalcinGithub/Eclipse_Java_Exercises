package repl.it;

import java.util.Scanner;

public class r066 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		// YOUR CODE HERE
		if (word1.length() != 3 || word2.length() != 3)
			System.out.println("cannot merge");
		else {
			String returning = "";
			for (int i = 0; i < 3; i++) {
				returning += word1.charAt(i) + word2.charAt(i);
			}
			System.out.println(returning);
		}

	}
}
