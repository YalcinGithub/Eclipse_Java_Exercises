package repl.it;

public class r224_person {
//	Person class has following attributes: 
//
//		 - private String instance variables: firstName, lastName
//		 - private int instance variable: age

	private String firstName, lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return firstName + " | " + lastName + " | " + age;
	}

	public r224_person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public r224_person() {
		firstName = "undefined";
		lastName = "undefined";
		age = -1;
	}

	
	
}
