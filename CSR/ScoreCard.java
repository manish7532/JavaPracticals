package CSR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreCard {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int Sci,Math,Eng,Score;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Sci,Math & Eng:");
		Sci = Integer.parseInt(br.readLine());
		Math = Integer.parseInt(br.readLine());
		Eng = Integer.parseInt(br.readLine());
		
		int Tot=Sci+Math+Eng;
		Score= Tot/3;
		System.out.println("Score="+Score);

	}

}
