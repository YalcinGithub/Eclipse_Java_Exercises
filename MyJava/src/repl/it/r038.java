package repl.it;

import java.util.Scanner;

public class r038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan=new Scanner(System.in);
			
			System.out.println("Split:");
			String split=scan.next();
			
			System.out.println("Number of people:");
			int numberOfPeople=scan.nextInt();
			
			System.out.println("Check amount:");
			double amount=scan.nextDouble();
			
			System.out.println("Service Quality:");
			String serviceQuality=scan.next();
			
			double totalTip=0;
			double totalPay=0;
			double totalPerPerson=0;
			double tipPerPerson=0;
			int service = 0;
			// WRITE YOUR CODE HERE
				System.out.print("Number of people entered: ");
	      for (int i=0; i<numberOfPeople;i++){
			    System.out.print("&");
			    }
			    
			 
			    switch (serviceQuality) {
			case "Poor":	service = 5;  
			case "Fair": 	service = 10;  
			case "Good": 	service =15;               
			case "Great": 	service =20;  
			case "Excellent": 	service = 25;  
			default:
						}
			    
			    
			totalPay = amount + (amount*service/100) ;
			System.out.println("Total to pay: "+totalPay);
			System.out.println("Total tip: "+(amount*service/100));
			System.out.println("Total per person: "+totalPay/numberOfPeople);
			System.out.println("Tip per person: "+(amount*service/100)/numberOfPeople);

	   
			
  
	}
}
