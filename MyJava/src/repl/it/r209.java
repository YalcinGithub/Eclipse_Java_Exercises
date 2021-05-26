package repl.it;

public class r209 {
	public static String extractNum(String s) {
//		 extractNum("aa2aa3") ==> 23
//
//		 extractNum("aa2") ==> 2
		String dummy = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				dummy += s.charAt(i);
			}
		}

		return dummy;
	}
}