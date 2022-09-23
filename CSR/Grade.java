package CSR;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,c,m,tot;
		System.out.println("Enter marks of three subjects:");
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		c =sc.nextInt();
		m = sc.nextInt();
		
		tot=p+c+m;
		double score=tot/3;
		System.out.println("Score"+score);
		
		if(score>=75)
			{
				System.out.println("Distinction");
			}
		else if(score>=60)
			{
				System.out.println("First class");
			}
		else if(score>=45)
			{
				System.out.println("Higher class");
			}
		else if(score>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
