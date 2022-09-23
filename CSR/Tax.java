package CSR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int Salary;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Salary:");
		Salary = Integer.parseInt(br.readLine());
		
		
		
		double Tax= Salary*0.12;
		System.out.println("Tax on Salary="+Tax);

	}

}
