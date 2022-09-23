package CSR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int r;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Radius:");
		r = Integer.parseInt(br.readLine());
		
		double Area= 3.14*r*r;
		System.out.println("Area of circle="+Area);

	}

}
