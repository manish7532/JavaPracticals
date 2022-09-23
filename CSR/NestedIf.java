package CSR;
import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int pCode,oAmt;
		   double discount;
		   System.out.println("Enter product code ranging from 1 to 3:");			 
		   Scanner sc = new Scanner(System.in);
		   pCode = sc.nextInt();		   
		   if(pCode==1)
		   { 
				 System.out.println("Computer Stationary");
				 System.out.println("Enter order amount:");	
				   oAmt = sc.nextInt();
			     if(oAmt>=500) {
			    	 discount=oAmt*0.12; 	  	 
			                    }
			     else if(oAmt>=300) {
			    	 discount=oAmt*0.08;
		                            }
			     else {
			    	 discount=oAmt*0.02;
		              }  
			     System.out.println("Discount on order:"+discount); 
         }
		   else if(pCode==2)
		   {
				 System.out.println("Fixed Disks");
				 System.out.println("Enter order amount:");	
				   oAmt = sc.nextInt();
			     if(oAmt>=2000) {
			    	 discount=oAmt*0.1;
			    	 System.out.println("Discount on order:"+discount);   	 
			                    }
			     else if(oAmt>=1500) {
			    	 discount=oAmt*0.05;
			    	 System.out.println("Discount on order:"+discount); 
		                              }
			     else {
			    System.out.println("Order is not eligible for discount");
		              }       
            }
		   else if(pCode==3)
		     {
				 System.out.println("Computers");
				 System.out.println("Enter order amount:");	
				   oAmt = sc.nextInt();
			     if(oAmt>=5000) {
			    	 discount=oAmt*0.1;
			    	 System.out.println("Discount on order:"+discount);   	 
			                    }
			     else if(oAmt>=2500) {
			    	 discount=oAmt*0.05;
			    	 System.out.println("Discount on order:"+discount); 
		                              }
			     else {
			    System.out.println("Order is not eligible for discount");
		              }  
			     
           }
		   
  }
}
