package loop;

import java.util.Scanner;

public class DoVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char opt;
		do{
    	System.out.println("Enter a alphabet : ");
    	char ch=sc.next().charAt(0); 
    	switch(ch)
    	{
    	   case 'a' :
    	   case 'e' :
           case 'i' :
    	   case 'o' :
    	   case 'u' :
    	   case 'A' :
    	   case 'E' :
    	   case 'I' :
    	   case 'O' :
    	   case 'U' : 
    		 System.out.println(ch+" is a Vowel");
    		break;   
            default:
    		System.out.println(ch+" is a Consonant");  
    	}
    	System.out.println("Enter y to continue");
           opt=sc.next().charAt(0); 
	  }
		while(opt=='y' || opt=='Y');
	}
  }
