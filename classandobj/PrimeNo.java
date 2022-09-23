package classandobj;

import java.util.Scanner;

public class PrimeNo {
	int num, i, count=0;
    Scanner s = new Scanner(System.in);
   public void prime()
   { 
    System.out.print("Enter a Number: ");
    num = s.nextInt();
    
    for(i=2; i<num; i++)
    {
       if(num%i == 0)
       {
          count++;
          break;
       }
    }
    
    if(count==0)
       System.out.println(num+" is a Prime Number.");
    else
       System.out.println(num+" is not a Prime Number.");
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PrimeNo obj = new PrimeNo();
			obj.prime();

	}

}
