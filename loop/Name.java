package loop;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int i;
		   String name;
           
           System.out.println("Enter your name:");
           Scanner sc = new Scanner(System.in);
           name = sc.next();
           
           for(i=0;i<=5;i++)
           { 
        	   System.out.println(name);
           }
		
	}

}
