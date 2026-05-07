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
public class Driver {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1) to create a student\n2) to create an Employee\nChoice: ");
		int choice = input.nextInt();
		input.nextLine();
		System.out.print("Enter a name: ");
		String name = input.nextLine();
		System.out.print("Enter " + name + "'s address: ");
		String address = input.nextLine();
		System.out.print("Enter " + name + "'s phone number: ");
		String phoneNumber = input.nextLine();
		System.out.print("Enter " + name + "'s email: ");
		String email = input.nextLine();
		if (choice == 1) {
			Student i = new Student(name, address, phoneNumber, email);
			System.out.println(i.toString());
		}
		else if (choice == 2) {
			System.out.print("1) To create a faculty member:\n2) To create a staff member:\nChoice: ");
			int choice2 = input.nextInt();
			input.nextLine();
			if(choice2 == 1) {
				Faculty j = new Faculty(name, address, phoneNumber, email);
				System.out.println(j.toString());
			}
			else if (choice2 == 2) {
				Staff h = new Staff(name, address, phoneNumber, email);
				System.out.println(h.toString());
			}
			else {
				System.out.println("Enter 1 or 2");
			}
		}
		else {
			System.out.println("Enter 1 or 2");
		}
	}

}
