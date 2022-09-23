package designpatterns;

import java.util.Scanner;

interface Food{
	public String prepareFood();
	   public double foodPrice();
}

class VegFood implements Food{
	@Override
	public String prepareFood() {
	return "food";
}

	@Override
	public double foodPrice() {
	return 50.0;
}
}
abstract class FoodDecorator implements Food{ 
	private Food newFood;  

	public FoodDecorator (Food newFood) {
	super();
	this.newFood = newFood;
}

	@Override
	public String prepareFood() {
	return newFood.prepareFood();
}
	@Override
 	public double foodPrice() {
	return newFood.foodPrice();
	}
}
class NonVegFood extends FoodDecorator{
	public NonVegFood(Food newFood) { 
	super(newFood);
}

@Override
	public String prepareFood() {
	return super.prepareFood ()+ "Roasted chicken";
}
@Override
	public double foodPrice() {
	return super.foodPrice()+150;
	}
}
class ChineeseFood extends FoodDecorator{

	public ChineeseFood (Food newFood) { 
		super(newFood); 
}

@Override
	public String prepareFood() {
	return super.prepareFood()+ "Fried Rice and Manchurian";
}

@Override
	public double foodPrice() {
	return super.foodPrice()+100;
		}
}
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		

		int choice; 
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println(" --Food Menu----");
		System.out.println("Enter your choice");
		System.out.println("1.Veg Food \n2.Non-veg Food \n3.Chineese Food \n4. Exit");
		choice = sc.nextInt();

		switch(choice)
		{
		case 1:
		VegFood vegFood = new VegFood();
		System.out.println(vegFood.prepareFood()); 
		System.out.println(vegFood.foodPrice());
		break;

		case 2:
		Food f1 = new NonVegFood (new VegFood());
		System.out.println(f1.prepareFood());
		System.out.println(f1.foodPrice());
		break;
		case 3: 
		Food f2 = new NonVegFood (new VegFood());
		System.out.println(f2.prepareFood());
		System.out.println(f2. foodPrice()); 
		break;
		
		default: System.out.println("other than these no food available");
		}
		}
		while(choice !=4);
	
	
}
}