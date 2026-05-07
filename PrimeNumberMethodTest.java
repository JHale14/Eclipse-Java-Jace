package mytest;

import static org.junit.Assert.*;
import org.junit.*;

/*
* Class: CMSC201
* Instructor: Grinberg
* Description: make test class and check if isPrime works
* Due: 5/11/2026
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Jason Hale
*/
public class PrimeNumberMethodTest {
	/**make setUp method*/
	@Before
	public void setUp() throws Exception{}
	
	/**Test the isPrime method*/
	@Test
	public void testIsPrime() {
		/**create prime object*/
		PrimeNumberMethod prime = new PrimeNumberMethod();
		/**Test if isPrime works correctly*/
		for (int number = 2; number < 50; number++) {
			/** set a boolean*/
			boolean right = true;
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0)
					right = false;
			}
			assertTrue(right == prime.isPrime(number));
		}
	}

}
