package loop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, i=1,sum=0,temp,count=0;
	        Scanner sc =new Scanner(System.in);
	        System.out.println(" Enter your Number");
	        n= sc.nextInt();
	        
	        temp=n;
	        while(n>0)
	        {
	        	count++;
	            i=n%10;
	            sum=sum+(i*i*i);
	            
	            n=n/10;
	        }
	        System.out.println(count);
	        if(temp==sum)
	            System.out.println(+temp +" is Armstrong Number");
	            else
	            System.out.println(+temp +" is Not Armstrong Number");
             
	}

}
