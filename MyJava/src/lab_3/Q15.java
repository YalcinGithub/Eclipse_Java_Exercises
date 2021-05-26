package lab_3;

public class Q15 {

	public static void main(String[] args) {
//		Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
//				with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
		hasBad("ccbadxx");
	}

	private static void hasBad(String string) {

		for (int i = 0; i < 2; i++) {
			if (string.substring(i, i + 3).equals("bad")) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}

}
