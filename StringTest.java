package mytest;
import org.junit.*;
import static org.junit.Assert.*;

/*
* Class: CMSC201
* Instructor: Grinberg
* Description: test string class
* Due: 5/11/2026
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Jason Hale
*/
public class StringTest {
	String le = "Length";
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void testLength() {
		assertTrue(le.length() == 6);
	}
	
	@Test
	public void testCharAt() {
		assertTrue(le.charAt(2) == 'n');
	}
	
	@Test
	public void testSubstring() {
		assertTrue(le.substring(1, 4).equals("eng"));
	}
	
	@Test
	public void testIndexOf() {
		assertTrue(le.indexOf("th") == 4);
	}

}
