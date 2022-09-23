package junit;

public class Employee {
	int id;
	String name;
	int age,monthlySalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public double calcYearlySalary(Employee emp) 
	{
		double yearlySalary = getMonthlySalary()*12;
		return yearlySalary;
	}
	
	public double calcApparaisal(Employee emp)
	{
		double apparaisal=0;
		if(monthlySalary<30000)
		{
			apparaisal=500;
		}
		else
		{
			apparaisal=1000;
		}
		return apparaisal;
		
	}

}
