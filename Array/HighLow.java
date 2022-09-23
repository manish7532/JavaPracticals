package Array;

import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		size=sc.nextInt();
		int a[]=new int[size];
		int max=a[0];
		System.out.println("Enter " +size+ " array element : ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Highest no from array is :" +max);
		
		System.out.println("Lowest no from array is :" +min);
	}

}
