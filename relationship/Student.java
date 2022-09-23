package relationship;

public class Student extends Person{
	float m1,m2,m3,total,percent;
	
	public Student() 
	{
		super();
		m1=67;
		m2=78;
		m3=59;
		
	}
	public Student(int id,String name,MyDate dob,float m1,float m2,float m3) 
	{
		super(id,name,dob);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void calculate() 
	{
		total=m1+m2+m3;
		percent=total/3;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Total :"+total);
		System.out.println("Percent :"+percent);
	}

}
