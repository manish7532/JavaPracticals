package relationship;

public class Test {
	
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.display();
		
		Person p2 = new Person(102, "Rajesh",new MyDate(17, 8, 1999));
		p2.display();
	}

}