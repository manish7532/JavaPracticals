package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApple {

	@Test
	public void testCorrectColor() {
		Apple apple = new Apple();
		apple.setColor("Green");
		assertTrue(apple.checkColor());
	}
	@Test
	public void testWrongColor()
	{
		Apple apple = new Apple();
		apple.setColor("blue");
		assertFalse(apple.checkColor());
	}
	
}
