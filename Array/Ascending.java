package Array;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  size,i,j,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array :");
		size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter "+size+" Elements : ");
		for( i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(i=0;i<a.length-1;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
				 {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				  }
			    }
		     }
		
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
