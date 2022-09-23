package classandobj;

import java.util.Scanner;

public class Triangle {
	double b,h,area;
	public Triangle() 
	{
		b=2;
		h=4;
	}
	public Triangle(double b,double h) 
	{
		this.b=b;
		this.h=h;
	}
	public void area() 
	{
		System.out.println("Area of triangle : "+(0.5*b*h));
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base & height : ");
		double m = sc.nextDouble();
		double n = sc.nextDouble();
		 sc.close();
		  
		  Triangle obj = new Triangle(m, n);
			obj.area();
			 Triangle obj2 = new Triangle();
			 obj2.area();
	}

}
