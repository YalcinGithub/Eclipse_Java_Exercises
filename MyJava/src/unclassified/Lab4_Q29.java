package unclassified;

import java.util.Arrays;

public class Lab4_Q29 {

	public static void main(String[] args) {

//				int[] x = {1,2,2} = > 5
//				int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
//				int[] a = {1,1,6,7,2} = > 4
//				int[] b = {1,1,6,2} = > 2
		int[] c = { 10, 2, 2, 60, 990, 99, 70, 3, 4 };
		System.out.println(Arrays.toString(makeTen(c)));
	}
	
	public static int[] makeTen(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
					
			if (array[i] % 10 != 0)
				continue;
			
			if (array[i] % 10 == 0 && array[i+1] % 10 != 0) {
				array[i + 1] = array[i];
			}
		}
		return array;
	}
}
