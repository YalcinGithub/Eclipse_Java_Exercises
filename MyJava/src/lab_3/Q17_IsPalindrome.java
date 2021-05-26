package lab_3;

public class Q17_IsPalindrome {

	public static void main(String[] args) {

		isPalindrome("top spot");
		
	}

	private static void isPalindrome(String string) {
		
		string = string.toLowerCase();
		string = string.replace(" ","");
		
		String string2 = "";
		
		for (int i = string.length()-1; i >=0 ; i--) {
			string2+=string.charAt(i);
		}
		
		System.out.println(string.equals(string2));
		
	}

}
