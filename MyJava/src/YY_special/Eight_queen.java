package YY_special;

public class Eight_queen {

	public static void main(String[] args) {

		int[] dizi = new int[64];

		//int x; // random number//

		int queensInPlace = 0; // number of queens in place//
		
		while (queensInPlace != 8) {
			queensInPlace = 0;
			temizle(dizi);

			// while loop will run until 8 queen is placed or the array is full
			while (queensInPlace != 8) {
				// get a new index
				int x = randomSayi(64);

				// if x index is empty, place the queen, plus the i //
				if (dizi[x] == 0) {
					placeQueen(dizi, x);
					queensInPlace++;
				}

				// if array is full and no place available,
				// we should break the while loop and go back to clean array.
				// is Array full check;
				if (isArrayFull(dizi))
					break;
			}

		}
		
		printArray(dizi);

	}

	private static boolean isArrayFull(int[] array) {
		for (int i : array) {
			if (i == 0)
				return false;
		}

		return true;
	}

	private static int randomSayi(int i) {
		return ((int) (Math.random() * i));
	}

	private static void placeQueen(int[] array, int x) {

		// Find the column and row of the index X
		int left1 = (x / 8) * 8;
		int up1 = x % 8;

		// fill the column and row of x with "1"
		for (int i = left1; i < left1 + 8; i++)
			array[i] = 1;
		for (int i = up1; i < 64; i += 8)
			array[i] = 1;

		// fill the cross boxex with "1"
		int cross1 = x;
		int cross2 = x;
		while (cross1 % 8 != 0 && cross1 >= 9) {
			cross1 -= 9;
		}

		while (cross2 % 8 != 0 && cross2 < 56) {
			cross2 += 7;
		}

		for (int i = cross1; i < 64; i += 9) {
			array[i] = 1;
			if (i % 8 == 7)
				break;
		}

		if (cross2 % 8 == 0) {
			for (int i = cross2; i >= 0; i -= 7) {
				array[i] = 1;
			}

		} else {
			for (int i = cross2; i >= 0; i -= 7) {
				array[i] = 1;
				if (i % 8 == 7)
					break;
			}
		}
		array[x] = -1;
	}

	private static void temizle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
	}

	private static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
//System.out.print("|"+array[i]);
			if (array[i] == -1)
				System.out.print("|Q");
			else
				System.out.print("| ");
			if ((i + 1) % 8 == 0)
				System.out.println("|");
		}

	}

}