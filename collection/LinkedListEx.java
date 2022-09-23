package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Manish");
		list.add("Tejas");
		list.add("Suyog");
		list.add("Sachin");
		list.add("Shivraj");
		list.add(null);
		
		System.out.println("Iterating elements using iterator ");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\nIterating elements using for each ");
		for(String string : list) 
		{
			System.out.println(string);
		}
		
	}
	

}
