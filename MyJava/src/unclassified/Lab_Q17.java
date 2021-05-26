package unclassified;

public class Lab_Q17 {

	public static void main(String[] args) {

//		Question-17
//		Write a method that accepts an array and print the difference between the largest and
//		smallest values in the array.
//		int[] x = {10,3,5,6} = > 7
//		int[] y = {7,2,10,9} = > 8
//		int[] z = {2,10,7,2} = > 8

		int[] x = { 2, 10, 7, 2 };
		int max;
		int min;

		// max-min ?

		max = min = x[0];

		for (int i : x) {

			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		System.out.println(max - min);
	}

}
