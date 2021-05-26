package repl.it;

public class r207 {
	public static int[] do_switch(int[] i) {
		int temp = i[0];
		i[0] = i[i.length - 1];
		i[i.length - 1] = temp;

		return i;
	}
}
