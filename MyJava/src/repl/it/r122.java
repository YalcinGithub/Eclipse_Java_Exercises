package repl.it;

import java.util.Scanner;

public class r122 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println("Enter 7 numbers with blanks");
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

		for (int i = 0; i < nums.length; i++) {
			int count = 0;

			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			
			if(count<2) {System.out.println(nums[i]);}
			//System.out.println(nums[i] + " is repeated " + count + " times in the array.");

		}

	}

}
