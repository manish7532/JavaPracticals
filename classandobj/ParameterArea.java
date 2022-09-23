package classandobj;

import java.util.Scanner;

public class ParameterArea {
	double r,b,l,h,s,area;
	
	
	
	public void circle(double r)
	{
		
		double area=3.14*r*r;
		System.out.println("Area of cirlce "+area);;
		
	}
	public void square(double s)
	{
		
		double area= s*s;
		System.out.println("Areap of square "+area);
		
	}
	
	public double rectangle(double b,double l)
	{
		
		double area= b*l;
		return area;
	}
	public double triangle(double b,double h)
	{
		
		double area= 0.5*b*h;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			ParameterArea obj = new ParameterArea();
			System.out.println("Enter radius: ");
			double m = sc.nextDouble();
			System.out.println("Enter side : ");
			double  n= sc.nextDouble();
			 System.out.println("Enter breadth & lenght : ");
			 double o= sc.nextDouble();
			double p = sc.nextDouble();
			 System.out.println("Enter base & height : ");
			 double q= sc.nextDouble();
			 double r= sc.nextDouble();
			obj.circle(m);
			obj.square(n);
			double x=obj.rectangle(o, p);
			double y=obj.triangle(q, r);
			
			
			System.out.println("Areap of rectangle "+x);
			System.out.println("Areap of triangle "+y);
	}

}
