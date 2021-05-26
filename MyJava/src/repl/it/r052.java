package repl.it;

import java.util.Scanner;

public class r052 {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String a = s.nextLine();
	    
	    switch (a) {
		case "a":
			System.out.println(a + " is wrong");
			break;
		case "c":
			System.out.println(a + " is wrong");
			break;
		case "b":
			System.out.println(a + " is correct");
			break;
		default:
			System.out.println(a + " is not a valid answer");
			break;
		}
	    

	    
	  }
	}