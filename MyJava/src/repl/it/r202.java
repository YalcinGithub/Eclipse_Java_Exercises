package repl.it;

import java.util.ArrayList;

public class r202 {

	public static void main(String[] args) {

	}
//	Create a method that:
//		is called timesTwo
//		returns nothing
//		takes in a single parameter - an ArrayList of Integers called nums
//
//		This method should take the ArrayList parameter and multiply every value by two.

	public static void timesTwo(ArrayList<Integer> arraylist) {
		for (int i = 0; i < arraylist.size(); i++) {
			arraylist.set(i, arraylist.get(i)*2);
		}
	}
	
}
