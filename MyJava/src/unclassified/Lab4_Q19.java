package unclassified;

public class Lab4_Q19 {

	public static void main(String[] args) {

//				int[] x = {1,2,2} = > 5
//				int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
//				int[] a = {1,1,6,7,2} = > 4
//				int[] b = {1,1,6,2} = > 2
//				int[] c = {1,2,2,6,99,99,7,3,4} = > 12

		
		int[] x = {1,1,6,7,2};

		int sum = 0;
		boolean isBetween6_7 = false;

		for (int i : x) {
			if (i == 6)
				isBetween6_7 = true;

			if (i == 7) {
				isBetween6_7 = false;
				continue;
			}

			if (isBetween6_7) {
				continue;
			}

			sum += i;
		}
		
		//break goes here
		System.out.println(sum);

	}

}
