package loop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			 Scanner cs=new Scanner(System.in); 
			 DecimalFormat format = new DecimalFormat("0.#");
		     int n,i=1, sum=0;
		     System.out.println("Enter the range of number:");
		     n=cs.nextInt();
		     while(i<=n)
		     {
		    	 
		      System.out.print(+i+"/"+(i*i));
		      if(i<n)
		      System.out.print(" + ");
		      i++;
		      sum=sum+(i/i*i);
		 
		      }
		     System.out.println(" = "+sum);
	}

}
