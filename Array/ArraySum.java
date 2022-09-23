package Array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  size,i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array :");
		size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter "+size+" Elements : ");
		for( i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Sum of array elements is :");
		for( i=0;i<a.length;i++) 
		{
		if(a[i]>0){
			sum=sum+a[i];
		}
		}
		System.out.println(sum);
	}

}
