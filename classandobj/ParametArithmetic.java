package classandobj;

import java.util.Scanner;

public class ParametArithmetic {
	int a,b;

	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum "+c);
	}
	public int sub(int a,int b)
	{
		int c= a-b;
		return c;
	}
	public int mul(int a,int b)
	{
		int c= a*b;
		return c;
	}
	public double div(int a,int b)
	{
		double c = a/b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ParametArithmetic obj = new ParametArithmetic();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 no: ");
			int m= sc.nextInt();
			int n = sc.nextInt();
			
			obj.add(m, n);
			int r=obj.sub(m, n);
			int s= obj.mul(m, n);
			double x= obj.div(m, n);
			System.out.println("Sub "+r);
			System.out.println("Mul "+s);
			System.out.println("Div "+x);
	}

}
