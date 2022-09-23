package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JunitEx1 testCase = new JunitEx1();
		int sq = testCase.square(5);
		
		assertEquals(25, sq);  //expected,output (passed values)
	}

}
