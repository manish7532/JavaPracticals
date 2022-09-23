package CSR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int b,l;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter B & L:");
		b = Integer.parseInt(br.readLine());
		l = Integer.parseInt(br.readLine());
		
		int Area= b*l;
		System.out.println("Area of rectangle="+Area);

}
}