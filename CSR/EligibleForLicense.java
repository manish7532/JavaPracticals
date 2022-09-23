package CSR;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class EligibleForLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		System.out.println("Enter your age:");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Your eligible for license");
		}
		else {
			System.out.println("Your not eligible");
		}

	}

}
