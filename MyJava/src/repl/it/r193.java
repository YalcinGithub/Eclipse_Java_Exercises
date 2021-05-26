package repl.it;

import java.util.ArrayList;

public class r193 {
	public static String combineRs(String[] r1, String[] r2) {
		ArrayList<String> newlist = new ArrayList<>();

		for (String string : r1) {
			newlist.add(string);
		}
		for (String string : r2) {
			newlist.add(string);
		}

		String lastString = "";

		for (int i = 0; i < newlist.size(); i++) {
			lastString += newlist.get(i);
		}
		return lastString;

	}
}
