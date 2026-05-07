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
public class Employee extends Person{
	protected int office, salary;
	protected String date;
	
	public Employee() {}
	
	public Employee(String name, String address, String phoneNumber, String email) {
		super(name, address, phoneNumber, email);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an office number: ");
		office = input.nextInt();
		System.out.print("Enter a salary: ");
		salary = input.nextInt();
		input.nextLine();
		System.out.print("Enter a hire date (mm/dd/yyyy): ");
		MyDate o = new MyDate(input.nextLine());
		date = o.getDate();
	}
	@Override
	public String toString() {
		return "\nSalary: $" + salary + "\nDate Hired: " + date + "\n\nOffice: " + office + super.toString();
	}
}
