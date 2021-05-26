package repl.it;

import java.util.Scanner;

public class r074 {
//appears in that string. if so it will output "read this mail" else it will output "dont read".

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		// alejandro
		boolean flag = false;
		if (9 < a.length()) {
			for (int i = 0; i <= a.length() - 9; i++) {
				if (a.substring(i, i + 9).equals("alejandro")) {
					flag = true;
					break;
				}
			}
		}
		if (flag)System.out.println("read this mail");
		else System.out.println("dont read");
			;

	}

}
