package lab_3;

public class Q14 {

	public static void main(String[] args) {
		
//		Given a string, return true if it ends in "ly".

	System.out.println(endsLy("fgdh ly"));
	//true
		
	}

	private static boolean endsLy(String string) {
		if (string.length()<2) return false;
		
		return (string.substring(string.length()-2).equals("ly"));
	}

}
