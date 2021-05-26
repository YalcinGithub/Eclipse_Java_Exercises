package day42_Interface;

public abstract class ElectricCar {

	private String model;
	private double price;
	private String color;

	public ElectricCar(String model, double price, String color) {
		super();
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public abstract void start(); // what to do instead of HW TODO

	public abstract void charge();

	public abstract void drive();

	public void stop() {
		System.out.println("Stopping");
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "ElectricCar [model=" + model + ", price=" + price + ", color=" + color + "]";
	}

}
