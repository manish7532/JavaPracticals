package loop;
import java.util.Scanner;

   public class Factorial {

	   public static void main(String args[])
	   {
         int i, fact=1, no;
         
         System.out.println("Enter the number :");
         
         Scanner sc = new Scanner(System.in);
         no = sc.nextInt();

         for(i = 1; i<=no; i++) {
            fact = fact * i;
         }
         System.out.println("Factorial of " +no+ " is: " +fact);
      }
   }