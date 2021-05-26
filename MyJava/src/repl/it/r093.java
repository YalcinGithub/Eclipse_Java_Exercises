package repl.it;
import java.util.Scanner;

public class r093 {

	public static void main(String[] args) {

		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.println(hasJava(word));
	}
	
	public static boolean hasJava(String word) {
		if (word.length() < 4)
			return false;
		if (word.substring(0, 4).toLowerCase().equals("java") || word.substring(1, 5).toLowerCase().equals("java"))
			return true;
		else return false;
	}

}
