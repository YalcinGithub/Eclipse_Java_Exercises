package repl.it;

import java.util.Scanner;

public class r068 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String sentence = scan.nextLine();
		// WRITE YOUR CODE HERE
		boolean flag = false;
		if (word.length() > sentence.length()) {
			System.out.println(false);
			return;
		} else {
			for (int i = 0; i <= sentence.length() - word.length(); i++) {
				if (sentence.substring(i, i + word.length()).equals(word)) {
					flag = true;
					break;
				}
			}
		}
		System.out.println(flag);
	}
}
