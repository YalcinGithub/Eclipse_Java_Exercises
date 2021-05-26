package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task083 {

	public static void main(String[] args) {
		char choice = 'n';
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Rolling the dice.. \nTheir values are:  ");
			int num1 = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;
			System.out.println(num1 + " " + num2);
			System.out.println("Roll them again ? (y=yes) ");
			choice = scan.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

	}

}
