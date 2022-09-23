package designpatterns;

interface Shape {
	
	void draw();

}

class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In Rectangle class : draw()");
	}
}

class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In Circle class : draw()");
	}
}

class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In Square class : draw()");
	}
}

class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType==null)
		{
			return null;
		}
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("Square"))
		     return new Square();
		
		return null;
	}
	
}

public class FactoryPatternDemo{
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//get obj of circle and call it's draw()
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		

		//get obj of Rectangle and call it's draw()
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		

		//get obj of Square and call it's draw()
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
	}
}