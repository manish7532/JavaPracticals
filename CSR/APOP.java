package CSR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APOP {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int a,b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Numbers:");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		System.out.println("Sum="+(a+b));
		System.out.println("Sub="+(a-b));
		System.out.println("Mul="+(a*b));
		System.out.println("Div="+(a/b));
		System.out.println("Mod="+(a%b));
	}
}
