package JHale_Project3;
import java.util.*;
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
public class Faculty extends Employee{
	private String hours, rank;
	
	public Faculty() {}
	
	public Faculty(String name, String address, String phoneNumber, String email) {
		super(name, address, phoneNumber, email);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter office hours: ");
		hours = input.nextLine();
		System.out.print("Enter a rank: ");
		rank = input.nextLine();
	}
	@Override
	public String toString() {
		return "Faculty: " + name + "\nRank: " + rank + "\nOffice Hours: " + hours + super.toString();
	}
}
