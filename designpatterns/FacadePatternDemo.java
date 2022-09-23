package designpatterns;

import java.util.Scanner;

interface MobileShop{
	public void modelNo();
	public void price();	
}
class Iphone implements MobileShop{
	@Override
	public void modelNo() {
		System.out.println("Iphone 12");
	}
	@Override
	public void price(){
		System.out.println("Rs.65000");
	}
}

class Samsung implements MobileShop{
	@Override
	public void modelNo() {
		System.out.println("Samsung Galaxy S21FE");
	}
	@Override
	public void price(){
		System.out.println("Rs.49000");
	}
}

class Blackberry implements MobileShop{
	@Override
	public void modelNo() {
		System.out.println("Blackberry Z10");
	}
	@Override
	public void price(){
		System.out.println("Rs.55000");
	}
}

class Shopkeeper{
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;
	
	public Shopkeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}
	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}
	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}
	public void blackberrySale() {
		blackberry.modelNo();
		blackberry.price();
	}
}

public class FacadePatternDemo {

	public static void main(String[] args) {
	
		int choice;
		Shopkeeper shopkeeper = new Shopkeeper();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter your choice. \n1.Iphone\n2.Samsung\n3.Blackberry\n4.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:shopkeeper.iphoneSale();
			break;

			case 2: shopkeeper.samsungSale();
			break;
			
			case 3: shopkeeper.blackberrySale();
			break;

			default: System.out.println("Invalid choice");
			}
		}
		while(choice!=4);
	}

}
