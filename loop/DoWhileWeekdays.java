package loop;

import java.util.Scanner;

public class DoWhileWeekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		char ch;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Enter day number: ");
         day = sc.nextInt();		
		 switch(day)
	        {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("Invalid");
	                break;    
	        }
		 System.out.println("Enter y to continue ");
			ch = sc.next().charAt(0);
	}
        while(ch=='y' || ch=='Y');
	}

}
