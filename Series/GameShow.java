package Series;
import java.util.Scanner;
public class GameShow {
	static int count=0;	
	private static int countDigits(int n) {
		if(n<0) {
			count=-1;
		}
		else {
			while(n>0) {
				int m=n%10;
				count++;
				n=n/10;
			}
		}
		return count;	
	}
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int c=countDigits(n);
		if(c==-1)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else 
			System.out.println(c);
		}
	
}