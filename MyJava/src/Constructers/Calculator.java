package Constructers;

public class Calculator {

	Floor floor;
	Carpet carpet;

//	The class needs two fields (instance variables) with name floor of type Floor 
//	and carpet of type Carpet.
//	The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and 
//	it needs to initialize the fields.
//	Write the following methods (instance methods):
//	* Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor 
//	with a carpet.

	public Calculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}

	public double getTotalCost() {
		return floor.getArea() * carpet.getCost();
	}
	
	// for example my house is 10 m2 (5*2)
	// and i wanna buy a carpet for 5 $ / m2
	
}
