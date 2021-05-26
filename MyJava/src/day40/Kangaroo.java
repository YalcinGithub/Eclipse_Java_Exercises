package day40;

public class Kangaroo extends Marsupial {
	
	public boolean isBiped() {
		return true;
	}
	
	public static boolean isBipedstatic() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs:" + isBiped());
	}

}
