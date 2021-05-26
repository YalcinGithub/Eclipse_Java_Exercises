package repl.it;

import java.util.Scanner;

public class r095 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    char start = scan.next().charAt(0);
    char end = scan.next().charAt(0);
    
    while (start<=end) {
    	System.out.print(start);
		start++;
	}
    
//    for (int i = (int)(start) ; i <= (int)(end); i++) {
//    	System.out.print((char)(i));
//		
//	}
}
}
