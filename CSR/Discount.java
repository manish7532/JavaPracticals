package CSR;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int purchase;
		double discount;
		System.out.println("Enter your purchase amount:");
		
		Scanner sc = new Scanner(System.in);
		purchase = sc.nextInt();
		
		if(purchase>=10000) {
			discount=purchase*0.1;
		}
		else {
			discount=purchase*0.02;
			}
		System.out.println("Discount on purchase "+discount);
	}

}
