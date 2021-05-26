package repl.it;

import java.util.Scanner;

public class r125 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	    
	    
//	    input: java, cable, red, vivid, remedy, grace
//	    output: red
	    
	    int minindex = 0;
	    int minlenghth = str[0].length();
	    
	    for (int i = 0; i < str.length; i++) {
			if(str[i].length()<minlenghth) {
				minindex = i;
				minlenghth = str[i].length();
			}
		}
	    
	    System.out.println(str[minindex]);
	  }
	}