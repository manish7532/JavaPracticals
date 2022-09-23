package CSR;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		System.out.println("Enter 3 no:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b =sc.nextInt();
		c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greatest no");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greatest no");
		}
		else
		{
			System.out.println(c+" is greatest no");
		}

	}

}
