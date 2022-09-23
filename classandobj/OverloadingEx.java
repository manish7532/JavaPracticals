package classandobj;

public class OverloadingEx {
		
	public void add(int a, int b, int c)  
	{
		System.out.println("Addition numeric values : "+(a+b+c));
	}
	public float add(float x, float y)  
	{
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			OverloadingEx obj = new OverloadingEx();
			float r=obj.add(3.7f, 4.9f);
			obj.add(3, 56, 23);
		System.out.println("Addition decimal values : "+r);
	}

}
