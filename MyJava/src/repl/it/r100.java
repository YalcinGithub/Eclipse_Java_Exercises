package repl.it;

import java.util.Scanner;

public class r100 {

	public static void main(String[] args) {
//		input: breadjambread
//		output: jam

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int index1 = -1;
		int index2 = -1;

		if (str.length() < 11) {
			System.out.println("nothing");
		} else {
			for (int i = 0; i < str.length() - 5; i++) {
				if (str.substring(i, i + 5).equalsIgnoreCase("bread")) {
					index1 = i;
					break;
				}
			}
			for (int i = str.length() - 5; i > -1; i--) {
				if (str.substring(i, i + 5).equalsIgnoreCase("bread")) {
					index2 = i;
					break;
				}
			}

			if (index1 == -1 || index2 == -1 || index1 == index2) {
				System.out.println("nothing");
			}

			else {
				System.out.println(str.substring(index1 + 5, index2));

			}
		}
	}

}
