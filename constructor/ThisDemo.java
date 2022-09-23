package constructor;

public class ThisDemo {
	String str;
	
	public ThisDemo() {
		
		this("Hello");
	}

	public ThisDemo(String str) {
		
		this.str = str;
	}
	public void display() 
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo t1 = new ThisDemo();
		t1.display();

	}

}
