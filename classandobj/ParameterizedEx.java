package classandobj;

import java.util.Scanner;

public class ParameterizedEx {

	public void add(int a , int b)
	{
		int c=a+b;
		System.out.println("Sum "+c);
	}
	public int sub(int a , int b)
	{
		int c= a-b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedEx p1 = new ParameterizedEx();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no:");
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		p1.add(p, q);
		int r = p1.sub(p, q);
		System.out.println("Sub"+r);

	}

}
