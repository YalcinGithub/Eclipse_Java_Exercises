package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class r170 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		
		System.out.println("Day 0 " + Arrays.toString(inhabitants));
int day = 0;



		do {day++;
		int[] inhabitantscopy = inhabitants.clone();
			for (int i = 0; i < inhabitants.length; i++) {

				if (inhabitantscopy[i] == 0 && i ==0) {
					inhabitants[i+1] = inhabitantscopy[i+1]/2;
				}
				
				else if (inhabitantscopy[i] == 0 && i ==inhabitants.length - 1) {
					inhabitants[i-1] = inhabitantscopy[i-1] / 2;
				}
				else if (inhabitantscopy[i] == 0 && 0<i && i <inhabitants.length - 1 ) {
					inhabitants[i-1] = inhabitantscopy[i-1] / 2;
					inhabitants[i+1] = inhabitantscopy[i+1]/2;
				}
			}
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			
		} while (!diziBosMu(inhabitants));
System.out.println("---- EXTINCT ----");
	}

	private static boolean diziBosMu(int[] inhabitants) {
		boolean flag = true;
		
		for (int i = 0; i < inhabitants.length; i++) {
			if(inhabitants[i]!=0) {
				flag = false;
			}
		}
		
		return flag;
	}
}
//Day 3 [3, 0, 8, 0, 3, 2, 0, 0]
//[3, 6, 0, 4, 3, 2, 7, 0]