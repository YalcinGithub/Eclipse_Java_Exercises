package repl.it;

import java.util.Scanner;

public class r073 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// YOUR CODE HERE
//	    If the word has odd number of characters
//	    and has 5 or more characters, print the middle three 
//	    characters of the word. 
//
//	    Otherwise print "invalid"

		if (word.length() < 5 || word.length() % 2 != 1)
			System.out.println("invalid");
		else {
			System.out.println(word.substring((word.length() / 2) - 1, (word.length() / 2) + 2));
		}

	}

}
