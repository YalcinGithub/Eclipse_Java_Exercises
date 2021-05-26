package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class r127 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	boolean key = true;
			System.out.println("Day 0 " + Arrays.toString(inhabitants));
	int k = 0;
			do {
			  k++;
				key = false;
				for (int i = 0; i < inhabitants.length; i++) {
					inhabitants[i] = inhabitants[i] / 2;
				}
				
				System.out.print("Day " + k + " ");
				System.out.println(Arrays.toString(inhabitants));

				for (int i = 0; i < inhabitants.length; i++) {
					if (inhabitants[i] != 0) {
						key = true;
						break;
					}
				}

			} while (key);
			
		System.out.println("---- EXTINCT ----");    
	    
	  }
	

}
