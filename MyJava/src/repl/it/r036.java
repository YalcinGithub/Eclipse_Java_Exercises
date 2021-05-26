package repl.it;

import java.util.Scanner;

public class r036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seniorCitizens, nonSeniorCitizens, age;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens = scan.nextInt();
		nonSeniorCitizens = scan.nextInt();

		System.out.println("What is new citizen's age?");
		age = scan.nextInt();

		if (age >= 65) {
			seniorCitizens++;
			System.out.println("Senior Citizen");

		} else {
			nonSeniorCitizens++;
			System.out.println("Non-Senior Citizen");
		}

		System.out.println("New seniorCitizens count "+seniorCitizens+ "\r\n" + 
				"New nonSeniorCitizens count "+nonSeniorCitizens);
	}

}
