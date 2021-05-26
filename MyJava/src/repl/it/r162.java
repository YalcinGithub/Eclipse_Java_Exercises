package repl.it;

import java.util.Scanner;

public class r162 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num) {

		int lastnumber = 1;
		int firstnumber = 0;
		int sum = 0;

		for (int i = 0; i < num-1; i++) {
			sum = lastnumber + firstnumber;
			firstnumber = lastnumber;
			lastnumber = sum;
		}
		// 0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
		System.out.println(lastnumber);
	}
}
