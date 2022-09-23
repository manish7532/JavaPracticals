package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertionMethods {

	@Test
	public void testAssertions() {
		String str1 = new String("Raj");
		String str2 = new String("Raj");
		String str3 = "Welcome";
		String str4 = "Welcome";
		String str5 = null;
		
		int a=10;
		int b=10;
		
		assertEquals(str1, str2);
		
		assertTrue(a==b);
		
		assertFalse(a>b);
		
		assertSame(str3, str4);
		
		assertNotSame(str1, str4);
		
		assertNull(str5);
		
		assertNotNull(str3);
		
		String a1[]= {"one","two","three"};
		String a2[]= {"one","two","three"};
		
		assertArrayEquals(a1,a2);
		
	}

}
