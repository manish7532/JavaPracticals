package CSR;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Number is even.");
		}
		else {
			System.out.println("Number is odd.");
		}

	}

}
