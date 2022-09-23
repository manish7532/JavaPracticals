package loop;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value :"); 
		int n = sc.nextInt();
        for (int i = 1; i <= n; i = i+2) 
        {
            System.out.print((i * i) + " ");
        }
	}
}

