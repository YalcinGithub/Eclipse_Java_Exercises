package unclassified;

public class newwww {

	public static void main(String[] args) {
		/**
		 * String -- Frequency of Characters Write a return method that can find the
		 * frequency of characters
		 * 
		 * -->: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
		 */
		String str = "AAABBBCDD";
		System.out.println(FrequencyOfChars(str));
	}

	public static String FrequencyOfChars(String str) {

		String nonDup = "";

		for (int i = 0; i < str.length(); i++) {

			if (!nonDup.contains("" + str.charAt(i)))
				nonDup += "" + str.charAt(i);
		}
//		nondup = ABCD
		String expectedResult = "";
		for (int j = 0; j < nonDup.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == nonDup.charAt(j))
					count++;
			}
			expectedResult += nonDup.charAt(j) + "" + count;
		}
		return expectedResult;
	}
}
