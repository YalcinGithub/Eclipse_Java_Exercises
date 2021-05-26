package repl.it;

import java.util.Scanner;

public class r103 {

	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
     
		for (int k = 1; k <= n; k++) {
			for (int k2 = 0; k2 < k; k2++) {
				System.out.print("*");
			}
		System.out.println();	
		}
		
	}

}
