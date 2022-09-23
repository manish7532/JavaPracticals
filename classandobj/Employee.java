package classandobj;

import java.util.Scanner;

public class Employee {
         String empName;
         double empCode,basicSalary,allowence,grossSalary,tax,netSalary;
	     Scanner sc = new Scanner(System.in);
	     
	     public void accept()
	 	{
	 		Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter employee name, code & basic salary: ");
	 		empName = sc.next();
	 	    empCode = sc.nextDouble();
	 	    basicSalary = sc.nextDouble();	 	    
	 	}    
	     public void allow()
	     {
	    	allowence = basicSalary * 0.55;	    	
	     }
	     public void gross()
	     {
	    	grossSalary = allowence + basicSalary;	    
	     }
	     public void tax()
	     {
	        tax = grossSalary*0.12;	    	
	     }
	     public void net()
	     {
	        netSalary = grossSalary-tax;
	     }
	     public void display()
	     {
	    	 System.out.println( "Employee code "+ empCode); 
	    	 System.out.println( "Employee name: "+ empName ); 
	    	 System.out.println( "Basic Salary "+ basicSalary); 
	    	 System.out.println("Tax : "+tax);
	    	 System.out.println("NetSalary: "+netSalary);
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		obj.accept();
		obj.allow();
		obj.gross();
		obj.tax();
		obj.net();
		obj.display();
	}

}
