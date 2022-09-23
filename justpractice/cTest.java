package justpractice;

abstract class c1{
	public c1(){
		System.out.print(1);
	}
}

class c2 extends c1{
	public c2(){
		System.out.print(2);
	}
}
class c3 extends c2{
	public c3(){
		System.out.print(3);
	}
}

public class cTest {
	public static void main(String[] args) {
		Object obj = new c3();
	}
}
