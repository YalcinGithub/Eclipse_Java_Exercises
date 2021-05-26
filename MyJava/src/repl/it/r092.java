package repl.it;

import java.util.Scanner;

public class r092 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long result = 1;
		for (int i = n; i > 0; i--) {
			result *= i;
		}
		System.out.println(result);
	}
}
