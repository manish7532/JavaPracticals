package CSR;

import java.util.Scanner;

public class CallCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calls,charge;
		
		System.out.println("Enter number of calls:");
		
		Scanner sc = new Scanner(System.in);
		calls = sc.nextInt();
		
		if(calls<=200) {
			charge=calls*1;
		}
		else {
			charge=calls*3;
			}
		System.out.println(charge+" Rs is charge for "+calls+" calls.");

	}

}
