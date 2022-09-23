package CSR;

import java.util.Scanner;

public class STax {

	public static void main(String[] args) {
		
		int salary;
		double tax;
		System.out.println("Enter your salary:");
		
		Scanner sc = new Scanner(System.in);
		salary = sc.nextInt();
		
		if(salary<=25000) {
			tax=salary*0.1;
		}
		else {
			tax=salary*0.15;
			}
		System.out.println("Tax on Salary "+tax);
	}
}
