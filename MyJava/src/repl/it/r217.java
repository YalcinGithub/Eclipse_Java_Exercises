package repl.it;

public class r217 {
	public static boolean badP(int[] products, int limit) {
		int count = 0;
		for (int i : products) {
			if (i == 0) {
				count++;
			}
		}

		return (count < limit);
	}
}
