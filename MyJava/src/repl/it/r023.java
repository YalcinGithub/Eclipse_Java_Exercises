package repl.it;

import java.util.Scanner;

public class r023 {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    String output = "";
	    for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
	    	if(c==('a')||c==('e')||c==('i')||c==('o')||c==('u')) {
	    		output+=c;
	    	}
		}
	    System.out.println(output);
	  }
	}
