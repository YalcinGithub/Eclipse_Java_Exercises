package repl.it;

import java.util.Scanner;

public class r088 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();

		for (int i = 0; i < word.length() - 2; i++) {
			if (word.substring(i, i + 3).toLowerCase().equals("cat"))
				countOfCats++;
		}
		for (int i = 0; i < word.length() - 2; i++) {
			if (word.substring(i, i + 3).toLowerCase().equals("dog"))
				countOfDogs++;
		}
System.out.println(countOfCats==countOfDogs);
	}
}