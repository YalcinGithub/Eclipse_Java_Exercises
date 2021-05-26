package day42_Interface;

public class ElectricCarTest {

	public static void main(String[] args) {

		//ElectricCar ec = ElectricCar();  ERROR
		
		Tesla modelS = new Tesla("model S", 45000, "Grey");
		modelS.charge();
		modelS.start();
		modelS.drive();
		modelS.stop();
		System.out.println("==============================");
		
		Ford fusion = new Ford("Fusion", 35000, "Black", 2017);
		fusion.charge();
		fusion.start();
		fusion.drive();
		fusion.stop();
		System.out.println("==============================");

		
		
	}

}
