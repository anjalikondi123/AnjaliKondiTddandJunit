package epam.com.tddandjunit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RemoveA {
	/*TODO List 
	 * 1. "" => ""
	 * 2. "A" => ""
	 * 3. "B" => "B"
	 * 4. "AA" => ""
	 * 5. "AB" => "B"
	 * 6. "BA" => "B"
	 * 7. "AACD" => "CD"
	 * 8. "ABCD" => "BCD"
	 * 9. "BACD" => "BCD";
	 * 10. "BBAA" => "BBAA"
	 * 11. "BCDE" => "BCDE"
	 * 12. "AABAA" => "AABAA"
	 * 13. "BCDAB" => "BCDAB"
	 * 14. "AAAAAAA" => "AAAAA"
	 */
RemoveCharA removeA;
	
	@BeforeEach
	public void setUp() {
		removeA= new RemoveCharA();
	}
	
	@Test
	public void test0Chars() {
		assertEquals("", removeA.removechar(""));
	}
	@Test
	public void test1A() {
		assertEquals("", removeA.removechar("A"));
	}
	
	@Test
	public void test1CharNoA() {
		assertEquals("B", removeA.removechar("B"));
	}
	
	@Test
	public void test2Chars() {
		assertEquals("", removeA.removechar("AA"));
	}
	
	@Test
	public void test2CharsRemove1A() {
		assertEquals("B", removeA.removechar("AB"));
	}
	
	@Test
	public void test2CharsRemove1AAtSecond() {
		assertEquals("B", removeA.removechar("BA"));
	}
	
	@Test
	public void test4CharsRemove2A() {
		assertEquals("CD", removeA.removechar("AACD"));
	}
	
	@Test
	public void test4Chars1AAtFirst() {
		assertEquals("BCD", removeA.removechar("ABCD"));
	}
	
	@Test
	public void test4Chars1AAtSecond() {
		assertEquals("BCD", removeA.removechar("BACD"));
	}
	
	@Test
	public void test4CharsNoAlastPosition() {
		assertEquals("BBAA", removeA.removechar("BBAA"));
	}
	
	@Test
	public void test4CharsNoA() {
		assertEquals("BCDE", removeA.removechar("BCDE"));
	}
	
	@Test
	public void testNChars() {
		assertEquals("BAA", removeA.removechar("AABAA"));
	}
	
	@Test
	public void testNCharsNoAAtFirstSecondPosition() {
		assertEquals("BCDAB", removeA.removechar("BCDAB"));
	}
	
	@Test
	public void testNCharsOfAllA() {
		assertEquals("AAAAA", removeA.removechar("AAAAAAA"));
	}

	
}
