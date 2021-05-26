package repl.it;

import java.util.Scanner;

public class r075 {
//appears in that string. if so it will output "read this mail" else it will output "dont read".

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();

		// alejandro
		boolean flag1 = false;
		boolean flag2 = false;
		if (9 < a.length()) {
			for (int i = 0; i <= a.length() - 9; i++) {
				if (a.substring(i, i + 9).equals("alejandro")) {
					flag1 = true;
					break;
				}
			}
		}
		
		if (9 < a.length()) {
			for (int i = 0; i <= a.length() - 7; i++) {
				if (a.substring(i, i + 7).equals("project")) {
					flag2 = true;
					break;
				}
			}
		}
		if (flag1&&flag2)System.out.println("read this mail");
		else System.out.println("dont read");
			;

	}

}
