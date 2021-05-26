package repl.it;

import java.util.Scanner;

public class Q79 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		char p = 'X';
		char k = 'x';
		if (word.charAt(0) == p | word.charAt(0) == k) {
			if (word.charAt(word.length() - 1) == k | word.charAt(word.length() - 1) == p) {
				for (int i = 1; i < word.length() - 1; i++) {
					System.out.print(word.charAt(i));
				}

			} else {
				for (int i = 1; i <= word.length() - 1; i++) {
					System.out.print(word.charAt(i));
				}
			}
		}
		if (word.charAt(word.length() - 1) == p | word.charAt(word.length() - 1) == k) {
			if (word.charAt(0) == k | word.charAt(0) == p) {
				for (int i = 1; i < word.length() - 1; i++) {
					System.out.print(word.charAt(i));
				}
			} else {
				for (int i = 0; i < word.length() - 1; i++) {
					System.out.print(word.charAt(i));
				}
			}

		} else {
			System.out.println(word);
		}
	}

}
