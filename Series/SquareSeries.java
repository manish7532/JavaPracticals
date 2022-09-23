package Series;

import java.util.Scanner;

public class SquareSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value :"); 
		int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            System.out.print((i * i) + " ");
        }

	}

}
