package Array;

import java.util.Scanner;

public class MAtrixInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0,y = 0;
		int a[][]  = {{x},{y}};
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row & column: ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Enter matrix elements: ");
	
		a[x][y]= sc.nextInt();
		
		  for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}


	}

}
