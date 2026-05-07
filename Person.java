package JHale_Project3;
/*
 * Class: CMSC201
 * Instructor: Dr. Grinberg
 * Description: use subclasses to create a person
 * Due: 04/6/26
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Jason Hale
 */
public class Person {
	protected String name, address, phoneNumber, email;
	
	public Person() {}
	
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "\nAddress: " + address + "\nPhone number: " + phoneNumber + "\nEmail Address: " + email;
	}
}
