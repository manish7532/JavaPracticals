package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotations {
	
	//@BeforeClass and @AfterClass methods must be static
	
	@Before
	public void before()
	{
		System.out.println("In before");
	}
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("In before Class");
	}

	@AfterClass
	public static void afterClass()
	{
		System.out.println("In after class");
	}
	
	@After
	public  void after()
	{
		System.out.println("In after");
	}
	
	@Test
	public  void test()
	{
		System.out.println("In test");
	}
	
	@Ignore
	public  void ignore()
	{
		System.out.println("In ignore");
	}
	
}

