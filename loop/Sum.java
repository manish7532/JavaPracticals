package loop;

public class Sum {

	public static void main(String[] args)   
	{  
		int i, num = 10, sum = 0;  
	 
		for(i = 1; i <= num; i++)  
		{  
			sum = sum + i;  
	    }  
		
		System.out.println("Sum of first 10 natural numbers is "+sum);  
	}  
	
}