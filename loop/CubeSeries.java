package loop;

import java.util.Scanner;

public class CubeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs=new Scanner(System.in); 
	     int n,i=1;
	     System.out.println("Enter the range of number:");
	     n=cs.nextInt();
	     while(i<=n)
	     {
	      System.out.print(i*i*i+" ");
	      i++;
	     }

	}

}
