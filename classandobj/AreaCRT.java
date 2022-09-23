package classandobj;

import java.util.Scanner;

public class AreaCRT {
	double r,b,l,h,s,area;
	Scanner sc = new Scanner(System.in);
	public void accept() 
	{
		System.out.println("Enter radius: ");
		r = sc.nextDouble();
		System.out.println("Enter side : ");
		  s= sc.nextDouble();
		 System.out.println("Enter breadth & lenght : ");
		  b= sc.nextDouble();
		 l= sc.nextDouble();
		 System.out.println("Enter base & height : ");
		  b= sc.nextDouble();
		 h= sc.nextDouble();
	}
	
	public void circle()
	{
		
		double area=3.14*r*r;
		System.out.println("Area of cirlce "+area);;
		
	}
	public void square()
	{
		
		double q= s*s;
		System.out.println("Areap of square "+q);
		
	}
	
	public double rectangle()
	{
		
		double area= b*l;
		return area;
	}
	public double triangle()
	{
		
		double area= 0.5*b*h;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AreaCRT obj = new AreaCRT();
			obj.accept();
			obj.circle();
			obj.square();
			double x=obj.rectangle();
			double y=obj.triangle();
			
			
			System.out.println("Areap of rectangle "+x);
			System.out.println("Areap of triangle "+y);
	}

}
