package repl.it;

import java.util.ArrayList;

public class r206 {

//	Create a static method that:
//		is called repeatAL
//		returns nothing
//		takes in a single parameter - an ArrayList of Booleans
//
//		This method should modify its ArrayList parameter by repeating its ArrayList values.  
//
//		For example, if the parameter is 
//		(true, false, false)
//		The modified ArrayList should be
//		(true, false, false, true, false, false)
	
	public static void repeatAL(ArrayList<Boolean> arraylist) {
		int size = arraylist.size();
		
		for (int i = 0; i < size; i++) {
			arraylist.add(arraylist.get(i));
		}
		
		System.out.println(arraylist);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
}
