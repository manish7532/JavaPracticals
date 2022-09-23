package CSR;
import java.util.Scanner;
public class ArithmeticSwitch {
	public static void main(String[] args) {
		int a,b;
		char operator;	
		System.out.println("Enter 2 numbers");
		Scanner sc = new Scanner(System.in);
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
  }
}
