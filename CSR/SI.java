package CSR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SI {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int p,r,t,SI;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter P,R & T:");
		p = Integer.parseInt(br.readLine());
		r = Integer.parseInt(br.readLine());
		t = Integer.parseInt(br.readLine());
		
		SI= p*r*t/100;
		System.out.println("Simple Interst="+SI);
	
		
	}

}
