package loop;

import java.util.Scanner;

public class DoWhileArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,b,l,h;	
		char ch;
		Scanner sc = new Scanner(System.in);
		do{
		 System.out.println("Choose an option:1,2 or 3");
		  int opt = sc.nextInt();
		switch(opt) {
		case 1: 
			System.out.println("enter radius:");
			r = sc.nextInt();
			System.out.println("Area of circle: "+(r*r*3.14));
		break;
		case 2:
			System.out.println("enter b & l :");
			b = sc.nextInt();
			l = sc.nextInt();
			System.out.println("Area of rectangle: "+(b*l));
		break;
		case 3:
			System.out.println("enter b & h :");
			b = sc.nextInt();
			h = sc.nextInt();
			System.out.println("Area of triangle: "+(b*h*0.5));
		break;
		default: System.out.println("Invalid choice");
		}
		System.out.println("Enter y to continue ");
		ch = sc.next().charAt(0);	
		}
		while(ch== 'y' || ch=='Y');
}

}
