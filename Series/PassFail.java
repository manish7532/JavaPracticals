package Series;
import java.util.Scanner;

public class PassFail {
	static int cleared[] = new int[10];
	static int j;
	public static void clearedStage1(int Array[], int size)
	{
	   for(int i=0;i<Array.length;i=i+3) {
			if(Array[i+1]>=70 && Array[i+2]>=70)
			{
				cleared[j] = Array[i];
				j++;
			}
	   }
	   for(int k=0;k<j;k++)
	   {
		   System.out.println(cleared[k]);
	   }	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size=sc.nextInt();
		if(size<3)
		{
			System.out.println("Invalid Array size");
			System.exit(0);
		}
		int Array[]=new int [size];
		System.out.println("Enter id & scores resp.");
		for(int i=0;i<size;i++)
		{
			Array[i]=sc.nextInt();
			if(Array[i]<0)
			{
				System.out.println("Invalid number");
				System.exit(0);
			}
		}
		clearedStage1(Array, size);
	}
}
