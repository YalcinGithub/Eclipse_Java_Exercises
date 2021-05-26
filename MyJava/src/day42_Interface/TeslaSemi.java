package day42_Interface;

public class TeslaSemi extends ElectricTruck {

	private double engineSize;
	
	public TeslaSemi(String model, double price, String color, double engineSize) {
		super(model, price, color);
		this.engineSize = engineSize;
	}

	@Override
	public void load(String item) {
System.out.println("TeslaSemi load");
	
	}

	@Override
	public void start() {
		System.out.println("TeslaSemi start");
	}

	@Override
	public void charge() {
		System.out.println("TeslaSemi charge");
	}

	@Override
	public void drive() {
		System.out.println("TeslaSemi drive");
	}

	public double getEngineSize() {
		return engineSize;
	}

}
