package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployee {

	Employee emp = new Employee();
	
	@Test
	public void testCalculateSalary() {
	     emp.setId(101);
	     emp.setName("Tejas");
	     emp.setAge(21);
	     emp.setMonthlySalary(20000);
	     
	     double salary = emp.calcYearlySalary(emp);
	     assertEquals(240000, salary,0.0);
	}
	@Test
	public void testCalculateApparaisal() {
	     emp.setId(102);
	     emp.setName("Manish");
	     emp.setAge(21);
	     emp.setMonthlySalary(35000);
	     
	     double apparaisal = emp.calcApparaisal(emp);
	     assertEquals(1000, apparaisal,0.0);
	}	

}
