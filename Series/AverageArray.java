package Series;

import java.util.Scanner;


public class AverageArray {
	public float avgArray(float arr[] , float n) 
	{
		float  avg,sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
	return avg=sum/n;
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
		float Arr[]=new float [n];
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
		AverageArray av = new AverageArray();
		float a = av.avgArray(Arr,n);
		
			System.out.println("Average of Array : "+String.format("%.2f",a));

}
}
