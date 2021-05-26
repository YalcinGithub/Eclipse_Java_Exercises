package repl.it;

import java.util.Arrays;

public class r171 {

	public static void main(String[] args) {
	    String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
	    
	    char character = 'a';
	    for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				chessBoard[i][j] = ""+(i+1)+((char)(character+j));
			}
		}
	    
	    //System.out.println(character);
	   // System.out.println((char)(character+1));
	    
	    //(char)(character+j)
	    
	    //DO NOT CHANGE
	   System.out.println(Arrays.deepToString(chessBoard));
	  }
	}