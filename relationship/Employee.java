package relationship;

public class Employee {
	
	int id;
	MyDate dob;
	String name;
	Address adr;
	
	public Employee()
	{
		id=101;
		name="Manish";
		dob=new MyDate();
		adr= new Address();
		
	}
	
	public Employee(int id, String name,MyDate dob,Address adr)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.adr=adr;
	}
	
	public void display() {
		System.out.println("Id :"+id);
		System.out.println("Name : "+name);
		dob.display();
		adr.display();
		System.out.print("\n");
	}

}