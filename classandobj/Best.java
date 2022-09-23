package classandobj;

import java.util.Scanner;

public class Best {
      String custName;
      double phoneNo,noCalls,tax,bill,finalBill;
      Scanner sc = new Scanner(System.in);
	     
	     public void accept()
	 	{
	 		Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter customer name ");
	 		custName = sc.next();
	 		System.out.println("Enter customer phone no : ");
	 	    phoneNo = sc.nextDouble();
	 	   System.out.println("Enter number of calls: ");
	 	    noCalls = sc.nextDouble();
	 	    sc.close();
	 	}    
	     public void billing()
	     {
	    	 if(noCalls<=100) {
	    		 bill=noCalls*0;
	    		 System.out.println("No Charge for number of calls under 101.");
	    		 System.exit(0);
	    	 }
	    	 else if(noCalls<=300) {
	    		 bill=noCalls*0.80;
	    	 }
	    	 else if(noCalls<=500) {
	    		 bill=noCalls*1.25;
	    	 }
	    	 else  {
	    		 bill=noCalls*2.50;
	    	 }
	    	 tax=bill*0.12;
	    	 finalBill=bill+tax;
	    	 System.out.println("Bill :"+bill);
	    	 System.out.println("Tax :"+tax);    	 
	    	 System.out.println("The final bill amount is :"+finalBill);
	     } 
	public static void main(String[] args) {
	
		Best obj = new Best();
		obj.accept();
		obj.billing();
	}

}
