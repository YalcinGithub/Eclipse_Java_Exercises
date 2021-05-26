package repl.it;

import java.util.ArrayList;

public class r214 {
	public static String search(ArrayList<String> r, String find) {

		for (String string : r) {
			if (string.contains(find)) {
				return string;
			}
		}
		return "search failed";
		
	}

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("2");
		arr.add("6");
		arr.add("foo bar");
		arr.add("abc");

		String find_tst = search(arr, "foo");
		System.out.print(find_tst);// foo bar

	}// end main
}