package repl.it;

import java.util.Scanner;

public class r035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String item = scan.nextLine();
		
		if (item.equals("Smartphone") || item.equals("Laptop") )System.out.println("Sorry, not enough funds on your gift card!");
		else if (item.equals("Charger"))System.out.println("Thank you for your purchase!\nYour current balance is: 85$");
		else if (item.equals("USB Cable"))System.out.println("Thank you for your purchase!\nYour current balance is: 90$");
		else if (item.equals("Headphones"))System.out.println("Thank you for your purchase!\nYour current balance is: 70$");
		else if (item.equals("Pants"))System.out.println("Thank you for your purchase!\nYour current balance is: 50$");
		else if (item.equals("Hat"))System.out.println("Thank you for your purchase!\nYour current balance is: 75$");
		else if (item.equals("Socks"))System.out.println("Thank you for your purchase!\nYour current balance is: 95$");
		else if (item.equals("Blanket"))System.out.println("Thank you for your purchase!\nYour current balance is: 40$");
		else if (item.equals("Pillow"))System.out.println("Thank you for your purchase!\nYour current balance is: 60$");
		else System.out.println("Invalid item!");
			
			
			
		
		
		
	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//		
	}

}
