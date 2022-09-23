package Series;

import java.util.Scanner;

public class NoSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    double sum = 0.0;
	    int i;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value :"); 
		int n = sc.nextInt();
        for ( i = 1; i <= n; i++)
        {
        	System.out.print(i+"*"+(i+1));
        	if(i<n)
                System.out.print(" + ");
            sum += (i *(i + 1));
        }
        
        System.out.println("\nSum = " + sum);
    }

	}


