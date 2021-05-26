package repl.it;

import java.lang.reflect.Array;
import java.util.Scanner;

public class r153 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		person(s);
	}

	public static void person(String info) {
		String[] array = new String[3];
		array = info.split(",");

		System.out.println("person name: " + array[0] + " last name: " + array[1] + " age: " + array[2]);

		// person("jon,doe,30");
		// person name: jon last name: doe age: 30

		// your code here

	}// end person

}
