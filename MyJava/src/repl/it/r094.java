package repl.it;

import java.util.Scanner;

public class r094 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		do {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			// output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5
			shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
			System.out.println("Add one more item?");
			countinue = scan.next();
			if (countinue.equalsIgnoreCase("yes")) {
				shoppingListReport += ", ";
			}
			totalPrice += price;
			count++;
		} while (countinue.equalsIgnoreCase("yes"));
		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalPrice);
	}
}
