package repl.it;

import java.util.ArrayList;

public class r195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int sum(ArrayList<Integer> ints)
	{
		int sum = 0;
		for (int i = 0; i < ints.size(); i++) {
			sum+=ints.get(i);
		}
		return sum;
		
	}

}
