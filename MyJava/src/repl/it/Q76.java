package repl.it;

import java.util.Scanner;

public class Q76 {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
//	    input: mike_tyson@gmail.com
//	    output: tyson_mike@gmail.com

//	    mike_tyson
//	    mike
//	    tyson
	    
	    //mike_tyson@gmail.com
	    boolean varmi = false;
	    int index = 0;
	    for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i)=='@') {
				index = i;
			}
		}
	   
	  //mike_tyson@gmail.com
	    String email2 = email.substring(0, index);
	  //mike_tyson
	    
	    index = 0;
	  //mike_tyson
	    for (int i = 0; i < email2.length(); i++) {
			if (email.charAt(i)=='_') {
				index = i;
				varmi = true;
			}
		}
	    
	    if (!varmi) {
	    	System.out.println(email);
	    	return;
	    }
	    
	    
	    //mike_tyson
	    
	    String name1 = email.substring(0, index);
	  //mike_
	    
	    
	    String name2 = email.substring(index+1,email2.length() );
	    // tyson
	    
	    System.out.println(name2 +"_" +  name1  + "@gmail.com");
	}

}
