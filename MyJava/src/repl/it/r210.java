package repl.it;

import java.util.Scanner;

public class r210 {

	public static void main(String[] args) {
		System.out.println("str = ");
		Scanner scan = new Scanner(System.in);
		
		String string = scan.next();
		
		System.out.println(reverseLetters(string));

//		String result = reverseLetters("..zxcv..d");
//		System.out.println(result.equals("..dvcx..z")); // true
//
//		String result2 = reverseLetters("---abmkl.o-");
//		System.out.println(result2.equals("---olkmb.a-")); // true
//
//		String result3 = reverseLetters("---abmkl.o-");
//		System.out.println(result3.equals("-o.lkmba---")); // false
	
	
	}

	public static String reverseLetters(String string) {
		// String output = string.concat("");
		String dummy = "";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) <= 'z' && string.charAt(i) >= 'a') {
				dummy += string.charAt(i);
				string = string.substring(0, i) + " " + string.substring(i + 1, string.length());
			} else if (string.charAt(i) <= 'Z' && string.charAt(i) >= 'A') {
				dummy += string.charAt(i);
				string = string.substring(0, i) + " " + string.substring(i + 1, string.length());
			}
		}
		String reverseDummy = "";
		for (int i = dummy.length() - 1; i >= 0; i--) {
			reverseDummy += dummy.charAt(i);
		}

		int dummyIndex = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				string = string.substring(0, i) + reverseDummy.charAt(dummyIndex)
						+ string.substring(i + 1, string.length());
				dummyIndex++;
			}
		}

		return string;
	}
}