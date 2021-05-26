package repl.it;

import java.util.Scanner;

public class r037 {

	public static void main(String[] args) {
//		Display prompt: "Enter number of coupons:"
//			13
//			Display prompt: "Number of Candies: 1"
//			Display prompt: "Number of Gumballs: 1"
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		int coupons = scan.nextInt();
		if(coupons>=3)System.out.println("Number of Candies: "+coupons/10 + "\nNumber of Gumballs: "+ (coupons%10)/3);
		else System.out.println("Not enough coupons");
	}

}
