package java8features;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private int id,age;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
			
	}
	
	public static List<Student> getStudentList()
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101,20,"Raj"));
		list.add(new Student(102,25,"Reema"));
		list.add(new Student(103,32,"Riya"));
		list.add(new Student(104,35,"Manas"));
		list.add(new Student(105,27,"Ajay"));
		return list;
	}
}