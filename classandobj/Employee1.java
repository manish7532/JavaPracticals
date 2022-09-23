package classandobj;

import java.util.Scanner;

public class Employee1 {

	int id,pd,sal;
	float wd;
	String name;
	
	public Employee1()
	{
		id=123;
		name = "Tejas";
		pd=1000;
		wd=30;
		sal=(int) (wd*pd);
		System.out.println("Salary = " +sal);
	}
	
	public Employee1(int id , String name, int x, int pd)
	{
		this.id=id;
		this.name=name;
		this.wd=x;
		this.pd=pd;
		
	}
	
	
	
	public void salary() 
	{
		sal=(int) (wd*pd);
		System.out.println("Your salary is : " +sal);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Employee ID : ");
		int a=sc.nextInt();
		System.out.println("Enter your name : ");
		String t=sc.next();
		System.out.println("Enter your working days : ");
		int x=(int) sc.nextFloat();
		System.out.println("Enter your per day ammpunt : ");
		int p=sc.nextInt();
		sc.close();
	
	
		
		Employee1 em = new Employee1(a,t,x,p);
		em.salary();
		Employee1 em1 = new Employee1();
		em1.salary();

	}

}
