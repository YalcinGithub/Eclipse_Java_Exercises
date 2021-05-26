package repl.it;

import java.util.Scanner;

public class r069 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE
		String newword = word.substring(0, word.length() / 2);
		System.out.println(newword + newword);

	}
}
