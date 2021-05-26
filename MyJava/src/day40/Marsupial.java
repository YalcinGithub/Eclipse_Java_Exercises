package day40;

public class Marsupial {
	
	public boolean isBiped() {
		return false;
	}
	
	public static boolean isBipedstatic() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs:" + isBiped());
	}

}