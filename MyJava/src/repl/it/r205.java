package repl.it;

public class r205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] addElements(int[] ints1, int[] ints2) {
		int[] lastArray = new int[ints1.length];
		for (int i = 0; i < lastArray.length; i++) {
			lastArray[i] = ints1[i] + ints2[i];
		}

		return lastArray;

	}
}
