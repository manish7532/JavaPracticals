package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JunitEx1 test1 = new JunitEx1();
		int c = test1.countA("Arya");
		
		assertEquals(3, c);
	}

}