package Array;

import java.util.Scanner;

public class EvenOddFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,x=0,y=0,z=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
		int a[] = new int[size];
        
		System.out.println("Enter "+size+" array elements ");
		for(i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for( i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0){
			x++;
		}
			
			else if(a[i]%2==0){
					y++;
				}
		}
		System.out.println("Frequncy of odd no =" +x);
		
		System.out.println("Frequncy of even no =" +y);
	}

}
