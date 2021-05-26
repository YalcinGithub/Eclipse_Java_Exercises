package Constructers;

public class Main {

	public static void main(String[] args) {

		// Floor myHouse = new Floor(width, length)

		Calculator calculate = new Calculator(new Floor(5.0, 2.0), new Carpet(5.0));

		System.out.println(calculate.getTotalCost());

	}

}
