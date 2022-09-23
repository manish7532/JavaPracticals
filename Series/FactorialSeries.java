package Series;

import java.util.Scanner;

public class FactorialSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double fact = 1,n,sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the no. of terms in series:\n");
	        n = sc.nextInt();
	       
	        for(int i = 1; i <= n; i++)
	        {
	        	System.out.print(i+"/"+i+"!");
	        	if(i<n)
	            System.out.print(" + ");
	        	fact=fact*i;
	            sum = sum +(i/fact );
	        }
	        System.out.println("\nSum of series = "+sum);
	}

}
