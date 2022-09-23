package loop;

import java.util.Scanner;

public class DoWhileAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter 2 numbers: ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a+b;
			System.out.println("Sum "+c);
			System.out.println("Enter y to continue");
			ch = sc.next().charAt(0);
		    }
		while(ch=='y' || ch=='Y');
	}
}
