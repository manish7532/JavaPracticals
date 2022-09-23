package justpractice;

import java.util.Scanner;

public class Diff4 {
	
	public static void main(String[] args) {
	
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Arraysize");
			System.exit(0);
		}
		int arr[]=new int [n];
		System.out.println("Enter " +n+ " elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		for(int j=0;j<arr.length-1;j++)
		{  
			int d = arr[j]-arr[j+1];
			if(d>=4 || d<=-4)
			{
				flag = 1;
			}
			else {
				flag = 0;
			}
		}
		
	System.out.println(flag);
		
	}

}
