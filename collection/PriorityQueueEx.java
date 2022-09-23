package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Queue<String> queue = new PriorityQueue<String>();
		queue.add("Xiaomi");        
		queue.offer("Apple");        
		queue.offer("Samsung");		
	    queue.offer("Nothing");
	    queue.add("Apple");	
		
		for(String string : queue)
		{
			System.out.println(string);
		}
		System.out.println("\nHead of queue : "+queue.element());
		
		System.out.println("\nRemoving element using remove : "+queue.remove());
		
		System.out.println("\nAfter removing");
		for(String string : queue)
		{
			System.out.println(string);
		}
		System.out.println("\nRemoving element using poll : "+queue.poll());
		System.out.println("\nAfter removing");
		for(String string : queue)
		{
			System.out.println(string);
		}
	}

}
