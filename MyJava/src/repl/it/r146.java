package repl.it;

import java.util.Scanner;

public class r146 {
	  
	  public static void main(String[] args) {
	      
	      plus();
	  }
	  
	  public static void plus(){
		  Scanner scan = new Scanner(System.in);
			  System.out.println("enter first number:");
			  int num1 = scan.nextInt();
			  System.out.println("enter second number:");
			  int num2 = scan.nextInt();
		  System.out.println("result: " + (num1+num2));
	  }
	  
}
