package CSR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int b,h;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter B & H:");
		b = Integer.parseInt(br.readLine());
		h = Integer.parseInt(br.readLine());
		
		double Area= 0.5d*b*h;
		System.out.println("Area of Triangle="+Area);
		
	}

}
