package repl.it;

import java.util.ArrayList;
import java.util.Arrays;

public class r199 {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

		removeAll(wordList,"hi");

	}

	public static void removeAll(ArrayList<String> wordList, String string) {
		
		while (wordList.contains(string)) {
			wordList.remove(string);
		}
		
	}

}
