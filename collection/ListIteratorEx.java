package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {


		ArrayList<String> list = new ArrayList<String>();
		list.add("Suyog");
		list.add("Tejas");
		list.add(0,"Manish");
		list.add("Sachin");
		list.add("Raj");
		
		ListIterator<String> itr = list.listIterator();
		System.out.println("Iterating in forward direction : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nIterating in backward direction : ");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());

	}

}
}