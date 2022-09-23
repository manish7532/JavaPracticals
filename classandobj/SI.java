package classandobj;

import java.util.Scanner;

public class SI {
	
	float p,r,t,si;
	
	public SI(float p,float r,float t)
	{
		this.p=p;
		this.r=r;
		this.t=t;
		
	}
	
	public void intrest() 
	{
		si=(p*r*t)/100;
		System.out.println("Simple interest is " +si);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your principle ammount : ");
		float x=sc.nextFloat();
		System.out.println("Enter duration: ");
		float y=sc.nextFloat();
		System.out.println("Enter rate of interest: ");
		float z=sc.nextFloat();

		SI s = new SI(x, y, z);
		s.intrest();
	}	

}