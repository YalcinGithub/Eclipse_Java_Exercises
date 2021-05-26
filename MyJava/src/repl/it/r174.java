package repl.it;

import java.util.Scanner;

public class r174 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			boolean exists = false;
			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;
				else if (nums[i] == nums[j]) {
					exists = true;
					break;
				}
			}

			if (!exists)
				System.out.println(nums[i]);
		}
	}
}
