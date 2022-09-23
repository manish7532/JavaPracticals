package loop;

import java.util.Scanner;

public class Table {
	
	public static void main(String args[])   
	{  
		
		int a,num;
		System.out.print("Enter number: ");
		
		Scanner sc = new Scanner(System.in);         
		num=sc.nextInt();  	
		
		for(a=1; a <= 10; a++)  
		{	  
			System.out.println(num+" * "+a+" = "+num*a);  
		}  
	}  
	
}