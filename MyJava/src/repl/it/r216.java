package repl.it;

import java.lang.reflect.Array;
import java.util.*;

public class r216 {
	  public static String blogDb(ArrayList<String[]> r,String id)  {
		    int num = Integer.parseInt(id);
		    
		    String [] array = new String[r.size()];
		  //  String[] myStringArray = new String[3];
		  array = r.get(num-1);
		  
		  
		  String message = ""+ array[1]+ "\n" + array[2];
		  
		    
		   return message ;
	  }
	  
	  public static void main(String[] args) {
	  //  Main m = new Main();
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"1","title 1","content"});
	    arr.add(new String[]{"2","title 2","content"});
	    arr.add(new String[]{"3","title 3","content3"});

	   // String post = m.blogDb(arr,"3");
	    System.out.print(blogDb(arr,"3"));
	    //should output:
	    //title 3 
	    //content3
	   
	    
	  }//end main
	}


//public String blogDb(ArrayList<String[]> r,String id)  {
//    for(int i=0; i<r.size(); i++){
//      if(r.get(i)[0].equals(id)) {
//    	  return r.get(i)[1] + '\n' + r.get(i)[2];
//      }
//    }
//    
//   return null;
//  }