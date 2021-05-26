package repl.it;

import java.util.Scanner;

public class r152 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		plus_minus(arr);
	}// end main

	public static void plus_minus(int[] arr) {
		// TODO Auto-generated method stub
//TODO positives:3, negatives:2, zeros:1

		int positive = 0, negative = 0, zero = 0;

		for (int i : arr) {
			if (i < 0)
				negative++;
			else if (i > 0)
				positive++;
			else
				zero++;
		}
System.out.println("positives:"+positive+", negatives:" + negative + ", zeros:"+zero);
	}

}
