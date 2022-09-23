package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAge {

	@Test
	public void testCheckAge() {
		Age age = new Age();
		age.setAge(18);
		assertTrue(age.checkAge());
	}
	@Test
	public void testWrongAge()
	{
		Age age = new Age();
		age.setAge(16);
		assertFalse(age.checkAge());
	}

}
