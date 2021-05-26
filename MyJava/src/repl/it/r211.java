package repl.it;

import java.util.ArrayList;

public class r211 {
	 
	public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
		 double sum = 0;
		 
		 for (Integer turn : deliveries) {
			sum+= turn;
		}
		 
		 return (int) Math.ceil(sum/max_fuel);
		 
	  }
	  
	  public static void main(String[] args) { 
		
		ArrayList<Integer>  arr = new ArrayList<>();
	    arr.add(3);
	    arr.add(3);
	    arr.add(1);
	    arr.add(2);
	    arr.add(6);
	    int times = refuel_times(arr,3);
	    System.out.print(times);//should output 5
	   
	  }
	}