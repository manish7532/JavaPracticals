package loop;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           double n,i=1,sum=0;
          
           Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the range of number :");
		   n = sc.nextInt();
		   while(i<=n)
		   {
			   System.out.print(1 +"/"+ (i));
			   if(i<n)
				   System.out.print(" + ");
			   i++;
			   sum = sum+(1/i);
			   
		   }
		       System.out.println(" = "+sum); 
		
	}

}
