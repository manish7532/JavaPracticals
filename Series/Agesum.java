package Series;

import java.util.Scanner;

public class Agesum {

	public int NewArraySum(int arr[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>18)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Array size");
			System.exit(0);
		}
		int Arr[]=new int [n];
		System.out.println("Enter " +n+ " elements");
		for(int i=0;i<n;i++)
		{
			Arr[i]=sc.nextInt();
			if(Arr[i]<0)
			{
				System.out.println("Invalid number");
				System.exit(0);
			}
		}
		Agesum as= new Agesum();
		System.out.println(as.NewArraySum(Arr, n));
	}

}