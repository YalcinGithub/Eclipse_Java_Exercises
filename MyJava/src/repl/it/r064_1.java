package repl.it;

import java.util.Scanner;

public class r064_1 {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    int num = word.length();
		    
		    if(num==1) {
		    	System.out.println(word+word+word);
		    }else if(num==2) {
		    	System.out.println(word+word);
		    }else if(num%2==1) {
		    	System.out.println(word.charAt(num/2));
		    }else if(num%2==0) {
		    	System.out.println(""+word.charAt((num/2)-1)+(word.charAt(num/2)));
		    }
		    
		    
		  }
}
