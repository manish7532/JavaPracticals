package classandobj;

import java.util.Scanner;

public class DefualtEx {

	int a,b;
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no: ");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void add()
	{
		int c=a+b;
		System.out.println("Sum "+c);
	}
	public int sub()
	{
		int c= a-b;
		return c;
	}
	public int mul()
	{
		int mul=a*b;
		return mul;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DefualtEx obj = new DefualtEx();
			obj.accept();
			obj.add();
			int r=obj.sub();
			int s=obj.mul();
			System.out.println("Sub "+r);
			System.out.println("Mul "+s);
	}
	
}
