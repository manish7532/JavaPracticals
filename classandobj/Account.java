package classandobj;
import java.util.Scanner;
public class Account {
		String Name;
		Double p,n,a,r,x,m;
	  
	    public void accept()
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter Depositors name : ");
	    	Name = sc.next();
	    	System.out.println("Enter principle amount : ");
	    	p = sc.nextDouble();
	    	System.out.println("Enter number of years : ");
	    	n = sc.nextDouble();	
	    	sc.close();
	    }	    
	    public void amount() 
	    {
	    	if(n<1) 
	    	{
	    		r=(double) 9;
	    		m= (1+r/100);
		        x=Math.pow(m, n);   
	    	}
	    	else if(n>=1 && n<=3) 
	    	{
	    		r=(double) 9.25;
	    		m= (1+r/100);
		        x=Math.pow(m, n);   
	    	}
	    	else if(n>=3 && n<=5) 
	    	{
	    		r=(double) 9.5;
	    		m= (1+r/100);
		        x=Math.pow(m, n);   
	    	}
	    	else 
	    	{
	    		r=(double) 9.75;
	    		m= (1+r/100);
	           	x=Math.pow(m, n);    		
	    	}
	    	a=p*x;
	    	System.out.println("\nDepositors name : "+Name);
	    	System.out.println("\nPrinciple amount : "+p);
	    	System.out.println("\nDuration : "+n);	    	
	    	System.out.println("\nRate of interest for "+n+" years is : "+r);
	    	System.out.println("\nAccumulated amount is "+a);
	    }	
	public static void main(String[] args) {
		
				Account obj = new Account();
				obj.accept();
				obj.amount();
	}
 }
