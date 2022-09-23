package Array;

import java.util.Scanner;

public class AscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,j,i,temp;
		Scanner sc= new Scanner(System.in);
		int a[]=new int[size=10];
		int max=a[0];
		System.out.println("Enter " +size+ " array element : ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nOrder : "); 
		for(i=0;i<5;i++)
		{
			System.out.print( a[i]+" ");
		}
		for(i=a.length-1;i>=5;i--)
		{
			System.out.print( a[i]+ " ");
		}

	}

}
