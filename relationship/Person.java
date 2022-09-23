package relationship;

public class Person {
	int id;
	String name;
	MyDate dob;
	
	public Person()
	{
		id=101;
		name="Manish";
		dob = new MyDate();
	}
	
	public Person(int id, String name, MyDate dob)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
	}
	public void display()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		dob.display();
	}
}
