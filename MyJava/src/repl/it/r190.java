package repl.it;

public class r190 {
	public static int[] mergR(int[] a, int[] b) {
		int[] newArray = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			newArray[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			newArray[a.length + i] = b[i];
		}
		return newArray;
	}// end mergR

	public static void main(String[] args) {

	}
}
