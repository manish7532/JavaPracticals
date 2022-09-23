package loop;

import java.util.Scanner;

public class DoArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char operator , ch;	
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Enter 2 numbers");
		
		a = sc.nextInt();
		b = sc.nextInt();		
		 System.out.println("Choose an operator: +, -, *, or /");
		operator = sc.next().charAt(0);
		switch(operator) {
		case '+': System.out.println("Add: "+(a+b));
		break;
		case '-': System.out.println("Sub: "+(a-b));
		break;
		case '*': System.out.println("Mul: "+(a*b));
		break;
		case '/': System.out.println("Div : "+(a/b));
		break;
		default: System.out.println("Invalid choice");
		}
		System.out.println("Enter y to continue:");
		ch = sc.next().charAt(0);
	  }	
		while(ch=='y' || ch=='Y');
	}
 }
