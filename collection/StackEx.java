package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<String> stack = new Stack<String>();
			stack.add("Xiaomi");        // 4=Xioami
			stack.push("Apple");        // 3=Apple
			stack.push("Samsung");		// 2=Samsung
			stack.push("Nothing");		// 1=Nothing
			stack.push(null);
			
			System.out.println(stack);
			
			System.out.println("removing element "+stack.pop());
			
			System.out.println(stack);
			
			System.out.println("searching element : "+stack.search("Apple"));
			
			System.out.println("searching element :"+stack.search("Blackberry"));
	}

}
