package lab_3;

public class Q13 {

	public static void main(String[] args) {

//		Given a string, return a string where for every char in the original, there are two chars.

		doubleChar("Three");

	}

	private static void doubleChar(String string) {
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i));
			System.out.print(string.charAt(i));
		}
	}
}
