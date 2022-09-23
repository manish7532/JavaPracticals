package Array;

import java.util.Scanner;

public class ArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  size,i,sum=0,prod=1;
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
			sum=sum+a[i];
		}
		System.out.println("Sum of Even No in Array is :" +sum);
		for( i=0;i<a.length;i++) 
		{
		if(a[i]%2!=0)
			prod=prod*a[i];
		}
		System.out.println("Product of Odd no in Array is :" +prod);
	}
}
