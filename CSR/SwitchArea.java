package CSR;
import java.util.Scanner;
public class SwitchArea {
	public static void main(String[] args) {
		int r,b,l,h;	
		Scanner sc = new Scanner(System.in);
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
  }
}
