package day42_Interface;

public class Ford extends ElectricCar {

	public Ford(String model, double price, String color,int year) {
		super(model, price, color);
		this.year = year;
		// TODO Auto-generated constructor stub
	}

	private int year;

	@Override
	public void start() {
		System.out.println("Ford start");
		
	}

	@Override
	public void charge() {
		System.out.println("Ford charge");
		
	}

	@Override
	public void drive() {
		System.out.println("Ford drive");
		
	}

	public int getYear() {
		return year;
	}
	
	
}
