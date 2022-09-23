package CSR;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a>0)
		{
			System.out.println("Number is positive");
		}
		else if(a<0)
		{
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		}
	}
}
