package repl.it;

public class r168 {
	public double waterTax(double units) {
		double bill = 0.0;

		if (units <= 50) {
			bill = units * 0.60;
		} else if (units <= 100) {
			bill = units * 0.90;
		}

		else if (units <= 150) {
			bill = (units * 0.90) + 50;
		}

		else {
			bill = (units * 0.90) + 100;
		}

		// your code here

		// end your code here

		return bill;
	}// end waterTax

}
