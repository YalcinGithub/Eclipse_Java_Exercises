package lab_3;

public class Q12 {

	public static void main(String[] args) {

//		Return true if the string "cat" and "dog" appear the same number of times in the given
//		string.
		catDog("catdogdogcatdog");

	}

	public static void catDog(String string) {
		System.out.println(countCat(string) == countDog(string));
	}

	public static int countCat(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				count++;
			}
		}
		System.out.println("cat = " + count);

		// System.out.println(count);

		return count;
	}

	public static int countDog(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("dog")) {
				count++;
			}
		}

		// System.out.println(count);
		System.out.println("dog = " + count);

		return count;
	}
}
