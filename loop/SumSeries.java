package loop;
import java.util.Scanner;
public class SumSeries 
{
    public static void main(String[] args) 
    {
        
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of terms in series:\n");
        n = sc.nextInt();
       
        for(int i = 1; i <= n; i++)
        {
        	System.out.print(i+"/"+i);
        	if(i<n)
            System.out.print(" + ");
            sum = sum +(i/i);
        }
        System.out.println("\nSum of series = "+sum);
    }

}
