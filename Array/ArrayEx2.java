package Array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
		int a[] = new int[size];
        
		System.out.println("Enter "+size+" array elements ");
		for(i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Array elemenys:");
		
		for(i=0;i<size;i++) {
		System.out.println(a[i]);
		}
		
	}

}
