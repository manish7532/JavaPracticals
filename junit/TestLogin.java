package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogin {

	@Test
	public void testCheckLogin() {
		Login login = new Login();
		login.setUsername("admin");
		login.setPassword("admin123");
		assertTrue(login.checkLogin());
	}
	@Test
	public void testWrongAge()
	{
		Login login = new Login();
		login.setUsername("adMIN");
		login.setPassword("ADMIN12345");
		assertFalse(login.checkLogin());
	}

}
