package classandobj;

import java.util.Scanner;

public class Student {	
		int a,b,c,id, m,t;
		String name;
		double p;

		public Student()
		{
			id=12;
			name = "abc";
			System.out.println("\nStudent nabme : "+name);
			System.out.println("Student id : "+id);
			a=86;
			b=70;
			c=69;
		}
		
		public Student(int a, int b, int c)
		{
			this.a=a;
			this.b=b;
			this.c=c;	
		}
		
		public void per()
		{
			t=a+b+c;
			p=t/3;
			System.out.println("Student percentage is : " +p+"%");
		}
		public static void main(String[] args) {		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student name : ");
			String name = sc.next();
			System.out.println("Enter Student id : ");
			String id = sc.next();
			
			System.out.println("Enter your marks of Physics,chemistry & maths subject : ");
			int p=sc.nextInt();
			int c=sc.nextInt();
			int m=sc.nextInt();
			
			sc .close();
			System.out.println("Student name : "+name);
			System.out.println("Student id : "+id);
			
			Student s= new Student(p,c,m);
			s.per();
			
			Student s2 = new Student();
			s2.per();						
	}
 }
