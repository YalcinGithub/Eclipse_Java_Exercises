package repl.it;

import java.util.Scanner;

public class r087 {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int day = 0;
	    while (inhabitants>0) {
	    	System.out.println("Day "+ day + " [" + inhabitants + "]");
			day++;
			inhabitants/=2;
		}
	    System.out.println("---- EXTINCT ----");
	    
//	    Day 0 [20]
//	    		Day 1 [10]
//	    		Day 2 [5]
//	    		Day 3 [2]
//	    		Day 4 [1]
//	    		---- EXTINCT ----
	}

}
