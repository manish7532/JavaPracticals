package relationship;

public class Test2 {
	
	public static void main(String[] args)
	{
		Student s1 =new Student();
		s1.calculate();
		s1.display();
		
		System.out.println();
		
		Student s2 =new Student(21, "Tejas",new MyDate (24,06,2002),60, 70,55);
		s2.calculate();
		s2.display();
		/*Employee e1 = new Employee();
		e1.display();
		
		Employee e2 = new Employee(102, "Rohan",new MyDate(18, 07, 1992),new Address("a/p Baramati","Bhigwan Road","Pune","Maharashtra",413102));
		e2.display();*/
	}
}