package collection;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee e) {
		
		if(age==e.age)
			return 0;
		else if(age>e.age)
			return 1;
		else
			return -1;
	}
	
}
