package loop;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		
		int i,num=100,sum=0;
		Scanner sc=new Scanner(System.in);
		for(i = 1; i <= num; i++)  
		{  
			if(i % 2 == 0)
			{
				sum = sum + i;  
	        }  
	    }
		
		System.out.println("Sum of even numbers from 50 to 100 is :" +sum);
	}
 
}