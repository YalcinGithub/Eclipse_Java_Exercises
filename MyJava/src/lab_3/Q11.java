package lab_3;

public class Q11 {

	public static void main(String[] args) {

//		Return the number of times that the string "hi" appears anywhere in the given string.
		countHi("abc hi hohi");

	}

	public static int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.substring(i, i+2).equals("hi")) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		return 0;
	}
}
