package loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		  int r,sum=0,temp,n;    
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number: ");
		  n= sc.nextInt();
		  temp=n;    
		  while(n>0)
		  {    
		   r=n%10;    
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(+temp+ " is palindrome number ");    
		  else    
		   System.out.println(+temp+ " is not palindrome number ");    
		}  

	}