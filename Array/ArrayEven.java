package Array;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  size,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array :");
		size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter "+size+" Elements : ");
		for( i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		for( i=0;i<a.length;i++) 
		{
		if(a[i]%2==0)
		System.out.println("Even no form given array are :" +a[i]);
		}

	}

}
