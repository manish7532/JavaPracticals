package Array;

import java.util.Scanner;

public class AvgEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  size,i,even=0,odd=0,sum=0;
		float avg=0,avg2=0;
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
			{
				even++;
				sum=sum+a[i];
				avg=sum/even;
			}
			else
			{
				int sum2=0;
				odd++;
				sum2=sum2+a[i];
				avg2=sum2/odd;
			}
		}
		System.out.println("Average of Even No in Array is : " +avg);
		
		System.out.println("Average of Odd no in Array is : " +avg2);
	}

}
