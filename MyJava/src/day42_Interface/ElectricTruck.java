package day42_Interface;

public abstract class ElectricTruck extends ElectricCar {

	public ElectricTruck(String model, double price, String color) {
		super(model, price, color);
	}

	public abstract void load(String item);

}
