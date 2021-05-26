package repl.it;

import java.util.Scanner;

public class Q79_deneme2 {

	public static void main(String[] args) {
//		Example: 
//			input: xHiX 
//			output: Hi
//
//			Example:
//			input: apple 
//			output: apple
//
//			input: xUxL
//			output: UxL
//
//			input: JavaX
//			output: Java

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
			word = word.substring(1, word.length());
		}

		if (word.charAt(word.length() - 1) == 'x' || word.charAt(word.length() - 1) == 'X') {
			word = word.substring(0, word.length() - 1);
		}

		System.out.println(word);
		
	}

}
