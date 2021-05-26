package repl.it;

import java.util.Scanner;

public class r120 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
			  
			}
			
			int max = 0;
			int maxindex = 0;
			for (int i = 0; i < words.length; i++) {
				if(words[i].length()>max) {
					max = words[i].length();
					maxindex = i;
				}
			}
			System.out.println(words[maxindex]);
			//write your code below
			
		}

	}