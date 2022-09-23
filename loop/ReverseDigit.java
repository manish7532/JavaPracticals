package loop;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int a,b,sum = 0;
         System.out.println("Enter the Number");
         Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         
          while(a>0)
          {
       	   b=a%10;
       	   sum=(sum*10)+b;
       	   a = a/10;
          }
          System.out.println(sum);

	}

}
