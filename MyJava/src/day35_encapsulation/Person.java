package day35_encapsulation;

public class Person {
	String name;
	int age;
	char gender;

	// age = 3000;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 199) {
			System.out.println("Error, fix the age");
		} else
			this.age = age;
	}

}
