package repl.it;

import java.util.ArrayList;

public class r215 {

	public static void main(String[] args) {

	}
	
	
	
//	For example, if the parameter is
//	(1,5,3,7)
//	The method should return a new ArrayList of Integers with
//	(1,1,5,5,3,3,7,7)
	
public static ArrayList <Integer> twoTimes (ArrayList<Integer> arraylist) {
	ArrayList <Integer> newarray = new ArrayList<>();
	for (Integer integer : arraylist ) {
		newarray.add(integer);
		newarray.add(integer);
	}
	return newarray;
} 
	
	
}
