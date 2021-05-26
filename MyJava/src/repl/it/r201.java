package repl.it;

import java.util.ArrayList;
import java.util.Scanner;

public class r201 {

	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
/*
 * is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers
 
This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element
 */
		
		ArrayList<Integer> list = new ArrayList <>();
		appendPosSum(list);
		
	}

	public static ArrayList appendPosSum(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		ArrayList<Integer> newlist = new ArrayList <>();
		
		for (Integer element : list) {
			if(element >0) {
				newlist.add(element);
			}
		}
		int sum = 0;
		for (Integer integer : newlist) {
			sum+=integer;
		}
		
		newlist.add(sum);
		
		return newlist;
		
	}

}
