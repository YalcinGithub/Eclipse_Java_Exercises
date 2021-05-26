package repl.it;

import java.lang.annotation.Repeatable;
import java.util.ArrayList;
import java.util.Scanner;

public class r077 {

	public static void main(String[] args) {
		
		    Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    output(email);
		  
	}

	public static void output(String email) {
		String firstName=email.substring(0,email.indexOf('_'));
		firstName=firstName.toUpperCase().substring(0, 1).concat(firstName.substring(1));
		String lastName=email.substring(email.indexOf('_')+1,email.indexOf('@'));
		lastName=lastName.toUpperCase().substring(0, 1).concat(lastName.substring(1));
		String domain=email.substring(email.indexOf('@')+1,email.indexOf('.'));
		String topDomain=email.substring(email.indexOf('.')+1);
		System.out.println("First name: "+firstName);
		System.out.println("Last name: "+lastName);
		System.out.println("Domain: "+domain);
		System.out.println("Top-Level Domain: "+topDomain);
	}

}
