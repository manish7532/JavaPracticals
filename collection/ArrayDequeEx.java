package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Coffee");
		deque.offer("Tea");
		deque.offer("Ice-Tea");
		deque.offer("Coldrink");
		deque.offer("Sandwich");
		deque.offer("Tea");
		for(String string : deque)
		{
			System.out.println(string);
		}
		System.out.println("\nRemoving 1st element : ");
		deque.pollFirst();
		for(String string : deque)
		{
			System.out.println(string);
		}
		System.out.println("\nRemoving last element : ");
		deque.pollLast();
		for(String string : deque)
		{
			System.out.println(string);
		}
		
	}

}
