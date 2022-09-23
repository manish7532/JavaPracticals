package designpatterns;

class SingleObject{
	// create an object
	private static SingleObject instance = new SingleObject();
	
	// make private constructor so that this class can not be instantiated
	private SingleObject() {}
	
	//get the only object available
	public static SingleObject getInstance() 
	{
		return instance;
	}  

	public void show()
	{
		System.out.println("Hello World!!!");
	}
}

public class SingletonePatternDemo {

	public static void main(String[] args) {
		//compile error : can't create obj again, constructor is not visible
		//SingleObject obj = new SingleObject();
		
		SingleObject obj = SingleObject.getInstance();
		
		obj.show();
	}
}