package day42_Interface;

public class Tesla extends ElectricCar {

	public Tesla(String model, double price, String color) {
		super(model, price, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Tesla start");
		
	}

	@Override
	public void charge() {
		System.out.println("Tesla charge");
		
	}

	@Override
	public void drive() {
		System.out.println("Tesla drive");
		
	}

}
