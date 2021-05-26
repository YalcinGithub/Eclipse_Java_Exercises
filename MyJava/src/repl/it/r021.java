package repl.it;

import java.util.Scanner;

public class r021 {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    
	    for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}

	}

}
